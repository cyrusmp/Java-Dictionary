import java.util.EnumMap;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class InteractiveDictionary {
    private DictionaryLoader loader;

    public InteractiveDictionary(DictionaryLoader loader) {  //constructor that isntantiates InteractiveDictionary with DictionaryLoader object
        this.loader = loader;
    }

    private void howToMessage() {
        System.out.println("    |");
        System.out.println("     PARAMETER HOW-TO,  please enter:");
        System.out.println("     1. A search key -then 2. An optional part of speech -then");
        System.out.println("     3. An optional 'distinct' -then 4. An optional 'reverse'");
        System.out.println("    |");
    }

    private void notFoundMessage() {
        System.out.println("    |");
        System.out.println(" <NOT FOUND> To be considered for the next release. Thank you.");
        System.out.println("    |");
        System.out.println("    |");
        System.out.println("     PARAMETER HOW-TO,  please enter:");
        System.out.println("     1. A search key -then 2. An optional part of speech -then");
        System.out.println("     3. An optional 'distinct' -then 4. An optional 'reverse'");
    }

    public void invalidParam2(String param2) {
        System.out.println("    |");
        System.out.println(" <The entered 2nd parameter '" + param2 + "' is NOT a part of speech.>");
        System.out.println(" <The entered 2nd parameter '" + param2 + "' is NOT 'distinct'.>");
        System.out.println(" <The entered 2nd parameter '" + param2 + "' is NOT 'reverse'.>");
        System.out.println(" <The entered 2nd parameter '" + param2 + "' was disregarded.>");
        System.out.println(" <The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
        System.out.println("    |");
    }

    public void invalidParam3(String param3) {
        System.out.println("    |");
        System.out.println(" <The entered 3rd parameter '" + param3 + "' is NOT 'distinct'.>");
        System.out.println(" <The entered 3rd parameter '" + param3 + "' is NOT 'reverse'.>");
        System.out.println(" <The entered 3rd parameter '" + param3 + "' was disregarded.>");
        System.out.println(" <The 3rd parameter should be 'distinct' or 'reverse'.>");
        System.out.println("    |");
    }

    public void invalidParam4(String param4) {
        System.out.println("    |");
        System.out.println(" <The entered 4th parameter '" + param4 + "' is NOT 'reverse'.>");
        System.out.println(" <The entered 4th parameter '" + param4 + "' was disregarded.>");
        System.out.println(" <The 4th parameter should be 'reverse'.>");
        System.out.println("    |");

    }


    public void searchBar() {         
        int searches  = 1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Search [" + searches + "]: ");
            String parameters = input.nextLine();
            String[] inputParams = parameters.split("\\s");

            String param1 = inputParams.length > 0 ? inputParams[0] : "";
            String param2 = inputParams.length > 1 ? inputParams[1] : "";
            String param3 = inputParams.length > 2 ? inputParams[2] : "";
            String param4 = inputParams.length > 3 ? inputParams[3] : "";

            if (param1.equalsIgnoreCase("!help") || param1.equals("")) {
                howToMessage();
                searches++;
                continue;  //exits while loop
            }

            if (param1.equalsIgnoreCase("!q")) {
                System.out.println("\n-----THANK YOU-----\n");
                return;  //returns control to user
            }

            boolean putTopLine = false; //a flag used to print top line over definitions
            boolean match = false;  //a flag used to identify if keyword matches
            
            for (EnumMap.Entry<DictionaryTerms, String[][]> entry : loader.getDictionary().entrySet()) {
                String[] keyword = entry.getValue()[0];
                String[] partOfSpeech = entry.getValue()[1];
                String[] definition = entry.getValue()[2];

                
                    
                }

                /*if (keyword.equalsIgnoreCase(param1) && param2.isEmpty() && param3.isEmpty() && param4.isEmpty()) {
                    match = true;
                    if (!putTopLine) {
                        System.out.println("    |");
                        putTopLine = true;
                    }
                    System.out.println(" " + keyword + " [" + partOfSpeech + "] : " + definition);        
                } else if (keyword.equalsIgnoreCase(param1) && partOfSpeech.equalsIgnoreCase(param2)) {
                    match = true;
                    if (!putTopLine) {
                        System.out.println("    |");
                        putTopLine = true;
                    }
                    System.out.println(" " + keyword + " [" + partOfSpeech + "] : " + definition); 
                }*/

            if (!match) {
                notFoundMessage();
            }

            System.out.println("    |");
            searches++;
        }   
    }
}

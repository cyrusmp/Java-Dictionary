import java.util.EnumMap;
import java.util.Scanner;

public class InteractiveDictionary {
    private DictionaryLoader loader;

    public InteractiveDictionary(DictionaryLoader loader) {  //constructor that isntantiates InteractiveDictionary with DictionaryLoader object
        this.loader = loader;
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

            if (param1.equals("!help") || param1.equals("")) {
                System.out.println("    |");
                System.out.println("     PARAMETER HOW-TO,  please enter:");
                System.out.println("     1. A search key -then 2. An optional part of speech -then");
                System.out.println("     3. An optional 'distinct' -then 4. An optional 'reverse'");
                System.out.println("    |");
                searches++;
                continue;  //exits while loop
            }

            if (param1.equalsIgnoreCase("!q")) {
                System.out.println();
                System.out.println("-----THANK YOU-----");
                System.out.println();
                return;  //returns control to user
            }

            boolean putTopLine = false;
            boolean match = false;
            
            for (EnumMap.Entry<DictionaryTerms, String[]> entry : loader.getDictionary().entrySet()) {
                String keyword = entry.getValue()[0];
                String partOfSpeech = entry.getValue()[1];
                String definition = entry.getValue()[2];

                if (keyword.equalsIgnoreCase(param1) && param2.isEmpty() && param3.isEmpty() && param4.isEmpty()) {
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
                }
            }

            if (!match) {
                System.out.println("    |");
                System.out.println(" <NOT FOUND> To be considered for the next release. Thank you.");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("     PARAMETER HOW-TO,  please enter:");
                System.out.println("     1. A search key -then 2. An optional part of speech -then");
                System.out.println("     3. An optional 'distinct' -then 4. An optional 'reverse'");
            }

            System.out.println("    |");
            searches++;
        }   
    }
}

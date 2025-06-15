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
             
            for (String inputs : inputParams ) { 
                if (inputs.equalsIgnoreCase("!q")) { 
                    return;
                } else if (inputs.equalsIgnoreCase("!help") || inputs.equals("")) {
                    System.out.println("    |");
                    System.out.println("     PARAMETER HOW-TO,  please enter:");
                    System.out.println("     1. A search key -then 2. An optional part of speech -then");
                    System.out.println("     3. An optional 'distinct' -then 4. An optional 'reverse'");
                }
            }

            String param1 = inputParams.length > 0 ? inputParams[0] : "";
            String param2 = inputParams.length > 1 ? inputParams[1] : "";
            String param3 = inputParams.length > 2 ? inputParams[2] : "";
            String param4 = inputParams.length > 3 ? inputParams[3] : "";

            boolean putTopLine = false;

            for (EnumMap.Entry<DictionaryTerms, String[]> entry : loader.getDictionary().entrySet()) {
                String keyword = entry.getValue()[0];
                String partOfSpeech = entry.getValue()[1];
                String definition = entry.getValue()[2];

                if (keyword.equalsIgnoreCase(param1)) {

                } else if (!keyword.equalsIgnoreCase(param1)) {

                }
            }

            System.out.println("    |");
            searches++;
        }   
    }
}

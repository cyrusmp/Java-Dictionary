import java.util.Scanner;   //import Scanner class

public class InteractiveDictionary {    //declare publi class
    public void searchBar() {   //declare function searchBar(): takes user input and interprets inputs
        int searches  = 1;  //user searches begins at 1
        Scanner input = new Scanner(System.in); //Scanner object 

        while (true) {  //while this program is true (it will continously loop until it recieves false)
            System.out.print("Search [" + searches + "]: "); //pompt
            String parameters = input.nextLine();   //reads user input of Strings
            String[] inputParams = parameters.split("\\s"); //String array initialized with Strings (split by whitespace)
             
            for (String inputs : inputParams ) {    //for each input of type String, iterate over the String of array of input parameters
                if (inputs.equalsIgnoreCase("!q")) {    //if any input is equal to !q, terminates execution of function
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

            for (DictionaryTerms term : DictionaryTerms.values()) {
                if (term.getKeyword().equalsIgnoreCase(param1)) {
                    if (param2.isEmpty() || term.getPartOfSpeech().equalsIgnoreCase(param2) && param3.isEmpty()) {
                        while(!putTopLine) {
                            System.out.println("    |");
                            putTopLine = true;
                        }
                        System.out.println("     " + "[" + term.getKeyword() + "]" + " " + term.getPartOfSpeech() + " : " + term.getDefinition());
                    } else if (param2.equalsIgnoreCase(term.getPartOfSpeech()) && param3.equalsIgnoreCase("distinct")) {
                        System.out.println("     " + "[" + term.getKeyword() + "]" + " " + term.getPartOfSpeech() + " : " + term.getDefinition());
                    }
                }
            }

            System.out.println("    |");
            searches++;
        }   
    }   ////end of while loop
}   //end of class

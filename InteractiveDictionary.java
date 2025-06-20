import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Collections;

public class InteractiveDictionary {

    //Variable of type DictionaryLoader
    private DictionaryLoader loadedDictionary;

    //Constructor that initializes InteractiveDictionary using type DictionaryLoader
    public InteractiveDictionary(DictionaryLoader loadedDictionary) { 
        this.loadedDictionary = loadedDictionary;
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
        System.out.println("     <The entered 2nd parameter '" + param2 + "' is NOT a part of speech.>");
        System.out.println("     <The entered 2nd parameter '" + param2 + "' is NOT 'distinct'.>");
        System.out.println("     <The entered 2nd parameter '" + param2 + "' is NOT 'reverse'.>");
        System.out.println("     <The entered 2nd parameter '" + param2 + "' was disregarded.>");
        System.out.println("     <The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
        System.out.println("    |");
    }

    public void invalidParam3(String param3) {
        System.out.println("    |");
        System.out.println("     <The entered 3rd parameter '" + param3 + "' is NOT 'distinct'.>");
        System.out.println("     <The entered 3rd parameter '" + param3 + "' is NOT 'reverse'.>");
        System.out.println("     <The entered 3rd parameter '" + param3 + "' was disregarded.>");
        System.out.println("     <The 3rd parameter should be 'distinct' or 'reverse'.>");
        System.out.println("    |");
    }

    public void invalidParam4(String param4) {
        System.out.println("    |");
        System.out.println("     <The entered 4th parameter '" + param4 + "' is NOT 'reverse'.>");
        System.out.println("     <The entered 4th parameter '" + param4 + "' was disregarded.>");
        System.out.println("     <The 4th parameter should be 'reverse'.>");
        System.out.println("    |");
    }

    //Main interactive search loop
    public void searchBar() {         
        int searches  = 1;
        Scanner input = new Scanner(System.in);

        //While loop
        while (true) {
            System.out.print("Search [" + searches + "]: ");
            String parameters = input.nextLine();

            //String array holds input parameters seperated by whitespace
            String[] inputParams = parameters.split("\\s");

            //Checks if length of parameters exceeds four
            if (inputParams.length > 4) {
                howToMessage();
                searches++;
                continue;
            }

            //Assign parameters based on input length 
            String param1 = inputParams.length > 0 ? inputParams[0] : "";
            String param2 = inputParams.length > 1 ? inputParams[1] : "";
            String param3 = inputParams.length > 2 ? inputParams[2] : "";
            String param4 = inputParams.length > 3 ? inputParams[3] : "";

            if (param1.equalsIgnoreCase("!help") || param1.equals("")) {
                howToMessage();
                searches++;
                continue;  //Exits while loop
            }

            if (param1.equalsIgnoreCase("!q")) {
                System.out.println("\n-----THANK YOU-----\n");
                System.exit(0); //Ends program
            }

            //Validates first parameter, checks if keyword exists in the dictionary
            boolean validParam1 = loadedDictionary.getDictionary().values()
            .stream().anyMatch(data -> data[0][0].equalsIgnoreCase(param1));    //Streams data in values to find matching keyword in row 0 column 0
            
            if (!validParam1) {
                notFoundMessage();
                searches++;
                continue;
            }

            //Set holding valid parts of speech
            Set<String> validPartsOfSpeech = Set.of("noun", "verb", "adjective", "adverb", "conjunction", "interjection, preposition", "pronoun");
            String lowerCasedParam2 = param2.toLowerCase();

            //Flags to track optional parameters
            boolean isPartOfSpeech = false;
            boolean isDistinct = false;
            boolean isReverse =false;

            //Validates 2nd parameter
            if (!param2.isEmpty()) {
                if (validPartsOfSpeech.contains(lowerCasedParam2)) {
                    isPartOfSpeech = true;
                } else if (param2.equalsIgnoreCase("distinct")) {
                    isDistinct = true;
                } else if (param2.equalsIgnoreCase("reverse")) {
                    isReverse = true;
                } else {
                    invalidParam2(param2);
                    param2 = "";    //Resets invalid param
                }
            }

            //Validates 3rd parameter
            if (!param3.isEmpty()) {
                if(param3.equalsIgnoreCase("distinct")) {
                    isDistinct = true;
                } else if (param3.equalsIgnoreCase("reverse")) {
                    isReverse = true;   
                } else {
                    invalidParam3(param3);
                    param3 = "";
                }
            }

            //Validates 4th parameter
            if (!param4.isEmpty()) {
                if (param4.equalsIgnoreCase("reverse")) {
                    isReverse = true;
                } else {
                    invalidParam4(param4);
                    param4 = "";    
                }
            }

            //DictionaryTerms type variable with no reference
            DictionaryTerms matchedEntry = null;

            //For each entry of type DictionaryTerms, retrieve keys from loadedDictionary
            for (DictionaryTerms entry : loadedDictionary.getDictionary().keySet()) {
                
                //If keyword matches param1, matchedEntry equals the keyword
                if (entry.getKeyword().equalsIgnoreCase(param1)) {
                    matchedEntry = entry;
                    break;
                }
            }

            //If matchedEntry is not null...
            if (matchedEntry != null) {

                //String array stores parts of speech of keyword
                String[] partsOfSpeech = matchedEntry.getPartOfSpeech();

                //String array stores definitions of keyword
                String[] definitions = matchedEntry.getDefinition();

                //Variable of type List implements new ArrayList
                List<String> filteredDefinitions = new ArrayList<>();
                
                //iterate through length of partsOfSpeech array
                //Add definitions to filteredDefinitions that match part of speech
                for (int i = 0; i < partsOfSpeech.length; i++) {
                    if (!isPartOfSpeech || partsOfSpeech[i].equalsIgnoreCase(param2)) {
                        filteredDefinitions.add(partsOfSpeech[i] + "] : " + definitions[i]);
                    }
                }

                //Set of type string holds unique definitions in a LinkedHashSet implementation
                //Defintiions are placed in an ArrayList and put in filteredDefinitions
                if (isDistinct) {
                    Set<String> uniqueDefinitions = new LinkedHashSet<>(filteredDefinitions);
                    filteredDefinitions = new ArrayList<>(uniqueDefinitions);
                }

                //Reverses contents of filteredDefinitions
                if (isReverse) {
                    Collections.reverse(filteredDefinitions);
                }

                //Prints format
                if (filteredDefinitions.isEmpty()) {
                    notFoundMessage();
                } else {
                    System.out.println("    |");
                    for (String def : filteredDefinitions) {
                        System.out.println("     " + matchedEntry.getKeyword() + " [" + def);
                    }
                    System.out.println("    |");
                }
            }
            searches++; //Increments search until program quits
        }   
    }
}

import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class DictionaryLoader {

    //declare EnumMap data structure titled 'dictionaryMap' -> 
    //Key: DictionaryTerms, Value: 2D array of Strings: [0] keyword, [1] parts of speech, [2] definitions 
    private EnumMap<DictionaryTerms, String[][]> dictionaryMap;

    //constructer to initialize a new EnumMap for storing dictionary entries from DictionaryTerms
    public DictionaryLoader() {                                
        dictionaryMap = new EnumMap<>(DictionaryTerms.class);
    }

    //loads dictionary data from DictionaryTerms enum into the EnumMap
    public void loadDictionary() {
        System.out.println();
        System.out.println("! Loading Data...");

        //iterate through each entry in DictionaryTerms, extract and store its data
        for (DictionaryTerms entry : DictionaryTerms.values()) {

            //2D array with 3 rows to hold data
            String[][] data = new String[3][];
            data[0] = new String[] {entry.getKeyword()};    //row 0
            data[1] = entry.getPartOfSpeech();              //row 1
            data[2] = entry.getDefinition();                //row 2
            
            //store data in the EnumMap
            dictionaryMap.put(entry, data);
        }
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");
    }

    //retrieve the dictionary of type EnumMap with DictionaryTerms as key and 2D String array as value
    public EnumMap<DictionaryTerms, String[][]> getDictionary() {
        return dictionaryMap;
    }

    //counts number of unique keywords
    public void countKeywords() {

        //A set of strings representing keywords is equal to a new HashSet implementation
        Set<String> keywords = new HashSet<>();

        //iterate through every entry of type DictionaryTerms, retrieve its data
        //add keyword from values to set 
        for (DictionaryTerms entry : dictionaryMap.keySet()) {  
            keywords.add(entry.getKeyword());
        }
        int keywordSize = keywords.size();
        System.out.println("----- Keywords: " + keywordSize);
    }

    //counts definitions
    public void countDefinitions() {

        //A list of strings is equal to an ArrayList implementation (can hold duplicate definitions)
        List<String> definitions = new ArrayList<>();

        //iterate through each entry of type DictionaryTerms, retrieve its data
        //add definitions to list
        for (DictionaryTerms entry : DictionaryTerms.values()) {
            for (String definition : entry.getDefinition()) {
                definitions.add(definition);
            }
        }
        int definitionSize = definitions.size();
        System.out.println("----- Definitions: " + definitionSize);
        System.out.println("");
    }

}

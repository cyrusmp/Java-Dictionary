import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class DictionaryLoader {

    //Private instance EnumMap data structure
    //Key: DictionaryTerms type
    //Value: String array containing arrays
    private EnumMap<DictionaryTerms, String[][]> dictionaryMap;

    //Constructer to initialize new EnumMap that stores keys of type DictionaryTerms
    public DictionaryLoader() {                                
        dictionaryMap = new EnumMap<>(DictionaryTerms.class);
    }

    //Loads enum constants into EnumMap
    public void loadDictionary() {
        System.out.println();
        System.out.println("! Loading Data...");

        //For each entry of type DictionaryTerms, interate through its values
        for (DictionaryTerms entry : DictionaryTerms.values()) {

            //2D array with 3 rows to hold data containing fields: keyword, part of speech, deinition
            String[][] data = new String[3][];
            data[0] = new String[] {entry.getKeyword()};    //Adds keywords to a new String array to be held at index 0 of data
            data[1] = entry.getPartOfSpeech();              
            data[2] = entry.getDefinition();                
            
            //Loads data in EnumMap
            dictionaryMap.put(entry, data);
        }
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");
    }

    //Counts number of unique keywords
    public void countKeywords() {

        //Set type variable is equal to a new HashSet implementation
        Set<String> keywords = new HashSet<>();

        //For each entry of type DictionaryTerms, iterate through its keys
        for (DictionaryTerms entry : dictionaryMap.keySet()) {  
            keywords.add(entry.getKeyword());
        }
        int keywordSize = keywords.size();
        System.out.println("----- Keywords: " + keywordSize);
    }

    //Counts definitions
    public void countDefinitions() {

        //List type variable is equal to ArrayList implementation (can hold duplicate definitions)
        List<String> definitions = new ArrayList<>();

        //For each entry of type DictionaryTerms, iterate through its values
        for (DictionaryTerms entry : DictionaryTerms.values()) {
            //For each String value, get Strings definitions
            for (String definition : entry.getDefinition()) {
                definitions.add(definition);
            }
        }
        int definitionSize = definitions.size();
        System.out.println("----- Definitions: " + definitionSize);
        System.out.println("");
    }

        //Retrieves EnumMap
        public EnumMap<DictionaryTerms, String[][]> getDictionary() {
            return dictionaryMap;
        }

}

import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class DictionaryLoader {

    private EnumMap<DictionaryTerms, String[]> dictionaryMap;   //declares a private field dictionaryMap of type EnumMap that maps DictionaryTerms to String array of values     

    public DictionaryLoader() {  //constructor that creates a new object of EnumMap                                   
        dictionaryMap = new EnumMap<>(DictionaryTerms.class);
    }

    public void loadDictionary() {  //function that loads dictionary with values of enum class
        for (DictionaryTerms term : DictionaryTerms.values()) {
            String[] data = new String[] {  //instantiate a new String array that holds the enum values
                term.getKeyword(),
                term.getPartOfSpeech(),
                term.getDefinition()                             
            };
            dictionaryMap.put(term, data);
        }
    }

    public EnumMap<DictionaryTerms, String[]> getDictionary() {  //function that retrives dictionary created in Main (for testing purposes) 
        return dictionaryMap;
    }

    public int countKeywords() {
        Set<String> keywords = new HashSet<>();         //declare 'keywords' of object type Set (interface), that will implement a new HashSet<> (an implementation of Set which holds unique objects)
        for (DictionaryTerms term : dictionaryMap.keySet()) {   //for each dictionaryTerm, iterate over each key     
            keywords.add(term.getKeyword());    //extract keyword using getKeyword() method and add to keywords
        }
        return keywords.size(); //return keyword size
    }

    public int countDefinitions() {
        List<String> definitions = new ArrayList<>();
        for (DictionaryTerms term : DictionaryTerms.values()) {
            String definition = term.getDefinition();
            definitions.add(definition);
        }
        return definitions.size();
    }
}

import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;

public class DictionaryLoader {

    private EnumMap<DictionaryTerms, String[]> dictionaryMap;   //declares a private field dictionaryMap of type EnumMap that maps DictionaryTerms to String array of values     

    public DictionaryLoader() {                                         //public constructor that initializes dictionaryMap with enums from DictionaryTerms class
        dictionaryMap = new EnumMap<>(DictionaryTerms.class);
    }

    public void loadDictionary() {
        for (DictionaryTerms term : DictionaryTerms.values()) {     //for-each term of Dictionary term, iterate over terms values 
            String[] data = new String[] {                          //declare data a new String array that holds the terms values (keyword, part of speech, and definition)
                term.getKeyword(),                                  //zero index in String array is keyword using getKeyword method
                term.getPartOfSpeech(),                             //first index in String array is the part of speech using getPartOfSpeech method
                term.getDefinition()                                //second index  String array is the definition using getDefinition method
            };
            dictionaryMap.put(term, data);                          //loads DictionaryTerm's and thier corresponding data into dictionaryMap
        }
    }

    public int countKeywords() {
        Set<String> keywords = new HashSet<>();         //declare that 'keywords' of Object type Set, that will implement a new HashSet<> (an implementation of Set which holds unique objects)
        for (DictionaryTerms term : dictionaryMap.keySet()) {   //for each dictionaryTerm, iterate over each key     
            keywords.add(term.getKeyword());    //extract keyword using getKeyword() method and add to keywords
        }
        return keywords.size(); //return keyword size
    }
}

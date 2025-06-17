import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class DictionaryLoader {

    private EnumMap<DictionaryTerms, String[][]> dictionaryMap;

    public DictionaryLoader() {                                
        dictionaryMap = new EnumMap<>(DictionaryTerms.class);
    }

    public void loadDictionary() {
        System.out.println();
        System.out.println("! Loading Data...");
        for (DictionaryTerms term : DictionaryTerms.values()) {
            String[][] data = new String[3][];
            data[0] = new String[] {term.getKeyword()};
            data[1] = term.getPartOfSpeech();
            data[2] = term.getDefinition();
            dictionaryMap.put(term, data);
        }
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");
    }

    public EnumMap<DictionaryTerms, String[][]> getDictionary() {
        return dictionaryMap;
    }

    public int countKeywords() {
        Set<String> keywords = new HashSet<>();
        for (DictionaryTerms term : dictionaryMap.keySet()) {  
            keywords.add(term.getKeyword());
        }
        return keywords.size();
    }

    public int countDefinitions() {
        List<String> definitions = new ArrayList<>();
        for (DictionaryTerms term : DictionaryTerms.values()) {
            for (String def : term.getDefinition()) {
                definitions.add(def);
            }
        }
        return definitions.size();
    }

}

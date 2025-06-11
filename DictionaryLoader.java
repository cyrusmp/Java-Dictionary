import java.util.EnumMap;

public class DictionaryLoader {

    private EnumMap<DictionaryTerms, String[]> dictionaryMap; //private enumMap object that holds DictionaryTerms as keys and their corresponding values as a String array of data

    public DictionaryLoader() {
        dictionaryMap = new EnumMap<>(DictionaryTerms.class);
    }

    public void loadDictionary() {
        for (DictionaryTerms term : DictionaryTerms.values()) {
            String[] data = new String[] {
                term.getKeyword(),
                term.getPartOfSpeech(),
                term.getDefinition()
            };
            dictionaryMap.put(term, data);
        }
    }

    public void printDictionary() {
        for (DictionaryTerms term : dictionaryMap.keySet()) {
            String[] data = dictionaryMap.get(term);
            System.out.println(data[0] + data[1] + data[2]);
        }
    }

    public static void main(String[] args) {
        DictionaryLoader loader = new DictionaryLoader();
        loader.loadDictionary();
        loader.printDictionary();
    }


}

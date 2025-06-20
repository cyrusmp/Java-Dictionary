public class Main {
    public static void main(String[] args){
        
        //Calls constructor in DictionaryLoader class to create new DictionaryLoader instance containing EnumMap
        DictionaryLoader dictionary = new DictionaryLoader();
        dictionary.loadDictionary();
        dictionary.countKeywords();
        dictionary.countDefinitions(); 

        //Calls constructor in InteractiveDictionary class to initialize new instance using object of type DictionaryLoader
        InteractiveDictionary start = new InteractiveDictionary(dictionary);  
        start.searchBar(); 
    }
}

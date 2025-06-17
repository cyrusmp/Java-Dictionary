public class Main {
    public static void main(String[] args){
        DictionaryLoader loader = new DictionaryLoader();   //calls constructor in DictionaryLoader class to create new DictionaryLoader object that consists of an EnumMap data structure
        loader.loadDictionary(); //call to loadDictionary function that loads enum constants into EnumMap                        
        loader.countKeywords();
        loader.countDefinitions(); 

        InteractiveDictionary start = new InteractiveDictionary(loader);  //call to instantiate InteractiveDictionary object with contents of DictionaryLoader object
        start.searchBar();  //call to search InteractiveDictionary with loaded dictionary data
    }
}

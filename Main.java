public class Main {
    public static void main(String[] args){
        
        //calls constructor in DictionaryLoader class to create new DictionaryLoader object that consists of an EnumMap data structure
        DictionaryLoader dictionary = new DictionaryLoader();

        //call to loadDictionary method
        dictionary.loadDictionary();
        
        //call to countKeywords method
        dictionary.countKeywords();

        //call to countDefinictions method 
        dictionary.countDefinitions(); 

        //calls constructor in InteractiveDictionary to initialize new object with contents from DictionaryLoader
        InteractiveDictionary start = new InteractiveDictionary(dictionary);  

        //call to searchBar() method that interacts with dictionary contents
        start.searchBar(); 
    }
}

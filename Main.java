public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("! Loading Data...");
        DictionaryLoader loader = new DictionaryLoader();   //calls constructor in DictionaryLoader class to create new DictionaryLoader object that consists of an EnumMap data structure
        loader.loadDictionary(); //call to loadDictionary function that loads enum constants into EnumMap                        
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");

        System.out.println("----- Keywords: " + loader.countKeywords());
        System.out.println("----- Definitions: " + loader.countDefinitions()); 
        System.out.println("");

        InteractiveDictionary start = new InteractiveDictionary(loader);  //call to instantiate InteractiveDictionary object with contents of DictionaryLoader object
        start.searchBar();  //call to search InteractiveDictionary with loaded dictionary data
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("! Loading Data...");
        DictionaryLoader loader = new DictionaryLoader();   //calls constructor in DictionaryLoader class to create new DictionaryLoader object that consists of an EnumMap data structure
        loader.loadDictionary(); //call to loadDictionary function that loads enum constants into EnumMap                        
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");

        int numKeywords = loader.countKeywords();  //call to count number of keywords in EnumMap
        System.out.println("----- Keywords: " + numKeywords);
        int numDefinitions = loader.countDefinitions();  //call to count number of definitions in EnumMap
        System.out.println("----- Definitions: " + numDefinitions); 
        System.out.println("");

        InteractiveDictionary start = new InteractiveDictionary(loader);  //call to instantiate InteractiveDictionary object with contents of DictionaryLoader object
        start.searchBar();  //call to search InteractiveDictionary with loaded dictionary data
    }
}

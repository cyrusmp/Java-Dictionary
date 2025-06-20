/****************************************************************
*
* File: [DictionaryLoader.java]
* By: [Cyrus Molina-Perez]
* Date: [06/19/2025]
*
* Description: [Main class that invokes methods to create, load, and interact with dictionary]
*
****************************************************************/
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

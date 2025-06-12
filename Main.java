public class Main {
    public static void main(String[] args) {
        System.out.println("! Loading Data...");
        DictionaryLoader loader = new DictionaryLoader();
        loader.loadDictionary();                            //calls loadDictionary to input data into loader
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");

        int numKeywords = loader.countKeywords();
        System.out.println("----- Keywords: " + numKeywords);
    }
}

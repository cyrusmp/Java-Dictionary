/****************************************************************
*
* File: [DictionaryTerms.java]
* By: [Cyrus Molina-Perez]
* Date: [06/19/2025]
*
* Description: [An enum class that contains enumeration constant keywords and their associated data, along with a constructor and getter methods]
*
****************************************************************/
public enum DictionaryTerms {
        //Keywords with 3 values: 1 String and 2 String arrays
        //All objects, including arrays, are stored in the heap
        //Array contents of Strings may or may not be in the string pool (Strings created at runtime are not in the string pool unless interned)
        APPLE("Apple", 
                new String[] {"noun", "noun"}, 
                new String[] {"The round fruit of a tree of the rose family.", "The tree which bears apples"}),
        
        ARROW("Arrow", 
                new String[] {"noun"}, 
                new String[] {"Here is one arrow: <IMG> -=>> </IMG>"}),     
        
        BOOK("Book", 
                new String[] {"noun", "noun", "verb", "verb"}, 
                new String[] {"A set of pages", "A written work published in printed or electronic form", "To arrange for someone to have a seat on a plane.", "To arrange something on a particular date."}),
        
        BUTTON("Button", 
                new String[] {"noun", "verb"}, 
                new String[] {"A small disk or knot sewn on to a garment.", "Fasten with buttons."}),
        
        CANDY("Candy", 
                new String[] {"noun", "verb"}, 
                new String[] {"A sweet food made with sugar or other sweetner.", "Preserve by coating and saturating with a sugar syrup."}),
        
        DINOSAUR("Dinosaur", 
                new String[] {"noun", "noun"}, 
                new String[] {"A fossil reptile of the Mesozoic era.", "A person or thing that is outdated."}),
        
        DISTINCT("Distinct", 
                new String[] {"adjective", "adjective", "adverb", "noun", "noun", "noun", "noun", "noun", }, 
                new String[] {"Familar. Worked in Java.", "Unique. No duplicates. Clearly different or of a different kind.", "Uniquely. Written \"distinctly\".", "A keyword in this assignment.", "A keyword in this assignment.","A keyword in this assignment.", "An advanced search option.", "Distinct is a parameter in this assignment."}),
        
        ELEPHANT("Elephant",  
                new String[] {"noun", "noun"}, 
                new String[] {"A heavy plant-eating mammal.", "A size of paper."}),
        
        FROLIC("Frolic", 
                new String[] {"adjective", "noun", "verb"}, 
                new String[] {"Cheerful, merry, or playful.", "A playful action or movement.", "Play and move about cheerfully."}),
        
        GIANT("Giant", 
                new String[] {"adjective", "noun"}, 
                new String[] {"Of a great size or force.", "An imaginary or mythical being of human form but superhuman size."}),
        
        HOT("Hot", 
                new String[] {"adjective", "adjective"}, 
                new String[] {"Containing or consisting of pungent spices.", "Having a high degree of heat."}),
        
        IGLOO("Igloo", 
                new String[] {"noun"}, 
                new String[] {"A type of dome-shaped shelter."}),
        
        JOKER("Joker", 
                new String[] {"noun", "noun"}, 
                new String[] {"A person who is fond of joking.", "A playing card bearing the figure of a jester."}),
        
        KELP("Kelp", 
                new String[] {"noun"}, 
                new String[] {"A large brown seaweed."}),
        
        LAMP("Lamp", 
                new String[] {"noun"}, 
                new String[] {"A device for producing illumination."}),
        
        MAZE("Maze", 
                new String[] {"verb"}, 
                new String[] {"Be dazed or confused."}),
        
        NEVER("Never", 
                new String[] {"adverb"}, 
                new String[] {"At no time in the past or future."}),
        
        PLACEHOLDER("Placeholder", 
                new String[] {"adjective", "adjective", "adverb", "conjunction", "interjection", "noun", "noun", "noun", "preposition", "verb"},
                new String[] {"To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated..."}),
        
        REVERSE("Reverse", 
                new String[] {"adjective", "adjective", "noun", "noun", "noun", "noun", "noun", "noun", "noun", "verb", "verb", "verb", "verb", "verb", "verb"}, 
                new String[] {"On back side.", "Opposite to usual or previous arrangement.", "A dictionary program's parameter.", "Change to opposite direction.", "The opposite.", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "Change something to opposite.", "Go back", "Revoke ruling.", "To be updated...", "To be updated...", "Turn something inside out."});

        private final String keyword;                   //private immutable String to hold each keyword value
        private final String[] partOfSpeech;            //private immutable String array to hold parts of speech
        private final String[] definition;              //private immutable String array to hold definitions

        //Private constructor intitializes fields of enum constant
        //Loads once per constant at class-loading time
        //Cannot be called manually, only enum constants can call it 
        private DictionaryTerms(String keyword, String[] partOfSpeech, String[] definition) {
                this.keyword = keyword;
                this.partOfSpeech = partOfSpeech;
                this.definition = definition;
        }

        //Getter methods, return stored values
        //Retrieves keyword associated with each dictionary entry
        //USE: DictionaryTerms.APPLE.getKeyword();
        public String getKeyword() {
                return keyword;
        }

        //Retrieves String array of parts of speech associated with each dictionary entry
        public String[] getPartOfSpeech() {
                return partOfSpeech;
        }

        //Retrieves String array of definitions associated with each dictionary entry
        public String[] getDefinition() {
                return definition;
        }

}
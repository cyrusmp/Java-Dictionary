public enum DictionaryTerms {
        //enum constants representing dictionary terms -> dictioary entry = (key, value)
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
                new String[] {"A small disk or know sewn on to a garment.", "Fasten with buttons."}),
        
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
                new String[] {"adjective", "adjective", "noun", "noun", "noun", "noun", "noun", "noun", "verb", "verb", "verb", "verb", "verb", "verb"}, 
                new String[] {"On back side.", "Opposite to usual or previous arrangement.", "A dictionary program's parameter.", "Change to opposite direction.", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "Change something to opposite.", "Go back", "Revoke ruling.", "To be updated...", "To be updated...", "Turn something inside out."});

        private final String keyword;                   //String to hold each keyword value
        private final String[] partOfSpeech;            //String array to hold parts of speech
private final String[] definition;                      //String array to hold definitions

        //private constructor for intitializing enum constants with values: keyword, part of speech, and definition
        private DictionaryTerms(String keyword, String[] partOfSpeech, String[] definition) {
                this.keyword = keyword;
                this.partOfSpeech = partOfSpeech;
                this.definition = definition;
        }

        //public method keyword associated with dictionary entry
        public String getKeyword() {
                return keyword;
        }

        //public method returns array of parts of speech associated with dictionary entry
        public String[] getPartOfSpeech() {
                return partOfSpeech;
        }

        //public method returns array of definitions associated with dictionary entry
        public String[] getDefinition() {
                return definition;
        }

}
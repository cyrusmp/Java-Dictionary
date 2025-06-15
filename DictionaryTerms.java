public enum DictionaryTerms {   //enum class representing DictionaryTerms
        APPLE_NOUN_FRUIT("Apple", "noun", "The round fruit of a tree of the rose family."),           //enum constants with three data fields
        APPLE_NOUN_TREE("Apple", "noun", "The tree which bears apples."),
        ARROW_NOUN_HERE("Arrow", "noun", "Here is one arrow: <IMG> -=>> </IMG>"),     
        BOOK_NOUN_SET("Book", "noun", "A set of pages"),
        BOOK_NOUN_WRITTEN("Book","noun","A written work published in printed or electronic form"),
        BOOK_VERB_ARRANGE("Book", "verb", "To arrange for someone to have a seat on a plane."),
        BOOK_VERB_ARRANGE2("Book", "verb", "To arrange something on a particular date."),
        BUTTON_NOUN_DISK("Button", "noun", "A small disk or know sewn on to a garment."),
        BUTTON_VERB_FASTEN("Button", "verb", "Fasten with buttons."),
        CANDY_NOUN_SWEET("Candy", "noun", "A sweet food made with sugar or other sweetner."),
        CANDY_VERB_SWEET("Candy", "verb", "Preserve by coating and saturating with a sugar syrup."),
        DINOSAUR_NOUN_FOSSIL("Dinosaur", "noun", "A fossil reptile of the Mesozoic era."),
        DINOSAUR_NOUN_PERSON("Dinosaur", "noun", "A person or thing that is outdated."),
        DISTINCT_ADJECTIVE_FAMILAR("Distinct", "adjective", "Familar. Worked in Java."),
        DISTINCT_ADJECTIVE_UNIQUE("Distinct", "adjective", "Unique. No duplicates. Clearly different or of a different kind."),
        DISTINCT_ADVERB_UNIQUELY("Distinct", "adverb", "Uniquely. Written \"distinctly\"."),
        DISTINCT_NOUN_KEYWORD("Distinct", "noun", "A keyword in this assignment."),
        DISTINCT_NOUN_KEYWORD2("Distinct", "noun", "A keyword in this assignment."),
        DISTINCT_NOUN_KEYWORD3("Distinct", "noun", "A keyword in this assignment."),
        DISTINCT_NOUN_ADVANCED("Distinct", "noun", "An advanced search option."),
        DISTINCT_NOUN_DISTINCT("Distinct", "noun", "Distinct is a parameter in this assignment."),
        ELEPHANT_NOUN_ANIMAL("Elephant", "noun", "A heavy plant-eating mammal."),
        ELEPHANT_NOUN_PAPER("Elephant", "noun", "A size of paper."),
        FROLIC_VERB_PLAY("Frolic", "verb", "Play and move about cheerfully."),
        FROLIC_NOUN_PLAY("Frolic", "noun", "A playful action or movement."),
        FROLIC_ADJECTIVE_PLAY("Frolic", "adjective", "Cheerful, merry, or playful."),
        GIANT_NOUN_GREAT("Giant", "noun", "An imaginary or mythical being of human form but superhuman size."),
        GIANT_ADJECTIVE_GREAT("Giant", "adjective", "Of a great size or force."),
        HOT_ADJECTIVE_HEAT("Hot", "adjective", "Having a high degree of heat."),
        HOT_ADJECTIVE_FOOD("Hot", "adjective", "Containing or consisting of pungent spices."),
        IGLOO_NOUN_DOME("Igloo", "noun", "A type of dome-shaped shelter."),
        JOKER_NOUN_PERSON("Joker", "noun", "A person who is fond of joking."),
        JOKER_NOUN_CARD("Joker", "noun", "A playing card bearing the figure of a jester."),
        KELP_NOUN_WEED("Kelp", "noun", "A large brown seaweed."),
        LAMP_NOUN_DEVICE("Lamp", "noun", "A device for producing illumination."),
        MAZE_VERB_DAZED("Maze", "verb", "Be dazed or confused."),
        NEVER_ADVERB_NO("Never", "adverb", "At no time in the past or future."),
        PLACEHOLDER_ADJECTIVE_TO("Placeholder", "adjective","To be updated..."),
        PLACEHOLDER_ADJECTIVE_TO2("Placeholder", "adjective","To be updated..."),
        PLACEHOLDER_ADVERB_TO ("Placeholder", "adverb","To be updated..."),
        PLACEHOLDER_CONJUNCTION_TO("Placeholder", "conjunction","To be updated..."),
        PLACEHOLDER_INTERJECTION_TO("Placeholder", "interjection","To be updated..."),
        PLACEHOLDER_NOUN_TO("Placeholder", "noun","To be updated..."),
        PLACEHOLDER_NOUN_TO2("Placeholder", "noun","To be updated..."),
        PLACEHOLDER_NOUN_TO3("Placeholder", "noun","To be updated..."),
        PLACEHOLDER_PREPOSITION_TO("Placeholder", "preposition","To be updated..."),
        PLACEHOLDER_VERB_TO("Placeholder", "verb","To be updated..."),
        REVERSE_ADJECTIVE_ON("Reverse", "adjective", "On back side."),
        REVERSE_ADJECTIVE_OPPOSITE("Reverse", "adjective", "Opposite to usual or previous arrangement."),
        REVERSE_NOUN_DICTIONARY("Reverse", "noun", "A dictionary program's parameter."),
        REVERSE_NOUN_CHANGE("Reverse", "noun", "Change to opposite direction."),
        REVERSE_NOUN_TO("Reverse", "noun", "To be updated..."),
        REVERSE_NOUN_TO2("Reverse", "noun", "To be updated..."),
        REVERSE_NOUN_TO3("Reverse", "noun", "To be updated..."),
        REVERSE_NOUN_TO4("Reverse", "noun", "To be updated..."),
        REVERSE_VERB_CHANGE("Reverse", "verb", "Change something to opposite."),
        REVERSE_VERB_GO("Reverse", "verb", "Go back"),
        REVERSE_VERB_REVOKE("Reverse", "verb", "Revoke ruling."),
        REVERSE_VERB_TO("Reverse", "verb", "To be updated..."),
        REVERSE_VERB_TO2("Reverse", "verb", "To be updated..."),
        REVERSE_VERB_TURN("Reverse", "verb", "Turn something inside out.");

        private final String keyword;           //private final data field representing the keyword
        private final String partOfSpeech;      //private final data field representing the part of speech
        private final String definition;        //private final data field representing the definition

        private DictionaryTerms(String keyword, String partOfSpeech, String definition) {       //private constructor that initializes enum constants
                this.keyword = keyword;
                this.partOfSpeech = partOfSpeech;
                this.definition = definition;
        }

        public String getKeyword() {            //public getter method for keyword
                return keyword;
        }

        public String getPartOfSpeech() {       //public getter method for part of speech
                return partOfSpeech;
        }

        public String getDefinition() {         //public getter method for definition
                return definition;
        }

}
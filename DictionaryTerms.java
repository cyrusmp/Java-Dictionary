public enum DictionaryTerms {   //declare enum Object type DictionaryTerms
        ARROW_NOUN_HERE("Arrow", "[noun]", "Here is one arrow: <IMG> -=>> </IMG>"),     //enum constants with three data fields
        BOOK_NOUN_SET("Book", "[noun]", "A set of pages"),
        BOOK_NOUN_WRITTEN("Book","[noun]","A written work published in printed or electronic form"),
        BOOK_VERB_ARRANGE("Book", "[verb]", "To arrange for someone to have a seat on a plane."),
        BOOK_VERB_ARRANGE2("Book", "[verb]", "To arrange something on a particular date."),
        DISTINCT_ADJECTIVE_FAMILAR("Distinct", "[adjective]", "Familar. Worked in Java."),
        DISTINCT_ADJECTIVE_UNIQUE("Distinct", "[adjective]", "Unique. No duplicates. Clearly different or of a different kind."),
        DISTINCT_ADVERB_UNIQUELY("Distinct", "[adverb]", "Uniquely. Written \"distinctly\"."),
        DISTINCT_NOUN_KEYWORD("Distinct", "[noun]", "A keyword in this assignment."),
        DISTINCT_NOUN_KEYWORD2("Distinct", "[noun]", "A keyword in this assignment."),
        DISTINCT_NOUN_KEYWORD3("Distinct", "[noun]", "A keyword in this assignment."),
        DISTINCT_NOUN_ADVANCED("Distinct", "[noun]", "An advanced search option."),
        DISTINCT_NOUN_DISTINCT("Distinct", "[noun]", "Distinct is a parameter in this assignment."),
        PLACEHOLDER_ADJECTIVE_TO("Placeholder", "[adjective]","To be updated..."),
        PLACEHOLDER_ADJECTIVE_TO2("Placeholder", "[adjective]","To be updated..."),
        PLACEHOLDER_ADVERB_TO ("Placeholder", "[adverb]","To be updated..."),
        PLACEHOLDER_CONJUNCTION_TO("Placeholder", "[conjunction]","To be updated..."),
        PLACEHOLDER_INTERJECTION_TO("Placeholder", "[interjection]","To be updated..."),
        PLACEHOLDER_NOUN_TO("Placeholder", "[noun]","To be updated..."),
        PLACEHOLDER_NOUN_TO2("Placeholder", "[noun]","To be updated..."),
        PLACEHOLDER_NOUN_TO3("Placeholder", "[noun]","To be updated..."),
        PLACEHOLDER_PREPOSITION_TO("Placeholder", "[preposition]","To be updated..."),
        PLACEHOLDER_VERB_TO("Placeholder", "[verb]","To be updated..."),
        REVERSE_ADJECTIVE_ON("Reverse", "[adjective]", "On back side."),
        REVERSE_ADJECTIVE_OPPOSITE("Reverse", "[adjective]", "Opposite to usual or previous arrangement."),
        REVERSE_NOUN_DICTIONARY("Reverse", "[noun]", "A dictionary program's parameter."),
        REVERSE_NOUN_CHANGE("Reverse", "[noun]", "Change to opposite direction."),
        REVERSE_NOUN_TO("Reverse", "[noun]", "To be updated..."),
        REVERSE_NOUN_TO2("Reverse", "[noun]", "To be updated..."),
        REVERSE_NOUN_TO3("Reverse", "[noun]", "To be updated..."),
        REVERSE_NOUN_TO4("Reverse", "[noun]", "To be updated..."),
        REVERSE_VERB_CHANGE("Reverse", "[verb]", "Change something to opposite."),
        REVERSE_VERB_GO("Reverse", "[verb]", "Go back"),
        REVERSE_VERB_REVOKE("Reverse", "[verb]", "Revoke ruling."),
        REVERSE_VERB_TO("Reverse", "[verb]", "To be updated..."),
        REVERSE_VERB_TO2("Reverse", "[verb]", "To be updated..."),
        REVERSE_VERB_TURN("Reverse", "[verb]", "Turn something inside out.");

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
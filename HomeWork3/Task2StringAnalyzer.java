
public class Task2StringAnalyzer {

    private static String sampleString;
    private static String[] words;
    private static Integer minLenIndex;
    private static Integer maxLenIndex;
    private static boolean isFirstRun;

    // splitting by W+ regex doesn't allow to catch non-english words, so non-words are explicitly declared
    private static final String SPLIT_PATTERN = "[,\\s\\.\\?\\-:;!\"']";


    private static void printTheLongestAndShortestWords(){
        if(!isFirstRun) {
            System.out.println("# The shortest word is \"" + words[minLenIndex] + "\"");
            System.out.println("# The longest word is \"" + words[maxLenIndex] + "\"");
        } else {
            System.out.printf("# Sorry, there are no words in your string: %s%nGive yourself another run.", sampleString);
        }
    }

    public static void findAndPrintLongestAndShortestWords(String mySampleString){
        sampleString = mySampleString;

        if (sampleString==null && sampleString.isEmpty()){
            System.out.println("WARN: You don't provide the string. Task will be canceled.");
        }

        words = sampleString.split(SPLIT_PATTERN);

        if (words == null){
            System.out.println("WARN: Your string does not contain words. Task will be canceled.");
        }

        int minLength = 0;
        int maxLength = 0;
        maxLenIndex = 0;
        minLenIndex = 0;
        isFirstRun = true;

        for(int i = 0; i < words.length; i++) {
            if (words[i]!= null && !words[i].isEmpty()){
                System.out.println("\"" + words[i] + "\"");

                if (isFirstRun){
                    minLength = words[i].length();
                    minLenIndex = i;
                    maxLength = minLength;
                    maxLenIndex = minLenIndex;
                    isFirstRun = false;
                }
            } else {
                continue;
            }

            if (words[i].length() < minLength) {
                minLength = words[i].length();
                minLenIndex = i;
            }

            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxLenIndex = i;
            }
        }

        printTheLongestAndShortestWords();
    }

}



public class Task2StringAnalyzer {

    public static void findAndPrintLongestAndShortestWords(String sampleString){
        if (sampleString==null && sampleString.isEmpty()){
            System.out.println("WARN: You don't provide the string. Task will be canceled.");
        }

        // splitting by W+ regex doesn't allow to catch non-english words, so non-words are explicitly declared
        String[] words = sampleString.split("[,\\s\\.\\?\\-:;!\"']"); // using regex literal to denote non-words symbols

        if (words == null){
            System.out.println("WARN: Your string does not contain words. Task will be canceled.");
        }

        int minLenIndex = 0;
        int minLength = 0;
        int maxLenIndex = 0;
        int maxLength = 0;
        boolean isFirstRun = true;

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

        if(!isFirstRun) {
            System.out.println("# The shortest word is \"" + words[minLenIndex] + "\"");
            System.out.println("# The longest word is \"" + words[maxLenIndex] + "\"");
        } else {
            System.out.printf("# Sorry, there are no words in your string: %s%nGive yourself another run.", sampleString);
        }
    }

}



public class Task2StringAnalyzer {

    public static void findAndPrintLongestAndShortestWords(String sampleString){
        if (sampleString==null && sampleString.isEmpty()){
            System.out.println("WARN: You don't provide the string. Task will be canceled.");
        }

        String[] words = sampleString.split("\\W+"); // using regex literal to denote any number of non-words symbols

        if (words == null){
            System.out.println("WARN: Your string does not contain words. Task will be canceled.");
        }

        int minLenIndex = 0;
        int minLength = 0;
        int maxLenIndex = 0;
        int maxLength = 0;

        for(int i = 0; i < words.length; i++) {
            if (words[i]!= null){
                System.out.println("\"" + words[i] + "\"");

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

        System.out.println("# The shortest word is \"" + words[minLenIndex] + "\"" );
        System.out.println("# The longest word is \"" + words[maxLenIndex] + "\"" );
    }

}


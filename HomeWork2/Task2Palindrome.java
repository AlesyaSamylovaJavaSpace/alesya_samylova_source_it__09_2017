
public class Task2Palindrome {

    public static boolean isPalindrome(int num) {
        int revNum = 0;
        int bufVar = num;
        while(bufVar != 0){
            revNum = revNum * 10 + bufVar % 10;
            bufVar/=10;
        }
        return (num == revNum ? true : false);
    }

    public static Integer getFirstOrSecondPalindromeFromArray(int[] numbers){
        int countPal = 0;
        Integer palindromeToPrint = null;

        for (int i = 0; i < numbers.length; i++){
            if (isPalindrome(numbers[i])) {
                countPal++;
                if(countPal == 1) {
                    palindromeToPrint = numbers[i];
                }
            }

            if (countPal == 2){
                palindromeToPrint = numbers[i];
                break;
            }
        }

        return palindromeToPrint;
    }

}

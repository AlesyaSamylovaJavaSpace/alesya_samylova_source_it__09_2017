import java.util.stream.IntStream;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args){
        System.out.println("Homework #2 Demonstration ");

        //Task 1
        int a = 480;
        System.out.println("\n---- Task 1 ----");
        System.out.println("Number = " + a + "; Sum of it digits = " + Task1Sum.getSumOfDigitsFromNumber(a));
        System.out.println("Number = " + a + "; Sum of it digits = " + Task1Sum.getSumOfDigitsFromNumberRecursiveFunc(a));

        //Task2
        int b = 81;
        System.out.println("\n---- Task 2 ----");
        System.out.println(b + " " + (Task2Palindrome.isPalindrome(b) ? "IS" : "ISN'T") + " palindrome");

        int[] arr = {123, 15, 455, 81, 19, 8793978, 13, 11, 15};
        Integer [] arrInt = IntStream.of(arr).boxed().toArray( Integer[]::new );
       // int[] intArray = Arrays.stream(arrInt).mapToInt(Integer::intValue).toArray();
        System.out.println("\nYour array is " + getStringFromArray(arrInt));
        Integer apprPalindrome = Task2Palindrome.getFirstOrSecondPalindromeFromArray(arr);
        System.out.println("Found appropriate palindrome from it: " + apprPalindrome);
        
        //Task3
        int month = 9;
        System.out.println("\n---- Task 3 ----");
        Task3Month.printMonthName(month);

    }

    public static String getStringFromArray(Object[] arr){
        if (arr == null){
            return "null";
        }

        StringBuilder str = new StringBuilder();
        for(Object a: arr){
            str.append("[");
            str.append(a.toString());
            str.append("] ");
        }
        return str.toString();
    }

}

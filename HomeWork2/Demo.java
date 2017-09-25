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

        int[] arr = {123, 15, 455, 81, 19, 8793978, 13, 112 , 15};
        Integer [] arrInt = IntStream.of(arr).boxed().toArray( Integer[]::new );
       // int[] intArray = Arrays.stream(arrInt).mapToInt(Integer::intValue).toArray();
        System.out.println("\nYour array is " + getStringFromArray(arrInt));
        Integer apprPalindrome = Task2Palindrome.getFirstOrSecondPalindromeFromArray(arr);
        System.out.println("Found appropriate palindrome from it: " + apprPalindrome);
        
        //Task3
        int month = 9;
        System.out.println("\n---- Task 3 ----");
        Task3Month.printMonthName(month);

        //Task 4
        System.out.println("\n---- Task 4 ----");
        String algo = "MD5";
        String input = "Spring is coming";
        System.out.println("\n Hash code for (" + input + "; "+ algo + ") is " + Task4Hash.getHashCode(input, algo));

        //Task 6
        System.out.println("\n---- Task 6 ----");
        Integer [][] myMatrix = {{3, 5, 0}, {11, 15, 1}, {6, 7, 8}};
        Task6Max task6 = new Task6Max();
        task6.matrix = myMatrix;
        System.out.println("\nInput matrix:\n" + getString2dMatrix(task6.matrix));

        task6.findMaxElementAndRewriteMatrixWithoutItsRowColumn();
        System.out.println("\nOutput matrix:\n" + getString2dMatrix(task6.matrix));

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

    public static String getString2dMatrix(Object[][] matrix){
        if (matrix == null){
            return "null";
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < matrix.length; i++){
            if(matrix[i] == null){
                str.append("null");
            }

             for (int j = 0; j< matrix[i].length; j++){
                 str.append(matrix[i][j]);
                 str.append(" ");
             }
            str.append("\n");
        }

        return str.toString();
    }

}

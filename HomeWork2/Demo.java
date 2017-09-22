
public class Demo {
    public static void main(String[] args){
        System.out.println("Homework #2 Demonstration ");

        //Task 1
        int a = 480;
        System.out.println("\n---- Task 1 ----");
        System.out.println("Number = " + a + "; Sum of it digits = " + Task1Sum.getSumOfDigitsFromNumber(a));
        System.out.println("Number = " + a + "; Sum of it digits = " + Task1Sum.getSumOfDigitsFromNumberRecursiveFunc(a));

        //Task3
        int month = 9;
        System.out.println("\n---- Task 3 ----");
        Task3Month.printMonthName(month);

    }

}

import java.util.Scanner;

public class DemoClassRoom {

    public static void main(String[] args){

        System.out.println("Would you like to get MyException? (type yes/ no)");
        Scanner myScanner = new Scanner(System.in);
        
        try {
            String answer = myScanner.nextLine().toLowerCase().trim();
            if (answer.equals("yes")) {
                TestClass.doSomething();
            } else if (answer.equals("no")) {
                System.out.println("Your've chosen to not throw MyException");
            } else {
                System.err.println("You've entered the wrong answer!");
            }

            System.out.println("You've got this line because the exception was not thrown");
        } catch (MyException e) {
            System.err.printf("We've caught %1s;%n Message: %2s%n", e.getClass(), e.getMessage());
            System.err.println(e.getStackTrace());
        } catch (Exception e) {
            System.err.printf("General exception: %1s", e.getClass());
        } finally {
            myScanner.close();
            System.out.println("THE END");
        }

    }
}

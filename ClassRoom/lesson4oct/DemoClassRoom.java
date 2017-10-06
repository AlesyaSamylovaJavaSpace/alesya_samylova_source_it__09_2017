package lesson4oct;

import java.util.Scanner;

public class DemoClassRoom {

    public static void main(String[] args){
        do {
            System.out.println("Would you like to get lesson4oct.MyException? (type yes/ no)");
            Scanner myScanner = null;
            TestClass myTestClass = new TestClass();

            try {
                 myScanner = new Scanner(System.in);
                 String answer = myScanner.nextLine().toLowerCase().trim();
                 if (answer.equals("yes")) {
                     myTestClass.doSomething();
                 } else if (answer.equals("no")) {
                     System.out.println("Your've chosen to not throw lesson4oct.MyException");
                 } else {
                     System.err.println("You've entered the wrong answer!");
                 }

                 System.out.println("You've got this line because the exception was not thrown");
             } catch (MyException e) {
                 System.out.printf("--- We've caught %1s;%n Message: %2s%n", e.getClass(), e.getMessage());
                 System.out.println("---" + e.getStackTrace());
             } catch (Exception e) {
                 System.out.printf("General exception: %1s", e.getClass());
             } finally {

                 System.out.println("to continue type \"true\"");
                 if(myScanner.nextLine().toLowerCase().trim().equals("true")){
                     System.out.println();

                 } else {
                     myScanner.close();
                     System.out.println("We say Good Bye to you!");
                     System.out.println("THE END");
                     break;
                 }
             }
         } while(true);

    }
}

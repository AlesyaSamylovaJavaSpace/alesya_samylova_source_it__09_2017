package demo;

import task1.src.Task1Interface;
import task1.src.Task1InterfaceImpl;
import task1.util.ReviewMark;
import task3.MyUtilityClass;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork6Demo {

    public static void main(String[] args) {
        System.out.println("--- Demonstration of Home Work 6: working on Exceptions ---\n");
        showSelectionMenu();
    }

    public static void showSelectionMenu(){
        System.out.println("Select a number of task to be demonstrated. From 1 to 4: ");
        Scanner myScanner = new Scanner(System.in);
        try {
            Integer myTaskNumber = myScanner.nextInt();
            switch (myTaskNumber) {
                case 1:
                    getDemoOfTask1();
                    break;
                case 2:
                /*FALLTHROUGH*/
                case 3:
                    getDemoOfTasks2And3();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("There is no task number " + myTaskNumber);
            }
        } catch (InputMismatchException ex){
            System.out.println("You should have entered the integer value!!!");
        } finally {
            myScanner.close();
        }
    }

    public static void getDemoOfTask1(){
        System.out.println("--- Task 1: DBException vs Runtime");
        Task1Interface myTask1 = new Task1InterfaceImpl();

        try {
            System.out.println("Score: " + myTask1.getScoreFromReviewComment(ReviewMark.BAD));
            System.out.println(myTask1.getHelloMessage("Jabe"));

            System.out.println("Score: " + myTask1.getScoreFromReviewComment(null));

        } catch (Exception e) {
            System.out.println("EXCEPTION: " +  e.getMessage());
        } finally {
            try {
                System.out.println(myTask1.getHelloMessage(null));
            } catch (Exception e) {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
        }
    }

    public static void getDemoOfTasks2And3(){
        System.out.println("--- Tasks 2 and 3: Custom Exceptions. Handling exceptions inside utility class");
        MyUtilityClass <String> myUtilityClassString = new MyUtilityClass<String>();
        String[] myStringArray1 = {"Hello", "Hi", "Holla", "Bonjurno"};
        String[] myStringArray2 = null;
        Integer[] indexes = {2, 5, 3};
        System.out.println("Testing of method 1: get element of array by its index");
        System.out.println("1) Get element by index = " + indexes[0] + " from array = " + Arrays.toString(myStringArray1));
        System.out.println(" Element is " + myUtilityClassString.getElementByIndex(myStringArray1, indexes[0]));
        System.out.println("2) Get element by index = " + indexes[1] + " from array = " + Arrays.toString(myStringArray1));
        System.out.println(" Element is " + myUtilityClassString.getElementByIndex(myStringArray1, indexes[1]));
        System.out.println("3) Get element by index = " + indexes[2] + " from array = " + Arrays.toString(myStringArray2));
        System.out.println(" Element is " + myUtilityClassString.getElementByIndex(null, indexes[2]));

        System.out.println("\nTesting of method 2: get element of array by its index");
        String myStr1 = "56 Str";
        String myStr2 = "56.16D";
        Integer myInt = myUtilityClassString.convertStringToInteger(myStr1);
        System.out.println("String \"" + myStr1 + "\"" + ((myInt != null) ? " was ":" wasn't ") + "converted to Integer");

        System.out.println("\nTesting of methods 3 and 4: throwing custom unchecked vs checked exceptions");
        try {
            myUtilityClassString.obtainMyUncheckedException();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        } finally {
            try {
                myUtilityClassString.obtainMyCheckedException();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                System.out.println("\nTesting of method 5: processing Illegal Resource Exception");
                try {
                    myUtilityClassString.processIllegalResourceException();
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    System.out.println("\nTesting of method 6: Convert form Object to Double");
                    Object myObject = new Object();
                    Double myDouble =myUtilityClassString.convertObjectToDouble(myObject);
                    System.out.println("Object \"" + myObject.toString() + "\"" + ((myDouble != null) ? " was ":" wasn't ") + "converted to Double");

                    myDouble =myUtilityClassString.convertObjectToDouble(myStr1);
                    System.out.println("String \"" + myStr1 + "\"" + ((myDouble != null) ? " was ":" wasn't ") + "converted to Double");

                    myDouble =myUtilityClassString.convertObjectToDouble(myStr2);
                    System.out.println("String \"" + myStr2 + "\"" + ((myDouble != null) ? " was ":" wasn't ") + "converted to Double");
                }
            }
        }
    }
}

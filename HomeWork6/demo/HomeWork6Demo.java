package demo;

import task1.src.Task1Interface;
import task1.src.Task1InterfaceImpl;
import task1.util.ReviewMark;
import task3.MyUtilityClass;

import java.util.Arrays;

public class HomeWork6Demo {
    public static void main(String[] args) {
        System.out.println("--- Demonstration of Home Work 6: working on Exceptions ---\n");


        System.out.println("--- Tasks 2 and 3: Custom Exceptions. Handling exceptions inside utility class");
        MyUtilityClass <String> myUtilityClassString = new MyUtilityClass<String>();
        String[] myStringArray1 = {"Hello", "Hi", "Holla", "Bonjurno"};
        String[] myStringArray2 = null;
        Integer[] indexes = {2, 5, 3};
        System.out.println("1) Get element by index = " + indexes[0] + " from array = " + Arrays.toString(myStringArray1));
        System.out.println(" Element is " + myUtilityClassString.getElementByIndex(myStringArray1, indexes[0]));
        System.out.println("2) Get element by index = " + indexes[1] + " from array = " + Arrays.toString(myStringArray1));
        System.out.println(" Element is " + myUtilityClassString.getElementByIndex(myStringArray1, indexes[1]));
        System.out.println("3) Get element by index = " + indexes[2] + " from array = " + Arrays.toString(myStringArray2));
        System.out.println(" Element is " + myUtilityClassString.getElementByIndex(null, indexes[2]));

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
}

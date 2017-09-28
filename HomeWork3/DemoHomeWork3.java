import inheritance.people.Person;
import java.util.Scanner;
import java.io.Console;

public class DemoHomeWork3 {

    public static void setParam(int param1, int param2){

    }

//    public static final void testMethod(Integer k){
//        k=100000000;
//    }

//    public static void setParam(int param3, int param6) {
//
//    }

    public static void main(String[] args){
        //  Task 1
        Person myPerson1 = new Person();

        // Task2
        String sampleString;
        Scanner myInputReader = new Scanner(System.in);
        System.out.println("---- Demonstration of Home Work 3 ----");
        System.out.println("\n---- Task 2 ----\nDescription: Finding words with min and max lengths in the string");
        System.out.print("Write a string below: \n> ");
        sampleString = myInputReader.nextLine();
        System.out.println("You entered the following string: \"" + sampleString + "\"");
        Task2StringAnalyzer.findAndPrintLongestAndShortestWords(sampleString);
    }
}


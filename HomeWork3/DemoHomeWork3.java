import inheritance.people.Person;
import task1.impl.PersonListImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.Console;

public class DemoHomeWork3 {

    public static void setParam(int param1, int param2){

    }


    public static void main(String[] args){

        System.out.println("---- Demonstration of Home Work 3 ----");
        System.out.println("\n---- Task 1 ----\nDescription: Implementation of List via array");
        Person myPerson1 = new Person("Kate", "Aristinova", "Robertovna");
        Person myPerson2 = new Person("Anna-Maria", "Loboda", "Victorovna");
        Person myPerson3 = new Person("Bill", "Turov", "Alexeyev");

        PersonListImpl myListOfPersons = new PersonListImpl();
        System.out.printf("myListOfPersons is created: %s%n", Arrays.toString(myListOfPersons.toArray()));

        System.out.printf(" Check myListOfPersons if it is empty: %b%n Size: %s%n", myListOfPersons.isEmpty(), myListOfPersons.size());
        myListOfPersons.add(myPerson1);
        myPerson1.setName("Jane");
        myListOfPersons.add(myPerson1);
        myListOfPersons.add(myPerson2);
        myListOfPersons.add(myPerson1);

        System.out.printf("%nAfter addition of some elements %nmyListOfPersons: %s %n",
                Arrays.toString(myListOfPersons.toArray()));

        System.out.printf("Check myListOfPersons if it is empty: %b%n Size: %s%n",
                           myListOfPersons.isEmpty(),
                           myListOfPersons.size());
        System.out.printf(" If it contains element %1$s: %2$b%n",
                myPerson2.toString(),
                myListOfPersons.contains(myPerson2));
        System.out.printf(" If it contains element %1$s: %2$b%n",
                myPerson3.toString(),
                myListOfPersons.contains(myPerson3));

        System.out.printf(" Index of %1$s is %2$d %n", myPerson3.toString(), myListOfPersons.indexOf(myPerson3));
        System.out.printf(" Index of %1$s is %2$d %n", myPerson1.toString(), myListOfPersons.indexOf(myPerson1));
        System.out.printf(" Last Index of %1$s is %2$d %n", myPerson1.toString(), myListOfPersons.lastIndexOf(myPerson1));

        myListOfPersons.add(1, myPerson3);
        System.out.printf("myListOfPersons after insertion: %s%n", Arrays.toString(myListOfPersons.toArray()));

        myListOfPersons.remove(myPerson1);
        System.out.printf("myListOfPersons after deletion of object: %s%n", Arrays.toString(myListOfPersons.toArray()));

        myListOfPersons.remove(3);
        System.out.printf("myListOfPersons after deletion by index: %s%n", Arrays.toString(myListOfPersons.toArray()));

        myListOfPersons.clear();
        System.out.printf("myListOfPersons after clear: %s%n", Arrays.toString(myListOfPersons.toArray()));


        // Task2
        String sampleString;
        Scanner myInputReader = new Scanner(System.in);

        System.out.println("\n---- Task 2 ----\nDescription: Finding words with min and max lengths in the string");
        System.out.print("Write a string below: \n> ");
        sampleString = myInputReader.nextLine();
        System.out.println("You entered the following string: \"" + sampleString + "\"");
        Task2StringAnalyzer.findAndPrintLongestAndShortestWords(sampleString);
    }
}


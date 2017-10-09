package demo;

import characters.Hero;
import characters.Minion;
import characters.Smurf;
import inheritance.people.Person;
import task1.StoryTeller;
import task2.StoryTellerFactory;
import task3.AbstractFactory;
import task3.FactoryProducer;
import task3.PersonFactory;

import java.util.Scanner;


public class DemoHomeWork5 {
    public static void main(String[] args){
        System.out.println("--- Demonstration of Home Work 5 ---\n");
        System.out.println("Select a number of task to be shown. From 1 to 4: ");
        Scanner myScanner = null;
        try {
            myScanner = new Scanner(System.in);
            int choice = myScanner.nextInt();

            switch (choice) {
                case 1:
                    getTask1Demo();
                    break;
                case 2:
                    getTask2AboutFactoryDemo();
                    break;
                case 3:
                    getTask3AboutAbstractFactoryDemo();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("There is no such task number.");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            myScanner.close();
        }


    }

    public static void getTask1Demo() {
        System.out.println("--- Task 1: Implementation of interface ---\n");
        StoryTeller superman1 = new Hero("Supeman", 12, 1, 1980);
        StoryTeller minion1 = new Minion("Luke");
        StoryTeller smurf1 = new Smurf();

        StoryTeller[] myCharacters = {superman1, minion1, smurf1};

        for(StoryTeller teller: myCharacters){
            System.out.println("Mood: " + teller.getCurrentMood());
            teller.tellAboutYourself();
        }
    }

    public static void getTask2AboutFactoryDemo(){
        System.out.println("--- Task 2: Factory class to create different type objects ---\n");

        StoryTellerFactory myStoryTellerFactory = new StoryTellerFactory();

        StoryTeller storyTeller1 = myStoryTellerFactory.getStoryTeller("HERO");
        storyTeller1.tellAboutYourself();

        StoryTeller storyTeller2 = myStoryTellerFactory.getStoryTeller("SMURF");
        storyTeller2.tellAboutYourself();

        StoryTeller storyTeller3 = myStoryTellerFactory.getStoryTeller("MINION");
        storyTeller3.tellAboutYourself();
    }

    public static void getDemoOfPersonFactory(){
        PersonFactory myPersonFactory = new PersonFactory();

        Person person1 = myPersonFactory.getPerson("EMPLOYEE");
        System.out.println(person1.getClass());

        Person person2 = myPersonFactory.getPerson("CUSTOMER");
        System.out.println(person2.getClass());

        Person person3 = myPersonFactory.getPerson("PERSON");
        System.out.println(person3.getClass());
    }

    public static void getTask3AboutAbstractFactoryDemo(){
        System.out.println("--- Task 3: Abstract Factory/ Factory Producer  ---\n");

        AbstractFactory myPersonFactory = FactoryProducer.getFactory("PERSON");
        Person person1 = myPersonFactory.getPerson("CUSTOMER");
        System.out.println(person1.getClass());
        Person person2 = myPersonFactory.getPerson("EMPLOYEE");
        System.out.println(person2.getClass());

        AbstractFactory myStoryTellerFactory = FactoryProducer.getFactory("STORYTELLER");
        StoryTeller st1 = myStoryTellerFactory.getStoryTeller("MINION");
        st1.tellAboutYourself();
        StoryTeller st2 = myStoryTellerFactory.getStoryTeller("SMURF");
        st2.tellAboutYourself();
    }
}

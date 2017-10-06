package demostration;

import characters.Character;
import characters.*;
import utils.mytypes.Gender;
import utils.other.CharacterClassifier;

public class DemoHomeWork4 {
    public static void main(String[] args){
        System.out.println("--- Demonstration of HomeWork 4 ---");

        Character myCharacter1 = new Character("IT", 13, 1, 1900);
        Character superMan1 = new Hero("Superman");
        Character wonderWoman1 = new Hero("Wonder Woman", Gender.FEMALE, 1.75, 55d);
        Character minion1 = new Minion();
        Character smurf1 = new Smurf();

        System.out.println("-- START of: Call of common methods --");

        System.out.println(myCharacter1.saySomethingAboutYourself()+ "\n");
        System.out.println(wonderWoman1.saySomethingAboutYourself() + "\n");
        System.out.println(superMan1.saySomethingAboutYourself() + "\n");
        System.out.println(minion1.saySomethingAboutYourself() + "\n");
        System.out.println(smurf1.saySomethingAboutYourself() + "\n");

        System.out.printf("BMI of %s is %.2f. It is %s %n", wonderWoman1.getName(),
                           wonderWoman1.calculateAndGetBMI(), wonderWoman1.getBMICategory());
        System.out.printf("%nBMI of %s is %.2f. It is %s %n", superMan1.getName(),
                           superMan1.calculateAndGetBMI(), superMan1.getBMICategory());
        System.out.printf("%nBMI of %s is %.2f. It is %s %n", minion1.getName(),
                           minion1.calculateAndGetBMI(), minion1.getBMICategory());
        System.out.printf("%nBMI of %s is %.2f. It is %s %n", smurf1.getName(),
                           smurf1.calculateAndGetBMI(), smurf1.getBMICategory());

        System.out.println("\nAge of " + myCharacter1.getName() + " is " + myCharacter1.getAge());
        System.out.println("-- END of: Call of common methods --\n");

        System.out.println("-- START of: Call of children methods --");

        //Note: We don't create new object, we just use the reference
        Hero superMan1_hero = (Hero) superMan1;
        superMan1_hero.setRealName("Clark");
        superMan1_hero.setRealSurname("Kent");
        System.out.println("The real name of " + superMan1_hero.getName() + " is " + superMan1_hero.getRealName() +
                           " " + superMan1_hero.getRealSurname());

        Minion minion1_minion = (Minion) minion1;
        minion1_minion.setNumberOfEyes(1);
        System.out.println(minion1_minion.getClass() + " " + minion1_minion.getName() + " loves " +
                           minion1_minion.getFavouriteFood() + " and " + minion1_minion.getHobby() + ". He has " +
                           minion1_minion.getNumberOfEyes() + " eye(s) and his amount of hair on the head is " +
                           minion1_minion.getNumberOfHairsOnTheHead());

        System.out.println("Total Numbers of heroes: " + Hero.getNumberOfHeroes());
        System.out.println("Total Numbers of minions: " + Minion.getNumberOfMinions());
        System.out.println("Total Numbers of smurfs: " + Smurf.getNumberOfSmurfs());

        System.out.println("-- END of: Call of children methods --");

        System.out.println("-- START of: Identification of object Type --");

        System.out.println("For object superMan1: ");
        CharacterClassifier.printTypeOfObjectBasedOnParent(superMan1);
        System.out.println();

        System.out.println("For object myCharacter1: ");
        CharacterClassifier.printTypeOfObjectBasedOnParent(myCharacter1);
        System.out.println();

        System.out.println("For object smurf1: ");
        CharacterClassifier.printTypeOfObjectBasedOnParent(smurf1);
        System.out.println();

        System.out.println("For object minion1: ");
        CharacterClassifier.printTypeOfObjectBasedOnParent(minion1);
        System.out.println();
        System.out.println("-- END of: Identification of object Type --");
    }
}

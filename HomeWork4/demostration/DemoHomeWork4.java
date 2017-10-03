package demostration;

import characters.Character;
import characters.*;
import utils.other.CharacterClassifier;

public class DemoHomeWork4 {
    public static void main(String[] args){
        System.out.println("--- Demonstration of HomeWork 4 ---");

        Character myCharacter1 = new Character();
        Character superMan1 = new Hero();
        Character minion1 = new Minion();
        Character smurf1 = new Smurf();

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

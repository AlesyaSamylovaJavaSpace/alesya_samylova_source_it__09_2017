package utils.other;

import characters.Character;
import characters.Hero;
import characters.Minion;
import characters.Smurf;

public final class CharacterClassifier {
    public static void printTypeOfObjectBasedOnParent(Object obj) {
        String typeOfObject = "Object";

        if (obj instanceof Hero){
            typeOfObject = "Hero";
        } else if (obj instanceof Minion) {
            typeOfObject = "Minion";
        } else if (obj instanceof Smurf) {
            typeOfObject = "Smurf";
        } else if (obj instanceof Character) {
            typeOfObject = "Character";
        }

        System.out.println(" Type of your object is \"" + typeOfObject + "\"");
    }
}

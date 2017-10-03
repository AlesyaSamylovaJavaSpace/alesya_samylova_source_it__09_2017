package characters;

import utils.mytypes.Color;
import utils.mytypes.HobbyType;

public class Minion extends Character {
    public static final Color DEFAULT_COLOR = Color.YELLOW;
    public static final String FAVOURITE_FOOD_BY_DEFAULT = "BANANAS";
    public static final int DEFAULT_NUMBER_OF_EYES = 2;
    public static final int DEFAULT_NUMBER_OF_HAIRS_ON_THE_HEAD = 0;

    public static String ownerName;
    private static Integer numberOfMinions;

    private Color color;
    private int numberOfEyes = 2;
    private int numberOfHairsOnTheHead = 0;
    private String favouriteFood;
    private String garment;
    private HobbyType hobby;

    public HobbyType getHobby() {
        return hobby;
    }

    public void setHobby(HobbyType hobby) {
        this.hobby = hobby;
    }

    public static String getFavouriteFoodByDefault() {
        return FAVOURITE_FOOD_BY_DEFAULT;
    }

    public static int getDefaultNumberOfEyes() {
        return DEFAULT_NUMBER_OF_EYES;
    }

    public static int getDefaultNumberOfHairsOnTheHead() {
        return DEFAULT_NUMBER_OF_HAIRS_ON_THE_HEAD;
    }

    public static String getOwnerName() {
        return ownerName;
    }

    public static void setOwnerName(String ownerName) {
        Minion.ownerName = ownerName;
    }

    public static Integer getNumberOfMinions() {
        return numberOfMinions;
    }

    public static void setNumberOfMinions(Integer numberOfMinions) {
        Minion.numberOfMinions = numberOfMinions;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfHairsOnTheHead() {
        return numberOfHairsOnTheHead;
    }

    public void setNumberOfHairsOnTheHead(int numberOfHairsOnTheHead) {
        this.numberOfHairsOnTheHead = numberOfHairsOnTheHead;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getGarment() {
        return garment;
    }

    public void setGarment(String garment) {
        this.garment = garment;
    }

    public static Color getDefaultColor() {
        return DEFAULT_COLOR;
    }

}

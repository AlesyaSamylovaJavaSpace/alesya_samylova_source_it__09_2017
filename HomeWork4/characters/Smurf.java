package characters;

import utils.mytypes.Color;
import utils.mytypes.HobbyType;

public class Smurf extends Character {
    public static final Color DEFAULT_COLOR = Color.BLUE;
    public static final String FAVOURITE_FOOD_BY_DEFAULT = "SMURFBERRIES";
    public static final String FAVOURITE_WORD_BY_DEFAULT = "SMURF";

    private static int numberOfSmurfs;

    private HobbyType featureOfSmurf;
    private String favouriteFood;
    private String favouriteWord;

    public String getFavouriteWord() {
        return favouriteWord;
    }

    public void setFavouriteWord(String favouriteWord) {
        this.favouriteWord = favouriteWord;
    }

    public static String getFavouriteFoodByDefault() {
        return FAVOURITE_FOOD_BY_DEFAULT;
    }

    public static String getFavouriteWordByDefault() {
        return FAVOURITE_WORD_BY_DEFAULT;
    }

    public static int getNumberOfSmurfs() {
        return numberOfSmurfs;
    }

    public static void setNumberOfSmurfs(int numberOfSmurfs) {
        Smurf.numberOfSmurfs = numberOfSmurfs;
    }

    public HobbyType getFeatureOfSmurf() {
        return featureOfSmurf;
    }

    public void setFeatureOfSmurf(HobbyType featureOfSmurf) {
        this.featureOfSmurf = featureOfSmurf;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public static Color getDefaultColor() {
        return DEFAULT_COLOR;
    }
}

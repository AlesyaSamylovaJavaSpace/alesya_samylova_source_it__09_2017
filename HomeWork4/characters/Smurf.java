package characters;

import utils.mytypes.*;

public class Smurf extends Character {
    public static final Color DEFAULT_COLOR = Color.BLUE;
    public static final String FAVOURITE_FOOD_BY_DEFAULT = "SMURFBERRIES";
    public static final String FAVOURITE_WORD_BY_DEFAULT = "SMURF";
    public static String defaultName = "Harmony Smurf";
    public static HobbyType defaultHobby = HobbyType.SINGING;


    private static final Double DEFAULT_HEIGHT = 9.0;
    private static final Double DEFAULT_WEIGHT = 0.5;
    private static final HeightUnit DEFAULT_UNIT_OF_HEIGHT = HeightUnit.CM;
    private static final WeightUnit DEFAULT_UNIT_OF_WEIGHT = WeightUnit.KG;
    private static Gender DEFAULT_GENDER = Gender.MALE;


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

    public static Gender getDefaultGender() {
        return DEFAULT_GENDER;
    }

    public static void setDefaultGender(Gender defaultGender) {
        DEFAULT_GENDER = defaultGender;
    }

    public static Double getDefaultWeight() {
        return DEFAULT_WEIGHT;
    }

    public static HeightUnit getDefaultUnitOfHeight() {
        return DEFAULT_UNIT_OF_HEIGHT;
    }

    public static WeightUnit getDefaultUnitOfWeight() {
        return DEFAULT_UNIT_OF_WEIGHT;
    }

    public static Double getDefaultHeight() {
        return DEFAULT_HEIGHT;
    }
}

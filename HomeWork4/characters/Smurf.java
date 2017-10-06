package characters;

import utils.mytypes.*;

import java.text.MessageFormat;
import java.time.LocalDate;

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


    private static int numberOfSmurfs = 0;
    private Color color;
    private HobbyType featureOfSmurf;
    private String favouriteFood;
    private String favouriteWord;

    public Smurf() {
        this(defaultName);
    }

    public Smurf(String name) {
        super(name, DEFAULT_GENDER, DEFAULT_HEIGHT, DEFAULT_HEIGHT);
        this.color = DEFAULT_COLOR;
        this.featureOfSmurf = defaultHobby;
        this.favouriteFood = FAVOURITE_FOOD_BY_DEFAULT;
        this.favouriteWord = FAVOURITE_WORD_BY_DEFAULT;
        numberOfSmurfs++;
    }

    public Smurf(HobbyType featureOfSmurf, String favouriteFood, String favouriteWord) {
        this(defaultName, featureOfSmurf, favouriteFood, favouriteWord);
    }

    public Smurf(String name, HobbyType featureOfSmurf, String favouriteFood, String favouriteWord) {
        this(name);
        this.featureOfSmurf = featureOfSmurf;
        this.favouriteFood = favouriteFood;
        this.favouriteWord = favouriteWord;
    }

    public Smurf(String name, Gender gender, Double height, Double weight,
                 HobbyType featureOfSmurf, String favouriteFood, String favouriteWord) {
        super(name, gender, height, weight);
        this.color = DEFAULT_COLOR;
        this.featureOfSmurf = featureOfSmurf;
        this.favouriteFood = favouriteFood;
        this.favouriteWord = favouriteWord;
        numberOfSmurfs++;
    }

    public Smurf(String name, LocalDate birthdayDate, Gender gender, Double height, Double weight,
                 HobbyType featureOfSmurf, String favouriteFood, String favouriteWord) {
        super(name, birthdayDate, gender, height, weight);
        this.color = DEFAULT_COLOR;
        this.featureOfSmurf = featureOfSmurf;
        this.favouriteFood = favouriteFood;
        this.favouriteWord = favouriteWord;
        numberOfSmurfs++;
    }

    public Smurf(String name, int birthdayDay, int birthdayMonth, int birthdayYear, Gender gender, Double height,
                 Double weight, HobbyType featureOfSmurf, String favouriteFood, String favouriteWord) {
        super(name, birthdayDay, birthdayMonth, birthdayYear, gender, height, weight);
        this.color = DEFAULT_COLOR;
        this.featureOfSmurf = featureOfSmurf;
        this.favouriteFood = favouriteFood;
        this.favouriteWord = favouriteWord;
        numberOfSmurfs++;
    }

    public Smurf(String name, int birthdayDay, int birthdayMonth, int birthdayYear, HobbyType featureOfSmurf,
                 String favouriteFood, String favouriteWord){
        super(name, birthdayDay, birthdayMonth, birthdayYear, DEFAULT_GENDER, DEFAULT_HEIGHT, DEFAULT_WEIGHT);
        this.color = DEFAULT_COLOR;
        this.featureOfSmurf = featureOfSmurf;
        this.favouriteFood = favouriteFood;
        this.favouriteWord = favouriteWord;
        numberOfSmurfs++;
    }

    @Override
    public void setWeight(Double weight) {
        if(checkWeight(weight) && (weight<DEFAULT_WEIGHT*100)){
            this.weight = weight;
        }
    }

    @Override
    public void setHeight(Double height) {
        if(checkHeight(height) && (height<DEFAULT_HEIGHT*100)){
            this.height = height;
        }
    }

    @Override
    public String saySomethingAboutYourself() {
        return MessageFormat.format("Smurfurno! I am a smurf. Others call me {0}", this.name);
    }

    @Override
    public Double calculateAndGetBMI() {
        if (this.weight != null && this.height != null) {
            bmi = weight*100/ (height * height) + 8;
            CategorizeByBMI();
            return bmi;
        }
        return null;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

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

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        numberOfSmurfs++;
        return super.clone();
    }

}

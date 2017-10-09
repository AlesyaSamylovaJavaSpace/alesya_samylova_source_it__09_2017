package characters;

import task1.StoryTeller;
import utils.mytypes.*;

import java.text.MessageFormat;
import java.time.LocalDate;

public class Minion extends Character implements StoryTeller {
    public static final Color DEFAULT_COLOR = Color.YELLOW;
    public static final String FAVOURITE_FOOD_BY_DEFAULT = "BANANAS";
    public static final int DEFAULT_NUMBER_OF_EYES = 2;
    public static final int DEFAULT_NUMBER_OF_HAIRS_ON_THE_HEAD = 0;
    public static final String DEFAULT_GARMENT = "OVERALL";
    public static final HobbyType DEFAULT_HOBBY = HobbyType.DANCING;

    private static final Double DEFAULT_HEIGHT = 105.0;
    private static final Double DEFAULT_WEIGHT = 10.0;
    private static final HeightUnit DEFAULT_UNIT_OF_HEIGHT = HeightUnit.CM;
    private static final WeightUnit DEFAULT_UNIT_OF_WEIGHT = WeightUnit.KG;
    private static Gender DEFAULT_GENDER = Gender.TRANSGENDER;

    public static String ownerName;
    public static String defaultName = "Kevin";
    private static Integer numberOfMinions = 0;

    private Color color;
    private int numberOfEyes = 2;
    private int numberOfHairsOnTheHead = 0;
    private String favouriteFood;
    private String garment = DEFAULT_GARMENT;
    private HobbyType hobby;

    public Minion() {
        this(defaultName);
    }

    public Minion (String name){
        super(name, DEFAULT_GENDER, DEFAULT_HEIGHT, DEFAULT_HEIGHT);
        this.color = DEFAULT_COLOR;
        this.numberOfEyes = DEFAULT_NUMBER_OF_EYES;
        this.numberOfHairsOnTheHead = DEFAULT_NUMBER_OF_HAIRS_ON_THE_HEAD;
        this.favouriteFood = FAVOURITE_FOOD_BY_DEFAULT;
        this.garment = DEFAULT_GARMENT;
        this.hobby = DEFAULT_HOBBY;
        numberOfMinions++;
    }

    public Minion(Color color, int numberOfEyes, int numberOfHairsOnTheHead, String favouriteFood, String garment, HobbyType hobby) {
        super(defaultName, DEFAULT_GENDER, DEFAULT_HEIGHT, DEFAULT_WEIGHT);
        this.color = color;
        this.numberOfEyes = numberOfEyes;
        this.numberOfHairsOnTheHead = numberOfHairsOnTheHead;
        this.favouriteFood = favouriteFood;
        this.garment = garment;
        this.hobby = hobby;
        numberOfMinions++;
    }

    public Minion(String name, Gender gender, Double height, Double weight, Color color, int numberOfEyes,
                  int numberOfHairsOnTheHead, String favouriteFood, String garment, HobbyType hobby) {
        super(name, gender, height, weight);
        this.color = color;
        this.numberOfEyes = numberOfEyes;
        this.numberOfHairsOnTheHead = numberOfHairsOnTheHead;
        this.favouriteFood = favouriteFood;
        this.garment = garment;
        this.hobby = hobby;
        numberOfMinions++;
    }

    public Minion(String name, LocalDate birthdayDate, Gender gender, Double height, Double weight,
                  Color color, int numberOfEyes, int numberOfHairsOnTheHead, String favouriteFood,
                  String garment, HobbyType hobby) {
        super(name, birthdayDate, gender, height, weight);
        this.color = color;
        this.numberOfEyes = numberOfEyes;
        this.numberOfHairsOnTheHead = numberOfHairsOnTheHead;
        this.favouriteFood = favouriteFood;
        this.garment = garment;
        this.hobby = hobby;
        numberOfMinions++;
    }

    public Minion(String name, int birthdayDay, int birthdayMonth, int birthdayYear, Gender gender, Double height,
                  Double weight, Color color, int numberOfEyes, int numberOfHairsOnTheHead, String favouriteFood,
                  String garment, HobbyType hobby) {
        super(name, birthdayDay, birthdayMonth, birthdayYear, gender, height, weight);
        this.color = color;
        this.numberOfEyes = numberOfEyes;
        this.numberOfHairsOnTheHead = numberOfHairsOnTheHead;
        this.favouriteFood = favouriteFood;
        this.garment = garment;
        this.hobby = hobby;
        numberOfMinions++;
    }

    public Minion(String name, int birthdayDay, int birthdayMonth, int birthdayYear, Color color,
                  int numberOfEyes, int numberOfHairsOnTheHead, String favouriteFood, String garment, HobbyType hobby) {
        super(name, birthdayDay, birthdayMonth, birthdayYear);
        this.color = color;
        this.numberOfEyes = numberOfEyes;
        this.numberOfHairsOnTheHead = numberOfHairsOnTheHead;
        this.favouriteFood = favouriteFood;
        this.garment = garment;
        this.hobby = hobby;
        numberOfMinions++;
    }

    @Override
    public void setWeight(Double weight) {
        if(checkWeight(weight) && (weight<DEFAULT_WEIGHT*1000)){
            this.weight = weight;
        }
    }

    @Override
    public void setHeight(Double height) {
        if(checkHeight(height) && (height<DEFAULT_HEIGHT*1000)){
            this.height = height;
        }
    }

    @Override
    public String saySomethingAboutYourself() {
        return MessageFormat.format("\u00A1Hola! Soy minion. Me llamo {0} ", this.name);
    }

    @Override
    public Double calculateAndGetBMI() {
        if (this.weight != null && this.height != null) {
            bmi = weight *1000/ (height * height) + 10;
            CategorizeByBMI();
            return bmi;
        }
        return null;
    }

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

    public static String getDefaultGarment() {
        return DEFAULT_GARMENT;
    }

    public static HobbyType getDefaultHobby() {
        return DEFAULT_HOBBY;
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
        numberOfMinions++;
        return super.clone();
    }

    @Override
    public String getCurrentMood() {
        return "I'm feeling good!";
    }

    @Override
    public void tellAboutYourself() {
        System.out.println(saySomethingAboutYourself());
        System.out.println(" I like " + favouriteFood + " and I am good at " + hobby);
        System.out.println("-------- Minion says - \"Adios!\" --------");
    }
}

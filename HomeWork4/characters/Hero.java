package characters;

import task1.StoryTeller;
import utils.mytypes.Gender;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Hero extends Character implements StoryTeller{

    public static final String DEFAULT_GENERAL_DEFINITIONS_OF_HERO = "Hero is a character with a mission";
    private static Integer numberOfHeroes = 0;
    public static String generalDefinitionOfHeroClass;
    public static String defaultName = "Unknown Hero";

    private boolean isGoodOne = true;
    private ArrayList<String> superPowers = new ArrayList<String>();
    private String realName;
    private String realSurname;
    private String symbol;
    private String motto;
    private boolean isImmortal;

    public Hero() {
        this(defaultName);
    }

    public Hero(String name) {
        super(name);
        numberOfHeroes++;
    }

    public Hero(String name, ArrayList<String> supperPowers) {
        super(name);
        this.superPowers.addAll(supperPowers);
        numberOfHeroes++;
    }
    public Hero(String name, Gender gender, Double height, Double weight) {
        super(name, gender, height, weight);
        numberOfHeroes++;
    }

    public Hero(String name, LocalDate birthdayDate, Gender gender, Double height, Double weight) {
        super(name, birthdayDate, gender, height, weight);
        numberOfHeroes++;
    }

    public Hero(String name, int birthdayDay, int birthdayMonth, int birthdayYear, Gender gender, Double height,
                Double weight) {
        super(name, birthdayDay, birthdayMonth, birthdayYear, gender, height, weight);
        numberOfHeroes++;
    }

    public Hero(String name, int birthdayDay, int birthdayMonth, int birthdayYear) {
        super(name, birthdayDay, birthdayMonth, birthdayYear);
        numberOfHeroes++;
    }

    @Override
    public String saySomethingAboutYourself() {
        return MessageFormat.format("Hi there! I''m one of the heroes. {0} is my name:)", this.name);
    }

    public boolean isImmortal() {
        return isImmortal;
    }

    public void setImmortal(boolean immortal) {
        isImmortal = immortal;
    }

    public static Integer getNumberOfHeroes() {
        return numberOfHeroes;
    }

    public static void setNumberOfHeroes(Integer numberOfHeroes) {
        Hero.numberOfHeroes = numberOfHeroes;
    }

    public static String getGeneralDefinitionOfHeroClass() {
        return generalDefinitionOfHeroClass;
    }

    public static void setGeneralDefinitionOfHeroClass(String generalDefinitionOfHeroClass) {
        Hero.generalDefinitionOfHeroClass = generalDefinitionOfHeroClass;
    }

    public static void resetGeneralDefinitionOFHeroClassToDefault(){
        Hero.generalDefinitionOfHeroClass = DEFAULT_GENERAL_DEFINITIONS_OF_HERO;
    }

    public boolean isGoodOne() {
        return isGoodOne;
    }

    public void setGoodOne(boolean goodOne) {
        isGoodOne = goodOne;
    }

    public String getSuperPowers() {
        return superPowers.toString();
    }

    public void resetToNewSetOfSuperPowers(ArrayList<String> superPowers) {
        this.superPowers = new ArrayList<String>(superPowers);
    }

    public void addSuperPower (String superPower) {
        if (superPower != null) {
            this.superPowers.add(superPower);
        }
    }

    public void removeSuperPower(String superPower){
        this.superPowers.remove(superPower);
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealSurname() {
        return realSurname;
    }

    public void setRealSurname(String realSurname) {
        this.realSurname = realSurname;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public static String getDefaultGeneralDefinitionsOfHero() {
        return DEFAULT_GENERAL_DEFINITIONS_OF_HERO;
    }

    @Override
    public void setHeight(Double height) {
        super.setHeight(height);
    }

    @Override
    public void setWeight(Double weight) {
        super.setWeight(weight);
    }

    @Override
    protected boolean checkHeight(Double height) {
        return super.checkHeight(height);
    }

    @Override
    protected boolean checkWeight(Double weight) {
        return super.checkWeight(weight);
    }

    @Override
    public String toString() {
        return super.toString();
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
        numberOfHeroes++;
        return super.clone();
    }

    @Override
    public String getCurrentMood() {
        if (isGoodOne) {
            return "I'm feeling so good! I'll help you!";
        } else {
            return "I'm feeling so low! I'll destroy you!";
        }
    }

    @Override
    public void tellAboutYourself() {
        System.out.println(saySomethingAboutYourself());
        System.out.println("-------- Hero says - \"Good bye!\" --------");
    }
}

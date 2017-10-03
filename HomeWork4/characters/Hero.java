package characters;

import java.util.ArrayList;

public class Hero extends Character{

    public static final String DEFAULT_GENERAL_DEFINITIONS_OF_HERO = "Hero is a character with a mission";
    private static Integer numberOfHeroes;
    public static String generalDefinitionOfHeroClass;

    private boolean isGoodOne;
    private ArrayList<String> superPowers;
    private String realName;
    private String realSurname;
    private ArrayList<String> weapon;
    private String symbol;
    private String motto;
    private ArrayList<String> weakness;
    private boolean isImmortal;

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

    public boolean isGoodOne() {
        return isGoodOne;
    }

    public void setGoodOne(boolean goodOne) {
        isGoodOne = goodOne;
    }

    public ArrayList<String> getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(ArrayList<String> superPowers) {
        this.superPowers = superPowers;
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

    public ArrayList<String> getWeapon() {
        return weapon;
    }

    public void setWeapon(ArrayList<String> weapon) {
        this.weapon = weapon;
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

    public ArrayList<String> getWeakness() {
        return weakness;
    }

    public void setWeakness(ArrayList<String> weakness) {
        this.weakness = weakness;
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
        return super.clone();
    }
}

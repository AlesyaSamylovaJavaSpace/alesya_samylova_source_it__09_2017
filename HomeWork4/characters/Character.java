package characters;

import utils.mytypes.BMICategories;
import utils.mytypes.HeightUnit;
import utils.mytypes.WeightUnit;
import utils.mytypes.Gender;
import java.time.LocalDate;
import java.time.Period;
import java.lang.Cloneable;


public class Character implements Cloneable {

    protected static final Double DEFAULT_HEIGHT = 1.85;
    protected static final Double DEFAULT_WEIGHT = 75.0;
    protected static final HeightUnit DEFAULT_UNIT_OF_HEIGHT = HeightUnit.M;
    protected static final WeightUnit DEFAULT_UNIT_OF_WEIGHT = WeightUnit.KG;
    protected static Gender DEFAULT_GENDER = Gender.MALE;

    protected String name;
    protected LocalDate birthdayDate;
    protected Integer age;
    protected Gender gender;
    protected Double height;
    protected Double weight;
    protected Double bmi;
    protected BMICategories categoryOfWeight;

    public static Gender getDefaultGender() {
        return DEFAULT_GENDER;
    }

    public static void setDefaultGender(Gender defaultGender) {
        if (defaultGender != null) {
            DEFAULT_GENDER = defaultGender;
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (gender != null) {
            this.gender = gender;
        } else {
            gender = DEFAULT_GENDER;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected boolean checkTheDate(int month, int day){
        return (month > 0 && month <= 12 && day > 0 && day <= 31);
    }

    public void setBirthdayDate(int year, int month, int day) {
        if (checkTheDate(month, day)) {
            birthdayDate = LocalDate.of(year, month, day);
        }
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void calculateAndSetAge() {
        Period period = Period.between(birthdayDate, LocalDate.now());
        age = period.getYears();
    }

    public Integer getAge(){
        return age;
    }

    protected boolean checkHeight(Double height) {
        return (height > 0);
    }

    public void setHeight(Double height) {
        if (checkHeight(height)) {
            this.height = height;
        }
    }

    public Double getHeight() {
        return height;
    }

    protected boolean checkWeight (Double weight){
        return (weight > 0);
    }

    public void setWeight(Double weight) {
        if (checkWeight(weight)) {
            this.weight = weight;
        }
    }

    public Double getWeight() {
        return weight;
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

    public Double calculateAndGetBMI(){
        if (this.weight != null && this.height != null) {
            bmi = weight / (height * height);
            CategorizeByBMI();
            return bmi;
        }
        return null;
    }

    public BMICategories getBMICategory(){
        if (bmi == null) {
            calculateAndGetBMI();
        }

        return categoryOfWeight;
    }

    private void CategorizeByBMI(){
        if (bmi < 18.5) {
            categoryOfWeight = BMICategories.UNDERWEIGHT;
        } else if (bmi < 24.9) {
            categoryOfWeight = BMICategories.NORMAL_WEIGHT;
        } else if (bmi < 30) {
            categoryOfWeight = BMICategories.OVERWEIGHT;
        } else if (bmi < 35) {
            categoryOfWeight = BMICategories.FIRST_DEGREE_OBESITY;
        } else if (bmi < 40) {
            categoryOfWeight = BMICategories.SECOND_DEGREE_OBESITY;
        } else {
            categoryOfWeight = BMICategories.THIRD_DEGREE_OBESITY;
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                ", categoryOfWeight=" + categoryOfWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;

        Character character = (Character) o;

        if (getAge() != null ? !getAge().equals(character.getAge()) : character.getAge() != null) return false;
        if (getGender() != character.getGender()) return false;
        if (!getHeight().equals(character.getHeight())) return false;
        return getWeight().equals(character.getWeight());

    }

    @Override
    public int hashCode() {
        int result = getAge() != null ? getAge().hashCode() : 0;
        result = 31 * result + getGender().hashCode();
        result = 31 * result + getHeight().hashCode();
        result = 31 * result + getWeight().hashCode();
        return result;
    }

    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }

}

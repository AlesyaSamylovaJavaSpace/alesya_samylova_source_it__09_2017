package inheritance_people;

/**
 * Created by Alessia on 9/19/2017.
 */
public class Person {

    protected String name;
    protected String surname;
    protected String patronymicName;

    public Person(){
    }

    public Person(String name, String surname, String patronymicName) {
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getFullName(){
        String fullName = surname + " " + name + " " + patronymicName;
        return fullName;
    }

}

package inheritance.people;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        if (!surname.equals(person.surname)) return false;
        return patronymicName.equals(person.patronymicName);

    }

    @Override
    public String toString() {
        return String.format("{%2$s %1$s %3$s}", name, surname, patronymicName);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + patronymicName.hashCode();
        return result;
    }
}

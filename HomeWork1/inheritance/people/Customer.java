package inheritance.people;

public class Customer extends Person {

    private String representativeOrganization;

    public Customer(String name, String surname, String patronymicName, String representativeOrganization) {
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.representativeOrganization = representativeOrganization;
    }

    public String getRepresentativeOrganization() {
        return representativeOrganization;
    }

    public void setRepresentativeOrganization(String representativeOrganization) {
        this.representativeOrganization = representativeOrganization;
    }

}

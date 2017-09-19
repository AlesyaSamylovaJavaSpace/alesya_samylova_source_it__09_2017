package inheritance_people;

/**
 * Created by Alessia on 9/19/2017.
 */
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

package task3;

import inheritance.people.Customer;
import inheritance.people.Employee;
import inheritance.people.Person;
import task1.StoryTeller;

public class PersonFactory extends AbstractFactory {
    @Override
    public Person getPerson(String personType) {
        if (personType == null){
            return null;
        }

        if (personType.trim().equalsIgnoreCase("EMPLOYEE")){
            return new Employee();
        } else if (personType.trim().equalsIgnoreCase("CUSTOMER")){
            return new Customer();
        } else if (personType.trim().equalsIgnoreCase("PERSON")){
            return new Person();
        }

        return null;
    }

    @Override
    public StoryTeller getStoryTeller(String storyTellerType) {
        return null;
    }
}

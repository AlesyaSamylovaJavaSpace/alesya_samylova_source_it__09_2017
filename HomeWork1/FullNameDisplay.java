import inheritance.people.Person;

public class FullNameDisplay {

    public static void main(String[] args){
        Person me = new Person("Alesya", "Samylova", "Alexandrovna");

        System.out.println( "Full name of creator: "+ me.getFullName());
    }
}


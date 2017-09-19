/**
 * Created by Alessia on 9/19/2017.
 *
 *  Purpose: Display full name of creator
 */

import inheritance_people.Person;

public class FullNameDisplay {

    public static void main(String[] args){
        Person me = new Person("Alesya", "Samylova", "Alexandrovna");

        System.out.println( "Full name of creator: "+ me.getFullName());
    }
}


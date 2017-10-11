package task3;

import task2.StoryTellerFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String typeOfFactory){
        if(typeOfFactory == null){
            return null;
        }

        if (typeOfFactory.trim().equalsIgnoreCase("PERSON")){
            return new PersonFactory();
        } else if (typeOfFactory.trim().equalsIgnoreCase("STORYTELLER")){
            return new StoryTellerFactory();
        }

        return null;
    }

}

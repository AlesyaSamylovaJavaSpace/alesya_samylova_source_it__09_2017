package task2;

import characters.Hero;
import characters.Minion;
import characters.Smurf;
import inheritance.people.Person;
import task1.StoryTeller;
import task3.AbstractFactory;


public class StoryTellerFactory extends AbstractFactory {
    @Override
    public StoryTeller getStoryTeller(String storyTellerType){
        if (storyTellerType == null){
            return null;
        }

        if (storyTellerType.trim().equalsIgnoreCase("MINION")){
            return new Minion();
        } else if (storyTellerType.trim().equalsIgnoreCase("SMURF")){
            return new Smurf();
        } else if (storyTellerType.trim().equalsIgnoreCase("HERO")){
            return new Hero("Hulk");
        }

        return null;
    }

    @Override
    public Person getPerson(String personType) {
        return null;
    }
}

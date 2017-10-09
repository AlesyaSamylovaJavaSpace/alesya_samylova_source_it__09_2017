package task2;

import characters.Hero;
import characters.Minion;
import characters.Smurf;
import task1.StoryTeller;

public class StoryTellerFactory {
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
}

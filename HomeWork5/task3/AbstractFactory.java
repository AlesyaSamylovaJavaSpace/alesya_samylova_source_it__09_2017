package task3;

import inheritance.people.Person;
import task1.StoryTeller;

public abstract class AbstractFactory {
   public abstract StoryTeller getStoryTeller(String storyTellerType);
   public abstract Person getPerson(String personType);
}

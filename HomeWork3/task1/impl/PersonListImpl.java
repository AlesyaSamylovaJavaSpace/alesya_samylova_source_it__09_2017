package task1.impl;

import inheritance.people.Person;

import java.util.*;

public class PersonListImpl implements PersonList {
    private Person[] arrayOfPersons = new Person[0];

    @Override
    public int size() {
        return arrayOfPersons.length;
    }

    @Override
    public boolean isEmpty() {
        if (arrayOfPersons.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            if (person!=null) {
                for (int i = 0; i < arrayOfPersons.length; i++) {
                    if (person.equals(arrayOfPersons[i])) {
                        return true;
                    }
                }
            }  else {
                for (int i=0; i < arrayOfPersons.length; i++) {
                    if(arrayOfPersons[i]==null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return arrayOfPersons;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Person person) {
        Person[] addArray = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        addArray[arrayOfPersons.length] = person;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Person> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Person get(int index) {
        return null;
    }

    @Override
    public Person set(int index, Person element) {
        return null;
    }

    @Override
    public void add(int index, Person element) {
// TODO:

    }

    @Override
    public Person remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if ( o instanceof Person) {
           Person person = (Person) o;
            if (person != null) {
                for (int i = 0; i < arrayOfPersons.length; i++) {
                    if (person.equals(arrayOfPersons[i])) {
                        return i;
                    }
                }
            } else {
                for (int i =0; i < arrayOfPersons.length; i++){
                    if (arrayOfPersons[i]==null){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {

        if (o instanceof Person) {

            Person person = (Person) o;
            int firstIndex = indexOf(person);

            if (firstIndex<0){
                return firstIndex;
            }

            int lastIndex = firstIndex;
            if (person != null) {
                for (int i = firstIndex; i < arrayOfPersons.length; i++) {
                    if (person.equals(arrayOfPersons[i])) {
                        lastIndex = i;
                    }
                }
            } else {
                for (int i = firstIndex; i < arrayOfPersons.length; i++) {
                    if(arrayOfPersons[i]==null){
                        lastIndex = i;
                    }
                }
            }

            return lastIndex;
        }
        return -1;
    }

    @Override
    public ListIterator<Person> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Person> listIterator(int index) {
        return null;
    }

    @Override
    public List<Person> subList(int fromIndex, int toIndex) {
        return null;
    }
}

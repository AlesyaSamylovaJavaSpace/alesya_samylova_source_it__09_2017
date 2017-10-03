package task1.impl;

import com.sun.deploy.util.ArrayUtil;
import inheritance.people.Person;

import java.util.*;


public class PersonListImpl implements PersonList {
    private Person[] arrayOfPersons = new Person[0];

    // Section 1 ( HomeWork 3 implementation of some methods using arrays)
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
       return this.indexOf(o)>=0;
    }

    @Override
    public Object[] toArray() {
        return arrayOfPersons;
    }

    @Override
    public boolean add(Person person) {
        Person[] addArray = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        addArray[arrayOfPersons.length] = person;
        arrayOfPersons = Arrays.copyOf(addArray, addArray.length);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int indexOfObject = indexOf(o);
        if (indexOfObject >= 0) {
            Person [] newArray = new Person[arrayOfPersons.length-1];
            for (int j = 0, i = 0; j < arrayOfPersons.length; j++) {
                if (j != indexOfObject){
                    newArray[i] = arrayOfPersons[j];
                    i++;
                }
            }
            arrayOfPersons = newArray;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        if (arrayOfPersons != null && arrayOfPersons.length > 0){

            for (int i=0; i<arrayOfPersons.length; i++){
                arrayOfPersons[i] = null;
            }

            arrayOfPersons = new Person[0];
        }

    }

    @Override
    public Person get(int index) {
        if(arrayOfPersons != null && index < arrayOfPersons.length && index >= 0){
            return arrayOfPersons[index];
        }
        return null;
    }

    @Override
    public Person set(int index, Person element) {
        if(arrayOfPersons != null && index < arrayOfPersons.length && index >= 0){
            Person oldValue = arrayOfPersons[index];
            arrayOfPersons[index] = element;
            return oldValue;
        }
        return null;
    }

    @Override
    public void add(int index, Person element) {
        if(arrayOfPersons != null && index < arrayOfPersons.length && index >= 0){
            Person[] newArray = new Person[arrayOfPersons.length+1];
            for (int i = 0, j = 0; i < arrayOfPersons.length; i++, j++){
                if (i == index){
                    newArray[j++] = element;
                    newArray[j] = arrayOfPersons[i];
                } else {
                    newArray[j] = arrayOfPersons[i];
                }
            }
            arrayOfPersons = newArray;
        }
    }

    @Override
    public Person remove(int index) {
        if(arrayOfPersons != null && index < arrayOfPersons.length && index >= 0){
            Person[] newArray = new Person[arrayOfPersons.length - 1];
            Person removedPerson = arrayOfPersons[index];
            for (int i = 0, j = 0; j < newArray.length; i++, j++) {
                if (i == index) {
                   newArray[j] = arrayOfPersons[++i];
                } else {
                    newArray[j] = arrayOfPersons[i];
                }
            }
            arrayOfPersons = newArray;
            return removedPerson;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if ( o instanceof Person) {
            Person person = (Person) o;
            return person!=null ? indexOfNonNullObject(person) : indexOfNullObject(person);
        }
        return -1;
    }

    private int indexOfNonNullObject(Person person) {
        for (int i = 0; i < arrayOfPersons.length; i++) {
            if (person.equals(arrayOfPersons[i])) {
                return i;
            }
        }
        return -1;
    }

    private int indexOfNullObject(Person person) {
        for (int i =0; i < arrayOfPersons.length; i++){
            if (arrayOfPersons[i]==null){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            return person != null? lastIndexOfNonNullObject(person): lastIndexOfNullObject(person);
        }
        return -1;
    }

    private int lastIndexOfNonNullObject(Person person) {
        for (int i = arrayOfPersons.length - 1; i >= 0 ; i--) {
            if (person.equals(arrayOfPersons[i])) {
                return i;
            }
        }
        return -1;
    }

    private int lastIndexOfNullObject(Person person) {
        for (int i = arrayOfPersons.length - 1; i >= 0; i--) {
            if(arrayOfPersons[i]==null){
                return i;
            }
        }
        return -1;
    }


    // Section 2 (not in scope of Home Work 3)
    @Override
    public Iterator<Person> iterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
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

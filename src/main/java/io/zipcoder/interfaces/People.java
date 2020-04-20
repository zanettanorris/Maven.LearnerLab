package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    List<E> personList;

    public People() {
        personList = new ArrayList<E>();
    }

    public void addPerson(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        personList.remove(findById(id));
    }

    public void removeAll(ArrayList<Person> newArrayList) {
        personList.removeAll(newArrayList);
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAllByClear() {
        personList.clear();
    }
}


//    Part 6.1 - Create People class
//
//Create a People class.
//The class should instantiate a List field of Person objects named personList.
//The class should define a method named add which adds a Person to the personList.
//The class should define a method named findById which makes use of a long id
// parameter to return a Person object with the respective id field.
//The class should define a named contains which makes use of a Person person
// parameter to return true if the personList contains the respective Person object.
//The class should define a method named remove which makes use of a Person person
// parameter to remove a respective Person object.
//The class should define a method named remove which makes use of a long id
// parameter to remove a Person object with the respective id field.
//The class should define a named removeAll which clears our personList field.
//The class should define a method named count which returns the size of personList.
//The class should define a method named toArray which returns an array representation of the personList field.
//The class should implement Iterable<E> and define a method named iterator
// which makes use of the personList field to generate a new a Iterator<E>.

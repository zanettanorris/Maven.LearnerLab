package io.zipcoder.interfaces;

import java.util.Iterator;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();
    public static Students getInstance(){
        return INSTANCE;
    }
public Student[] getArray() {
    return personList.toArray(new Student[personList.size()]);
}
@Override
    public Iterator<Student> iterator(){
        return null;}

}
//    Part 7.1 - Create Students singleton
//
//Note: The creation of this class will demonstrate an implementation of singleton
// design pattern.
//Create a Students class.
//The class should be an unextendable subclass of the People class.
//The class should statically instantiate a final field named INSTANCE
// of type Students.
//The class should define a private nullary constructor which populates the
// INSTANCE field with respective Student representations of your colleagues.
//Each student should have a relatively unique id field.
//The class should define a getInstance method which returns the INSTANCE field.


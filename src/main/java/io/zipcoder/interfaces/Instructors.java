package io.zipcoder.interfaces;

import java.util.Iterator;

public final class Instructors extends People <Instructor>{
private static final Instructors INSTANCE = new Instructors();

private Instructors(){
    Instructor instructor1 = new Instructor(1L, "Leon");
    Instructor instructor2 = new Instructor(2L, "Froilan");
    super.addPerson(instructor1);
    super.addPerson(instructor2);

}

    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

//    Part 8.0 - Create and Test Instructors singleton
//
//Use Part 7 as a reference.
//Create a Instructors singleton which represents
// the set of
// instructors
// at ZipCodeWilmington.

}

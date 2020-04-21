package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStudent {

    @Before
    public void testConstructor() {
        Student student1 = new Student(31L, "Stella");
    }

    @Test
    public void testImplementation() {
        Student student1 = new Student(31L, "Stella");
        assertTrue(student1 instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student1 = new Student(31L, "Stella");
        assertTrue(student1 instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student1 = new Student(31L, "Stella");
        student1.learn(2);
        double expected = 2;
        double actual = student1.getTotalStudyTime();
        assertEquals(actual, expected, 0);


//    totalStudyTime = 4  is increased to 6.
}
//    Part 3.0 - Test Student
//
//Create a TestStudent class.
//Create a testImplementation method that asserts that
// a Student is an instanceof a Learner.
//Create a testInheritance method that asserts that
// a Student is an instanceof a Person.
//Create a testLearn method that ensures a Student's
// totalStudyTime instance variable
// is incremented by the specified numberOfHours by invoking the .learn method.
}

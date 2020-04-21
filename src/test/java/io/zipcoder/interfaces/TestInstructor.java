package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestInstructor {
    Instructor instructor;
    Student student1;
    Student student2;


    @Before
public void testSetup(){
        instructor = new Instructor(4L, "Dante");
        student1 = new Student (30L, "Ruby");
        student2 = new Student (31L, "Stella");
    }

    @Test
    public void testInheritance() {
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testImplementation() {
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testTeach() {
        instructor.teach(student1, 4);
        Integer expected = 4;
        Double actual = student1.getTotalStudyTime();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture(){
        Learner[] learners = {student1, student2};
        instructor.lecture(learners, 10);
        double expected = 5;
        double actual = student1.getTotalStudyTime();
        assertEquals(expected, actual, 0);
    }

//    Part 5.0 - Test Instructor
//
//Create a TestInstructor class.
//Create a testImplementation method that asserts that
// an Instructor is an instanceof a Teacher.
//Create a testInheritance method that asserts that
// a Instructor is an instanceof a Person.
//Create a testTeach method that ensures when an Instructor
// invokes the teach method, a respective student's
// totalStudyTime instance variable is incremented by the specified numberOfHours.
//Create a testLecture method that ensures when
// an Instructor invokes the lecture method,
// a respective array of students' totalStudyTime
// instance variables is incremented by numberOfHours/students.length.
}

package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    public void learn(Double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

//    Part 3.1 - Create Student Class
//
//Create a Student class such that:
//Student is a subclass of Person
//Student implements the Learner interface
//Student should have an instance variable totalStudyTime of type double
//Student should have a concrete implementation of the learn method which
// increments the totalStudyTime variable by the specified numberOfHours argument.
//Student should have a getTotalStudyTime() method which returns the totalStudyTime
// instance variable.
}

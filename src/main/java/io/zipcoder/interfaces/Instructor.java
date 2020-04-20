package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public double teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        return numberOfHours;

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i=0; i<learners.length; i++) {
            learners[i].learn(numberOfHoursPerLearner);
        }
        }

    }

//    Part 5.1 - Create Instructor Class
//
//Create an Instructor class such that: Done
//Instructor is a subclass of Person  Done
//Instructor implements the Teacher interface  Done
//Instructor should have a concrete implementation of the teach method
// which invokes the learn method on the specified Learner object.
//Instructor should have a concrete implementation of the lecture method
// which invokes the learn method on each of the elements in the
// specified array of Learner objects.
//numberOfHours should be evenly split amongst the learners.
//double numberOfHoursPerLearner = numberOfHours / learners.length;


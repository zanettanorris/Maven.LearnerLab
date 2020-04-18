package io.zipcoder.interfaces;

public class Person {
    Person person;
    final Long id;
    private String name;


    public Person(Long id, String name) {
        this.name = "";
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }
}

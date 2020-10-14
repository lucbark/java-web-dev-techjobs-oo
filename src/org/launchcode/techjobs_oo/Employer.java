package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField { //constructor 1
//    private int id;
//    private static int nextId = 1; //next id is variable that increments which in turn gives every new 'Employer'
//    // object gets a different id number
//    private String value;
//
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }

    public Employer(String value) { //constructor 2
//        this(); //how does 'this()' statement do its magic???
//        this.value = value;
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}

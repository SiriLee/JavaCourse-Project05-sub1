package main.java.instance;

import main.java.type.*;

public class Student extends Person{
    private String major;

    public Student(int age, Gender gender, Name name, String major) {
        super(age, gender, name);
        this.major = major;
    }

    @Override
    public void talk() {
        System.out.println("Hi, how is your homework going?");
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, Major: %s", this.name, this.age, this.gender, major);
    }

    @Override
    public void work() {
        System.out.println("I am studying " + major);
    }

    /*
    public void breathe() {
        System.out.println("Breathing while studying...");
    }
    */

    @Override
    public Student getPartner() {
        return null;
    }
}

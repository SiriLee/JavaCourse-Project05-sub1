package main.java.instance;

import main.java.type.*;

public class Teacher extends Person {
    private String subject;

    public Teacher(int age, Gender gender, Name name, String subject) {
        super(age, gender, name);
        this.subject = subject;
    }

    @Override
    public void talk() {
        System.out.println("Hi, how is your paper going?");
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, Subject: %s", this.name, this.age, this.gender, subject);
    }

    @Override
    public void work() {
        System.out.println("I am teaching " + subject);
    }
}

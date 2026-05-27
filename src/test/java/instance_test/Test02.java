package test.java.instance_test;

import main.java.instance.*;
import main.java.type.*;

public class Test02 {
    public static void main(String[] args) {
        Person person = new Student(20, Gender.FEMALE, new Name("Alice", "Smith"), "Computer Science");
        person.talk();
        person.talk("Math");
    }
}
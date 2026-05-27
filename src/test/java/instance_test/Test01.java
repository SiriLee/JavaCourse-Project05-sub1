package test.java.instance_test;

import main.java.instance.*;
import main.java.type.*;

public class Test01 {
    public static void main(String[] args) {
        Person[] people = new Person[2]; // originally 3, but Person is abstract now
        people[0] = new Student(20, Gender.FEMALE, new Name("Alice", "Smith"), "Computer Science");
        people[1] = new Teacher(45, Gender.MALE, new Name("Bob", "Johnson"), "Mathematics");
        // people[2] = new Person(30, Gender.FEMALE, new Name("Carol", "Williams"));
        for (Person person : people) {
            person.talk();
        }
    }
}

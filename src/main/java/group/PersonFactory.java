package main.java.group;

import java.util.Random;

import main.java.instance.*;
import main.java.type.*;

public class PersonFactory {
    private static final String[] firstNames = {"John", "Jane", "Alex", "Emily", "Michael", "Sarah"};
    private static final String[] lastNames = {"Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson"};

    public static Person createRandomPerson() {
        Random random = new Random();
        boolean isStudent = random.nextBoolean();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        Gender gender = random.nextBoolean() ? Gender.MALE : Gender.FEMALE;
        if (isStudent) {
            int age = random.nextInt(10) + 18; // Age between 18 and 27
            String major = "Major" + (random.nextInt(5) + 1); // Major1 to Major5
            return new Student(age, gender, new Name(firstName, lastName), major);
        } else {
            int age = random.nextInt(20) + 30; // Age between 30 and 49
            String subject = "Subject" + (random.nextInt(5) + 1); // Subject1 to Subject5
            return new Teacher(age, gender, new Name(firstName, lastName), subject);
        }
    }
}

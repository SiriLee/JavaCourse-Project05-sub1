package test.java.group_test;

import main.java.group.PersonFactory;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(PersonFactory.createRandomPerson());
        }
    }
}

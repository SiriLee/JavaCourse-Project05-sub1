package test.java.group_test;

import main.java.group.Discussion;
import main.java.group.PersonFactory;

public class Test02 {
    public static void main(String[] args) {
        Discussion discussion = new Discussion();
        for (int i = 1; i <= 5; i++) {
            discussion.addPerson(PersonFactory.createRandomPerson());
        }
        discussion.broadCast();
    }
}

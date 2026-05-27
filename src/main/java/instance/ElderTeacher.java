package main.java.instance;

import main.java.type.*;

public class ElderTeacher extends Teacher {
    private static final ElderTeacher instance = new ElderTeacher();
    private ElderTeacher() {
        super(75, Gender.MALE, new Name("Donald", "Trump"), "Politics");
    }

    public static ElderTeacher getInstance() {
        return instance;
    }
}

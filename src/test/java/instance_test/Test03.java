package test.java.instance_test;

import main.java.instance.*;

public class Test03 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ElderTeacher teacher = ElderTeacher.getInstance();
            System.out.println(teacher.hashCode());
        }
    }
}

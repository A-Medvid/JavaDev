package hw5;

import hw5.course1.lessons.ServiceLess;

import static hw5.course1.lessons.ServiceLess.countLect;

public class Main {
    public static void main(String[] args) {
        ServiceLess.lectNew();
        ServiceLess.lectNew();
        ServiceLess.lectNew();
        System.out.println(countLect);

        ServiceLess.lectNew();
    }
}
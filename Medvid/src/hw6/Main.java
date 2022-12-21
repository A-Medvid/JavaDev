package hw6;

import hw6.course1.Course;
import hw6.course1.lessons.Lection;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(1);
        Lection lection1 = new Lection(1, course.id);
        Lection lection2 = new Lection(2, course.id);
        Lection lection3 = new Lection(3, course.id);
        Lection lection4 = new Lection(4, course.id);
        Lection lection5 = new Lection(5, course.id);
        Lection lection6 = new Lection(6, course.id);

        System.out.println("Course ID of Lection #6 is " + lection6.courseId + ".");
        System.out.println("Total amount of lections is " + lection6.id + ".");
    }
}
package hw5;

import hw5.course1.lessons.ServiceLess;
import hw5.course1.students.ServiceStudent;
import hw5.course1.teachers.ServiceTeacher;

import static hw5.course1.lessons.ServiceLess.countLect;
import static hw5.course1.students.ServiceStudent.countStud;
import static hw5.course1.teachers.ServiceTeacher.countTeach;

public class Main {
    public static void main(String[] args) {
        ServiceLess.lectNew();
        ServiceLess.lectNew();
        ServiceLess.lectNew();
        System.out.println(countLect);

        ServiceLess.lectNew();
        ServiceLess.lectNew();
    }
}
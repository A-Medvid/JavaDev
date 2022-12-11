import course1.lessons.ServiceLess;
import course1.students.ServiceStudent;
import course1.teachers.ServiceTeacher;

import static course1.lessons.ServiceLess.countLect;
import static course1.students.ServiceStudent.countStud;
import static course1.teachers.ServiceTeacher.countTeach;

public class Main {
    public static void main(String[] args) {
        ServiceLess.lectNew();
        ServiceLess.lectNew();
        ServiceLess.lectNew();
        System.out.println(countLect);

        ServiceStudent.studNew();
        System.out.println(countStud);

        ServiceTeacher.teachNew();
        System.out.println(countTeach);
    }
}
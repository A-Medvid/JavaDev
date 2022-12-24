package hw7;

import hw7.course1.Course;
import hw7.course1.lessons.Lecture;
import hw7.course1.lessons.ServiceLess;
import hw7.course1.students.Student;
import hw7.course1.teachers.Teacher;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(1);
        Lecture lecture = new Lecture(course.id);
        Teacher teacher = new Teacher(course.id);
        Student student = new Student(course.id);
        int counterLecture = 1;

        while (course.id != 0 && lecture.courseId != 0 && student.courseId != 0 && teacher.courseId != 0) {
            System.out.println("Choose the category");
            System.out.println("1 for Course");
            System.out.println("2 for Lecture");
            System.out.println("3 for Teacher");
            System.out.println("4 for Student");
            System.out.println("5 for creating new Lecture");
            System.out.println("0 Exit");

            int i = ServiceLess.getI();

            switch (i) {
                case 1:
                    System.out.println("You`ve chosen Course number " + course.id + ".");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("You`ve chosen Lecture number " + lecture.courseId + ".");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("You`ve chosen Teacher number " + teacher.courseId + ".");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("You`ve chosen Student number " + student.courseId + ".");
                    System.out.println();
                    break;
                case 5:
                    Lecture lecture1 = new Lecture(ServiceLess.rndm(2, 99), course.id);
                    counterLecture++;
                    System.out.println("You`ve created Lecture number " + lecture1.courseId + ".");
                    System.out.println("Total amount of lectures is " + counterLecture + ".");
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect format, please try again");
                    System.out.println();
            }
        }
    }
}

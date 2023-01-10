package hw9;

import hw9.course1.Course;
import hw9.course1.RepositoryCourse;
import hw9.course1.lessons.Lecture;
import hw9.course1.lessons.RepositoryLess;
import hw9.course1.lessons.ServiceLess;
import hw9.course1.students.RepositoryStudent;
import hw9.course1.students.Student;
import hw9.course1.teachers.RepositoryTeacher;
import hw9.course1.teachers.Teacher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(1);
        RepositoryCourse.courses[course.id - 1] = course;

        for (int i = 0; i < 3; i++) {
            Lecture lecture = new Lecture(i + 1, course.id);
            RepositoryLess.lectures[i] = lecture;
            ServiceLess.counterLecture++;
            Lecture[] newArray = Arrays.copyOf(RepositoryLess.lectures,
                    ((RepositoryLess.lectures.length * 3) / 2) + 1);
            RepositoryLess.lectures = newArray;
        }

        Teacher teacher = new Teacher(course.id);
        RepositoryTeacher.teachers[course.id - 1] = teacher;
        Student student = new Student(course.id);
        RepositoryStudent.students[course.id - 1] = student;

        if (RepositoryCourse.courses[0].id != 0
                && RepositoryLess.lectures[0].courseId != 0
                && RepositoryStudent.students[0].courseId != 0
                && RepositoryTeacher.teachers[0].courseId != 0) {
            while (course.id != 0) {
                System.out.println("Choose the category");
                System.out.println("1 for Course");
                System.out.println("2 for Lecture");
                System.out.println("3 for Teacher");
                System.out.println("4 for Student");
                System.out.println("5 for creating new Lecture");
                System.out.println("6 for displaying the list of Lectures");
                System.out.println("0 Exit");

                int i = ServiceLess.getI();

                switch (i) {
                    case 1:
                        System.out.println("You`ve chosen Course number "
                                + RepositoryCourse.courses[0].id + ".");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("You`ve chosen Lecture from Course number "
                                + RepositoryLess.lectures[0].courseId + ".");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("You`ve chosen Teacher from Course number "
                                + RepositoryTeacher.teachers[0].courseId + ".");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("You`ve chosen Student from Course number "
                                + RepositoryStudent.students[0].courseId + ".");
                        System.out.println();
                        break;
                    case 5:
                        ServiceLess.counterLecture++;
                        Lecture lecture1 = new Lecture(ServiceLess.counterLecture, course.id);
                        RepositoryLess.lectures[ServiceLess.counterLecture - 1] = lecture1;
                        Lecture[] newArray1 = Arrays.copyOf(RepositoryLess.lectures,
                                ((RepositoryLess.lectures.length * 3) / 2) + 1);
                        RepositoryLess.lectures = newArray1;

                        System.out.println("You`ve created Lecture number " + lecture1.id + ".");
                        System.out.println("Total amount of lectures is " + ServiceLess.counterLecture + ".");
                        System.out.println();
                        break;
                    case 6:
                        ServiceLess.getListOfLectures();
                        System.out.println();
                        break;
                    case 0:
                        System.out.println("System shuts down...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Incorrect format, please try again");
                        System.out.println();
                }
            }
        }
    }
}

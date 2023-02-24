package hw12;

import hw12.course1.Course;
import hw12.course1.RepositoryCourse;
import hw12.course1.lessons.Lecture;
import hw12.course1.lessons.RepositoryLess;
import hw12.course1.lessons.ServiceLess;
import hw12.course1.students.RepositoryStudent;
import hw12.course1.students.Student;
import hw12.course1.teachers.RepositoryTeacher;
import hw12.course1.teachers.Teacher;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(1, "First Course");
        RepositoryCourse repositoryCourse = new RepositoryCourse();
        repositoryCourse.add(course.getId() - 1, course);

        Teacher teacher = new Teacher(1, course.getId(), Role.TEACHER, "Adam",
                "Smith", "example@mail.com");
        teacher.setPhone();
        RepositoryTeacher repositoryTeacher = new RepositoryTeacher();
        repositoryTeacher.add(course.getId(), teacher);

        Student student = new Student(course.getId());
        RepositoryStudent repositoryStudent = new RepositoryStudent();
        repositoryStudent.add(course.getId(), student);

        RepositoryLess repositoryLess = new RepositoryLess();
        for (int i = 0; i < 3; i++) {
            Lecture lecture = new Lecture(i + 1, course.getId(), teacher);
            repositoryLess.add(i, lecture);
            int sysCountLect = ServiceLess.getCounterLecture();
            ServiceLess.setCounterLecture(sysCountLect + 1);
        }

        while (course.getId() != 0) {
            System.out.println("Choose the category");
            System.out.println("1 for Course");
            System.out.println("2 for Lecture");
            System.out.println("3 for Teacher");
            System.out.println("4 for Student");
            System.out.println("5 for creating new Lecture");
            System.out.println("6 for displaying the list of Lectures");
            System.out.println("7 for deleting the lecture");
            System.out.println("0 Exit");

            int i = ServiceLess.getI();

            switch (i) {
                case 1:
                    System.out.print("You`ve chosen ");
                    repositoryCourse.getById(0);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Please enter the ID of lecture to view...");
                    int idToView = ServiceLess.getI();
                    if (idToView == 0) {
                        System.out.println("Incorrect format, please try again");
                        break;
                    }
                    Lecture lecture0 = repositoryLess.getLecture(idToView - 1);
                    if (lecture0 != null) {
                        System.out.print("You`ve chosen ");
                        repositoryLess.getById(idToView - 1);
                    } else {
                        System.out.println("The lecture ID " + idToView + " is not exist");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("You`ve chosen ");
                    repositoryTeacher.getById(1);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("You`ve chosen ");
                    repositoryStudent.getById(1);
                    System.out.println();
                    break;
                case 5:
                    int sysCountLect = ServiceLess.getCounterLecture();
                    ServiceLess.setCounterLecture(sysCountLect + 1);
                    Lecture lecture1 = new Lecture(ServiceLess.getCounterLecture(), course.getId(), teacher);
                    repositoryLess.add(ServiceLess.getCounterLecture() - 1, lecture1);
                    System.out.println("You`ve created Lecture number " + lecture1.getId() + ".");
                    System.out.println("Total amount of lectures is " + ServiceLess.getCounterLecture() + ".");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("This Course contains the following lectures:");
                    repositoryLess.getAll();
                    System.out.println("Total amount of lectures is " + ServiceLess.getCounterLecture() + ".");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Please enter the ID of lecture to delete...");
                    int idToDel = ServiceLess.getI();
                    Lecture lecture00 = repositoryLess.getLecture(idToDel - 1);
                    if (lecture00 != null) {
                        repositoryLess.deleteById(idToDel - 1);
                    } else {
                        System.out.println("The lecture ID " + idToDel + " is not exist");
                    }
                    System.out.println("You`ve deleted Lecture number " + idToDel + ".");
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

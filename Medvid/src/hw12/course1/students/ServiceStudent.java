package hw12.course1.students;

public class ServiceStudent {
    private static int countStud = 0;

    public static int getCountStud() {
        return countStud;
    }

    public static void setCountStud(int countStud) {
        ServiceStudent.countStud = countStud;
    }
}

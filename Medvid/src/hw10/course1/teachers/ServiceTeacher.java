package hw10.course1.teachers;

public class ServiceTeacher {
    private static int countTeach = 0;

    public static int getCountTeach() {
        return countTeach;
    }

    public static void setCountTeach(int countTeach) {
        ServiceTeacher.countTeach = countTeach;
    }
}

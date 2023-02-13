package hw10.course1.teachers;

public class Teacher {
    private final int id = 1;
    public int courseId;

    public Teacher() {
    }

    public Teacher(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", courseId=" + courseId +
                '}';
    }
}

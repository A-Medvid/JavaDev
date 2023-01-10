package hw9.course1.lessons;

public class Lecture {
    public int id;
    public int courseId;

    public Lecture(int courseId) {
        this.courseId = courseId;
    }

    public Lecture(int id, int courseId) {
        this.id = id;
        this.courseId = courseId;
    }

}

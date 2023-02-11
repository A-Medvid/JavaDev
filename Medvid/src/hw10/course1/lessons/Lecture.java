package hw10.course1.lessons;

import hw10.Entity;

public class Lecture extends Entity {
    private int id;
    private int courseId;

    public Lecture() {
    }

    public Lecture(int id) {
        this.id = id;
    }
    public Lecture(int id, int courseId) {
        this.id = id;
        this.courseId = courseId;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", courseId=" + courseId +
                '}';
    }
}

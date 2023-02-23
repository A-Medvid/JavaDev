package hw11.course1.lessons;

import hw11.Entity;
import hw11.course1.teachers.Teacher;


public class Lecture extends Entity {
    private int id;
    private int courseId;

    private Teacher teacher;

    public Lecture() {
    }

    public Lecture(int id) {
        this.id = id;
    }
    public Lecture(int id, int courseId) {
        this.id = id;
        this.courseId = courseId;
    }

    public Lecture(int id, int courseId, Teacher teacher) {
        this.id = id;
        this.courseId = courseId;
        this.teacher = teacher;
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
                ", teacher=" + teacher +
                '}';
    }
}

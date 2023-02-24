package hw12.course1.lessons;

import hw12.Entity;
import hw12.course1.teachers.Teacher;


public class Lecture extends Entity {
    private int id;
    private int courseId;
    private String name;
    private String description;
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

    public Lecture(int id, int courseId, String name, String description, Teacher teacher) {
        this.id = id;
        this.courseId = courseId;
        this.name = name;
        this.description = description;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}

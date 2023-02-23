package hw11.course1.teachers;

import hw11.Role;
import hw11.course1.Person;

public class Teacher extends Person {
    private int id;
    private int courseId;

    private Role role = Role.TEACHER;

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getCourseId() {
        return courseId;
    }

    @Override
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Teacher() {
    }

    public Teacher(int id, int courseId, Role role) {
        this.id = id;
        this.courseId = courseId;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", role=" + role +
                '}';
    }
}

package hw11.course1;

import hw11.Role;

public class Person {
    private int id;
    private int courseId;
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person() {
    }

    public Person(int id, int courseId, Role role) {
        this.id = id;
        this.courseId = courseId;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", role=" + role +
                '}';
    }
}

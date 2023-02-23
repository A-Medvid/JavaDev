package hw12.course1.teachers;

import hw12.Role;
import hw12.course1.Person;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Teacher extends Person {
    private int id;
    private int courseId;
    private Role role = Role.TEACHER;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;

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

    @Override
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    //@Override
    public void setPhone() {
        System.out.println("Please enter the teacher`s phone number...");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        if (Pattern.matches("[0-9]+", phone)) {
            this.phone = phone;
        } else {
            System.out.println("Incorrect format, please try again");
            setPhone();
        }

    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public Teacher(int id, int courseId, Role role, String firstname, String lastname, String email) {
        this.id = id;
        this.courseId = courseId;
        this.role = role;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
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
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package hw10.course1.students;

import hw10.Entity;
import hw10.SuperRepository;

public class RepositoryStudent extends SuperRepository {
    private Student[] students = new Student[10];
    Student student = new Student();

    @Override
    public void getAll() {
        super.getAll();
    }

    //@Override
    public void add(int id, Student student) {
        students[id] = student;
    }

    @Override
    public void getById(int id) {
        student = students[id];
        System.out.println(student);
    }

    @Override
    public void deleteById(int id) {
        super.deleteById(id);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

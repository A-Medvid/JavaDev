package hw10.course1;

import hw10.Entity;

public class Course extends Entity {
    private int id;
    public Course() {
        super();
    }

    public Course(int id) {
        this.id = id;
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
    public String toString() {
        return "Course{" +
                "id=" + id +
                '}';
    }
}

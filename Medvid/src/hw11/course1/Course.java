package hw11.course1;

import hw11.Entity;

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

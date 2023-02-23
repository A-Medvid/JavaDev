package hw12.course1;

import hw12.SuperRepository;

public class RepositoryCourse extends SuperRepository {
    private Course[] courses = new Course[10];
    private Course course = new Course();

    @Override
    public void getAll() {
        for (int i = 0; i < courses.length; i++) {
            course = courses[i];
            System.out.println(course);
        }
    }

    //@Override
    public void add(int id, Course course) {
        courses[id] = course;
    }

    @Override
    public void getById(int id) {
        course = courses[id];
        System.out.println(course);
    }

    @Override
    public void deleteById(int id) {
        courses[id] = null;
    }

}

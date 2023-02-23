package hw11.course1.teachers;

import hw11.SuperRepository;

public class RepositoryTeacher extends SuperRepository {
    private Teacher[] teachers = new Teacher[10];
    private Teacher teacher = new Teacher();

    @Override
    public void getAll() {
        super.getAll();
    }

    //@Override
    public void add(int id, Teacher teacher) {
        teachers[id]= teacher;
    }

    @Override
    public void getById(int id) {
        teacher = teachers[id];
        System.out.println(teacher);
    }

    @Override
    public void deleteById(int id) {
        super.deleteById(id);
    }
}

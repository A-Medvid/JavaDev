package hw10.course1.lessons;

import hw10.SuperRepository;

import java.util.Arrays;

public class RepositoryLess extends SuperRepository {
    private Lecture[] lectures = new Lecture[10];
    private Lecture lecture = new Lecture();

    @Override
    public void getAll() {
        for (int i = 0; i < lectures.length; i++) {
            lecture = lectures[i];
            /*if (lecture == null) {
                break;
            }*/ /*Для більш красивого відобрження (не виводить у консоль null), але
            перестає правильно працювати після видалення з масиву не останньої лекції.*/
            System.out.println(lecture);
        }
    }

    //@Override
    public void add(int id, Lecture lecture) {
        lectures[id] = lecture;
        Lecture[] newArray = Arrays.copyOf(lectures,
                ((lectures.length * 3) / 2) + 1);
        lectures = newArray;
    }

    @Override
    public void getById(int id) {
        lecture = lectures[id];
        System.out.println(lecture);
    }

    @Override
    public void deleteById(int id) {
        lectures[id] = null;
    }

    public Lecture getLecture(int id) {
        lecture = lectures[id];
        return lecture;
    }

}

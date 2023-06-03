package chapter7.src.arraylist;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    ArrayList<Subject> subjectList;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s : subjectList) {
            System.out.println(name + ", " + s.getName() + ", " + s.getScore());
            total += s.getScore();
        }
        System.out.println(total);
    }
}

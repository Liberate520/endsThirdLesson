package study_group.builder;

import study_group.student.Student;

public class MyBuilder {
    private int id;

    public Student createStudent(String name, int age){
        return new Student(id++, name, age);
    }
}

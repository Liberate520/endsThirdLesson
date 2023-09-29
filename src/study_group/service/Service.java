package study_group.service;

import study_group.builder.MyBuilder;
import study_group.student.Student;
import study_group.group.StudyGroup;

public class Service {
    private MyBuilder builder;
    private StudyGroup studyGroup;

    public Service() {
        builder = new MyBuilder();
        studyGroup = new StudyGroup();
    }

    public void addStudent(String name, int age){
        Student student = builder.createStudent(name, age);
        studyGroup.addStudent(student);
    }

    public String getStudentListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");

//        Iterator<Student> iterator = studyGroup.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            stringBuilder.append(student);
//            stringBuilder.append("\n");
//        }
        for (Student student: studyGroup){
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        studyGroup.sortByName();
    }

    public void sortByAge(){
        studyGroup.sortByAge();
    }
}

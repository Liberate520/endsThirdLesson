package study_group;

import study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Маша", 18);
        service.addStudent("Даша", 19);
        service.addStudent("Саша", 21);
        service.addStudent("Паша", 20);

        System.out.println(service.getStudentListInfo());
        service.sortByName();
        System.out.println(service.getStudentListInfo());
        service.sortByAge();
        System.out.println(service.getStudentListInfo());
    }
}

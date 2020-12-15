package com.godOfJava1.c8;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Student[] student = null;
        //student = manageStudent.addStudent();
        //manageStudent.printStudents(student);
        manageStudent.checkEquals();
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return student;
    }

    public void printStudents(Student[] students){
        for(Student student : students) {
            System.out.println(student);
        }
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");

        if (a.equals(b)) {
            System.out.println("Equal");
        }
        if (!a.equals(b)) {
            System.out.println("Not Equal");
        }
    }
}

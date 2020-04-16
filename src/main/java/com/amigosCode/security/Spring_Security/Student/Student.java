package com.amigosCode.security.Spring_Security.Student;

public class Student {

    private   Integer studentId;
    private  String name;

    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}
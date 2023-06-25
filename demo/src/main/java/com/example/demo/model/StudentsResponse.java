package com.example.demo.model;

import java.util.List;

public class StudentsResponse extends Response {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

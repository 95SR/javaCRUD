package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.GenericResponse;
import com.example.demo.model.Student;
import com.example.demo.model.StudentResponse;
import com.example.demo.model.StudentsResponse;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/v1/students/")
public class StudentController {

    @Autowired
    private StudentService service;

    // @GetMapping
    // public List<Student> findAllStudents(){
    //     return service.getStudents();
    // }

    @GetMapping
    public GenericResponse<List<Student>> findAllStudents(){
        List<Student> students = service.getStudents();
        GenericResponse<List<Student>> response = new GenericResponse<List<Student>>();
        response.setData(students);
        return response;
    }

    // @GetMapping("{id}")
    // public Student findStudent(@PathVariable int id){
    //     return service.findStudent(id);

    // }

    @GetMapping("{id}")
    public StudentResponse findStudent(@PathVariable int id){
        Student student=service.findStudent(id);
        StudentResponse response = new StudentResponse();
        
        if(student != null){
            response.setStudent(student);
        }else{
            response.setSuccess(false);
            response.setCode(1);
        }

        return response;
    }
}

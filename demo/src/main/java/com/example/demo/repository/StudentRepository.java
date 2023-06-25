package com.example.demo.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.example.demo.model.Student;

@Repository
public class StudentRepository {
    private List<Student> students = new ArrayList<Student>();
    
    public StudentRepository(){
        this.students = List.of(
            new Student(1, "김길동", "남", 20, "010-1111-1111", "대전"),
            new Student(2, "나길동", "남", 20, "010-1111-1111", "대전")
        );


        // 파일 읽어오기
       
    try {
        File file;
        file = ResourceUtils.getFile("classpath:sample.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file,Charset.forName("UTF-8")));
        
            System.out.println(reader.readLine());
         
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student findStudent(int id){
        for (Student student : students) {
            if(student.getId()== id){
                return student; 
            } 
        }

        return null;
    }


}

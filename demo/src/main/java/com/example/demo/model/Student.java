package com.example.demo.model;


import org.springframework.stereotype.Component;

@Component

public class Student {
   private int id;
   private String name;
   private String sex;
   private int age;
   private String phone;
   private String residential;
   
   
   public Student(){

   }

  
   public Student(int id, String name, String sex, int age, String phone, String residential) {
    this.id = id;
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.phone = phone;
    this.residential = residential;
}

public Student(int id){
    this.id = id;
   }

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getSex() {
    return sex;
}
public void setSex(String sex) {
    this.sex = sex;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getResidential() {
    return residential;
}
public void setResidential(String residential) {
    this.residential = residential;
} 
}

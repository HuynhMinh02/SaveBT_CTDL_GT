package com.minhhh2004110025.tuan04;

public class Student {
    public String name;
    public int age;

    public Student (){};

    public Student(String n, int a){
        name = n;
        age = a;
    }

    void inThongTin(){
        System.out.println("Name: " + name + "   age: " + age);
    }
}

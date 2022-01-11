package com.minhhh2004110025.hocki1.tuan05;

import java.util.ArrayList;
import java.util.List;

import com.minhhh2004110025.hocki1.tuan04.Dog;
import com.minhhh2004110025.hocki1.tuan04.Student;

public class CTMHArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add("HUYNH HUU MINH");
        a.add(true);
        a.add(1);
        a.add(2.5);
        a.add(new Dog(22, "bảy màu", "đột biến"));

        Dog dog = (Dog)a.get(2);
        System.out.println ("Dog name: " + dog.name + "color: " + dog.color);
        System.out.println(a.get(0));

        List bienTC = new ArrayList();
        bienTC.add(new Student("Tèo",18));

        Student student = (Student)bienTC.get(0);

      System.out.println (bienTC);
    }
}
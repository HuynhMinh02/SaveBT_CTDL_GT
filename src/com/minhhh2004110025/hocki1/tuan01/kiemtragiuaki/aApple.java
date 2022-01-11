package com.minhhh2004110025.hocki1.tuan01.kiemtragiuaki;

import java.util.Scanner;

public class aApple {

     String ma;
     double khoiluong;
     String color;

    static Scanner sc = new Scanner(System.in);

    aApple() {
    }
    aApple(String id, double kl, String c){
        ma = id;
        khoiluong = kl; 
        color = c;
    }

    public void inThongTinApple(){
        System.out.println("==========Danh sách Táo(Apple)==========");
        System.out.println("Mã id: " +ma);
        System.err.println("Khối Lượng: " +khoiluong);
        System.out.println("Màu sắc: " + color);
    }
    public void nhapThongTinApple() {
        System.out.println("Mã id: ");
        ma = sc.nextLine();
        System.err.println("Màu sắc: ");
        color = sc.nextLine();
        System.out.println("Khối lượng: ");
        khoiluong = sc.nextDouble();
        sc.nextLine();
    }
}
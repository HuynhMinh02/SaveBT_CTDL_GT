package com.minhhh2004110025.hocki2.oo;

import java.util.Scanner;

public class Employee {
    int ngaylam;
    int luong = 200000;
    double tienluong = 0;
    String name;
    String sdt;

    Scanner scanner = new Scanner(System.in);
    
    void tinhLuong(){
        System.out.println("Nhập số ngày đi làm: ");
        ngaylam = scanner.nextInt();
        tienluong = ngaylam * luong;
    }

    void nhapThongTin() {
        System.out.println("Nhập tên nhân viên: ");
        name = scanner.nextLine();
        System.out.println ("Nhập số điện thoại: ");
        sdt = scanner.nextLine();
    }
    void inThongTin() {
        System.out.println("Tên NV: " + name);
        System.out.println ("Số Điện Thoại NV: " + sdt);
        System.out.println ("Lương NV: " + tienluong);
    }
}

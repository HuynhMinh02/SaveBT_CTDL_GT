package com.minhhh2004110025.hocki2.oo;

import java.util.Scanner;

public class Customer {
    String name;
    String sdt;
    String address;

    Scanner scanner = new Scanner(System.in);

    void nhapThongTin() {
        System.out.println("Nhập thông tin khách hàng: ");
        name = scanner.nextLine();
        System.out.println("Nhập SĐT khách hàng: ");
        sdt = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng: ");
        address = scanner.nextLine();
    }

    void inThongTin() {
        System.out.println("Tên KH: " + name);
        System.out.println ("SĐT KH: " + sdt);
        System.out.println ("Địa chỉ KH: " + address);
    }
}

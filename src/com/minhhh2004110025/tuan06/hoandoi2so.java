package com.minhhh2004110025.tuan06;

import java.util.Scanner;

public class hoandoi2so {
  public static void main(String[] args) {
    //sử dụng class Scanner để lấy dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    int a, b, temp;
    System.out.println("\n\nNhập vào số a: ");
    a = (int) sc.nextFloat();
    System.out.println("Nhập vào số b: ");
    b = (int) sc.nextFloat();
    temp = a;
    a = b;
    b = temp;
    System.out.println("Sau khi hoán đổi\na = " + a + "\nb = " + b);
    System.out.println("---------------------------------");
  }
}


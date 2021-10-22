package com.minhhh2004110025.tuan04;

import java.util.Scanner;
import java.util.ArrayList;

public class lap4bai1{
    public static void main(String[] args) {
    ArrayList <Double> list = new ArrayList<Double>();
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.print("Nhập số thực tùy ý: ");
        double x = sc.nextDouble();
        list.add(x);
        System.out.print("Nhập thêm (Y/N)?: ");
        sc.nextLine();
        if(sc.nextLine().equals("N"))
            break;
    }
    double tong = 0;
    for (Double x : list) {
        System.out.print(x+"    ");
        tong += x;
    }
    System.out.println("\nTổng = " + tong);
    sc.close();
    }
}
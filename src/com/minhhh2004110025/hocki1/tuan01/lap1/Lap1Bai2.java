package com.minhhh2004110025.hocki1.tuan01.lap1;

import java.util.Scanner;
public class Lap1Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài hình chữ nhật:");
        double cdai = scanner.nextDouble();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
        double crong = scanner.nextDouble();
        double chuVi = (cdai + crong)*2;
        System.out.println("Chu vi hình chữ nhật là:"+ chuVi);
        double dienTich = cdai*crong;
        System.out.println("Diện tích hình chữ nhật là:"+dienTich);
    }
}

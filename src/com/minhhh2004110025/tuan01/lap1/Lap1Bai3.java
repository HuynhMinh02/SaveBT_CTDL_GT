package com.minhhh2004110025.tuan01.lap1;

import java.util.Scanner;

public class Lap1Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cạnh khối lập phương:");
        double canh = scanner.nextDouble();
        double theTich = canh * canh * canh;
        System.out.println("Thể tích khối lập phương là: " + theTich);
    }
}
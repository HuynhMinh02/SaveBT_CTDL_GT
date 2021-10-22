package com.minhhh2004110025.tuan01.lap1;
import java.util.Scanner;
public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hovaten = scanner.nextLine();
        System.out.print("Diem trung binh: ");
        Double diemTb = scanner.nextDouble();
        System.out.printf("%s: %.2f diem",hovaten, diemTb); 
    }
}

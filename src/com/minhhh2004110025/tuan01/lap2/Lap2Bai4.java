package com.minhhh2004110025.tuan01.lap2;

import java.util.Scanner;

public class Lap2Bai4 {
    public static void main(String[] args) {
        int soChon;
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. Giải phương trình bậc nhất!");
            System.out.println("2. Giải phương trình bậc hai!"); 
            System.out.println("3. Tính tiền điện!"); 
            System.out.println("4. Kết thúc!"); 
            System.out.println("-------------------------------------------------");
            do {
                System.out.println("Bấm số để chọn (1/2/3/4): ");
                soChon = scanner.nextInt();
            } while ((soChon < 1) || (soChon > 4));
             
            switch (soChon) {
                case 1:
                    System.out.println("Bạn chọn chức năng Giải phương trình bậc nhất !");
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng Giải phương trình bậc hai!");
                    break;
                case 3:
                    System.out.println("Bạn chọn chức năng Tính tiền điện!");
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                    break;
            }
        }
    }
    
}

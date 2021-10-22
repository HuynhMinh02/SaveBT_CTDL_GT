package com.minhhh2004110025.tuan06;

import java.util.Scanner;

public class viduMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = scanner.nextInt();
        // khởi tạo mảng
        int [] arr = new int[n];
        System.out.println("===========Nhập phần tử của mảng================");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            arr[i] = scanner.nextInt(); 
        }
        System.out.println("Các phần từ của mảng: ");
        show(arr);
    }
    // in mảng ra màn hình
    private static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
    }

}

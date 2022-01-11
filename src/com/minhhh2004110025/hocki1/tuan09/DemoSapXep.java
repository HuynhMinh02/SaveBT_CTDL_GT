package com.minhhh2004110025.hocki1.tuan09;

public class DemoSapXep {
    public void selectionSort(int arr[]) {
        int index, i, j;
 
        // lap qua ta ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            // thiet lap phan tu hien tai la min
            index = i;
 
            // kiem tra phan tu hien tai co phai la nho nhat khong
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
 
            if (index != i) {
                System.out.println(" ==> Trao doi phan tu: [" + arr[i] 
                        + ", " + arr[index] + "]");
                // Trao doi cac so
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
 
            System.out.println("Vong lap thu " + (i + 1));
            xuat(arr);
        }
    }
 
    public void xuat(int arr[]) {
        int i;
        System.out.print("[");
 
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
        System.out.print("]\n");
    }
 
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
 
        DemoSapXep demoSapXep = new DemoSapXep();
        System.out.println("Mang du lieu dau vao: ");
        demoSapXep.xuat(arr);
        System.out.println("-----------------------------");
        demoSapXep.selectionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        demoSapXep.xuat(arr);
    }
}


package com.minhhh2004110025.tuan09;

public class SapXepLuaChon {
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
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            xuat(arr);
        }

    }
    public void xuat(int arr[]) {
        System.out.println("Mang sau khi sap xep la:");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
 
        DemoSapXep demoSapXep = new DemoSapXep();

        demoSapXep.selectionSort(arr);
        demoSapXep.xuat(arr);
    }
}
    


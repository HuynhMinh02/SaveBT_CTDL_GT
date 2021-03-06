package com.minhhh2004110025.hocki1.tuan09;

public class DemoBubbeleSort {
    public void bubbleSort(int arr[]) {
        int temp;
        int i, j;
 
        boolean swapped = false;
 
        // lap qua tat ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
 
            // vong lap thu hai
            for (j = 0; j < arr.length - 1 - i; j++) {
                System.out.print("So sanh cac phan tu: [" + arr[j] + ", " + arr[j + 1] + "]");
 
                // kiem xa xem so ke tiep co nho hon so hien tai hay khong
                // trao doi cac so.
                // (Muc dich: lam noi bot (bubble) so lon nhat)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
 
                    swapped = true;
                    System.out.println(" => hoan doi [" + arr[j] + ", " + arr[j + 1] + "]");
                } else {
                    System.out.println(" => khong can trao doi.");
                }
            }
 
            // neu khong can trao doi nua, tuc la
            // mang da duoc sap xep va thoat khoi vong lap.
            if (!swapped) {
                break;
            }
 
            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }
 
    public void display(int arr[]) {
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
        int arr[] = { 2, 12, 8, 5, 1, 6, 4, 15 };
 
        DemoBubbeleSort sapXepNoBot = new DemoBubbeleSort();
        System.out.println("Mang du lieu dau vao: ");
        sapXepNoBot.display(arr);
        System.out.println("-----------------------------");
        sapXepNoBot.bubbleSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepNoBot.display(arr);
    }
    
}

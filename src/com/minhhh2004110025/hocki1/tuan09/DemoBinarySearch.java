package com.minhhh2004110025.tuan09;

public class DemoBinarySearch {
    public static int binarySearch (int arr[], int x){
        int l = 0, r = arr.length - 1;
        while (l <= r){
            int m = l + (r - l) / 2;

            if (arr[m] == x) return m;

            if (arr[m] < x) l = m + 1 ;
            else
            r = m - 1;
        }
        return -1;
    }
    public static void main (String[] args){
        DemoBinarySearch timKiem = new DemoBinarySearch();
        int arr[] = {2, 3, 4, 5, 41, 48, 49, 50};
        int n = arr.length;
        int x = 48;
        int result = timKiem.binarySearch(arr, x);
        if (result == -1)
        System.out.println("So khong co trong mang");
        else
        System.out.println("So thuoc mang va nam o vi tri: " + result);
    }
    
}

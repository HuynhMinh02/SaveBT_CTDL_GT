package com.minhhh2004110025.hocki1.tuan03;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class lap3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số bất kỳ từ bàn phím: ");
        int N = scanner.nextInt();
        lap3Bai1 snt = new lap3Bai1();
        if (snt.ktraSoNT(N) == true) {
            System.out.println(N + " là số nguyên tố");
        } else {
            System.out.println(N + " không phải là số nguyên tố");
        }
    }

    // hàm bool trả về true/false
    public boolean ktraSoNT(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= sqrt((float) n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

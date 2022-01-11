package com.minhhh2004110025.tuan01.lap1;

import java.util.Scanner;

public class Lap1Bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số bậc hai của PTB2:");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số bậc nhất của PTB2:");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số tự do của PTB2:");
        double c = scanner.nextDouble();
        double Delta = Math.pow(b, 2)-4*a*c;
        System.out.println("Delta cua PTB2: " + Delta);
        double canDelta = Math.sqrt(Delta);
        System.out.println("Căn Delta của PTB2: " + canDelta);
    }
}
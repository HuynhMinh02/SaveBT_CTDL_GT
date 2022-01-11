package com.minhhh2004110025.hocki1.tuan01.lap2;

import java.util.Scanner;

public class Lap2Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện năng tiêu thụ trong 1 tháng: ");
        float soDien = scanner.nextFloat();
        float tienDien ;
        if (soDien < 50)
            tienDien = soDien * 1000;
        else
            tienDien = 50 * 1000 + (soDien - 50)*1200 ;
        System.out.println("Số tiền điện trong 1 tháng là: " + tienDien);
    }    
}
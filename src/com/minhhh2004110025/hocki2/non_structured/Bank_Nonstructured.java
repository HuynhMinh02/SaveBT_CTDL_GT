package com.minhhh2004110025.hocki2.non_structured;

import java.util.Scanner;

public class Bank_Nonstructured {
    public static void main(String[] args) {
        //data
        //khai báo 2 biến
        int account_number = 12345;
        int account_banlance = 0;

        // thao tác
        Scanner input = new Scanner(System.in);

        //gửi tiền điện
        System.out.print("Nhập vào số tiền cần gửi: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_banlance += depositAmount; // thao tác lên data

        // in thong tin tài khoản
        System.out.println("Thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println ("Account balance: " + account_banlance );

        //rút tiền
        System.out.print("Nhập vào số tiền cần rút: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount; // thao tác lên data

        // in thong tin tài khoản
        System.out.println("Thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println ("Account balance: " + account_banlance );
    }
}

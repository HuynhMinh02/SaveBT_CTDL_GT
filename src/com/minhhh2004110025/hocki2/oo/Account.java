package com.minhhh2004110025.hocki2.oo;

import java.util.Scanner;

public class Account {
    int account_banlance = 0;
    int account_number = 12345;

    Scanner scanner = new Scanner(System.in);

    void deposit() {
        System.out.print("Nhập vào số tiền cần gửi: ");
        int depositAmount = 0;
        depositAmount = scanner.nextInt();
        account_banlance += depositAmount; // thao tác lên data
    }
    void withdraw(){
        System.out.print("Nhập vào số tiền cần rút: ");
        int withdrawAmount = 0;
        withdrawAmount = scanner.nextInt();
        account_banlance -= withdrawAmount; // thao tác lên data
    }
    void show() {
        System.out.println("Thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println ("Account balance: " + account_banlance );
    }
}

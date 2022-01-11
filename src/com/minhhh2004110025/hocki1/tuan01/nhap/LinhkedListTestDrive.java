package com.minhhh2004110025.hocki1.tuan01.nhap;

import java.util.Scanner;

public class LinhkedListTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng táo :");
        int sL = sc.nextInt();
        Linkedlist danhSach = new Linkedlist(sL); 

        danhSach.NhapDSApple();

        danhSach.inDanhSach();

        danhSach.themVaoDau();

        danhSach.themVaoCuoi();

        System.out.println("====Danh sách sau khi thêm ====");
        danhSach.inDanhSach();

        System.out.print("Nhập mã táo muốn thêm vào đằng trước: ");
        int vitriThem = sc.nextInt();
        danhSach.themApple(vitriThem);
        danhSach.inDanhSach();

        System.out.println("Danh sách sau khi xóa cuối: ");
        danhSach.xoaTail();
        danhSach.inDanhSach();

    }
}

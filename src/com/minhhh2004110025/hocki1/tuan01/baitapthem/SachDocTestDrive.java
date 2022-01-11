package com.minhhh2004110025.tuan01.baitapthem;

public class SachDocTestDrive {
    public static void main(String[] args) {
        SachDoc sachDoc;
        sachDoc = new SachDoc();
        sachDoc.tenSach = "Nhà giả Kim";
        sachDoc.nhaXuatban = "Paulo Coelho";
        sachDoc.namXuatban = 1988;
        sachDoc.giaBan = 200000;
        sachDoc.soLuong = 50;
        sachDoc.loaiSach = "Tiểu thuyết";

        sachDoc.inThongtinSach();
    }
}

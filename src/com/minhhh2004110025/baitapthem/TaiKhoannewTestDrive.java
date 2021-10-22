package com.minhhh2004110025.baitapthem;

public class TaiKhoannewTestDrive {
    public static void main(String[] args) {
        TaiKhoannew taiKhoannew;
        taiKhoannew = new TaiKhoannew("HUỲNH HỮU MINH","77112051118999",52000);
        System.out.println("Tên chủ tài khoản:" +taiKhoannew.tenChuTK);
        System.out.println("Số Tài khoản: " +taiKhoannew.soTK);
        System.out.println("Số dư Tài Khoản: " + taiKhoannew.soDuTk + "VNĐ");
    }
    
}

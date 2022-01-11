package com.minhhh2004110025.hocki1.tuan01.baitapthem;

public class NhanVienTestDrive {
    public static void main (String[] args) throws Exception {
        NhanVien nhanVien = new NhanVien();
        nhanVien.tenNhanvien = "Huỳnh Hữu Minh";
        nhanVien.ngaySinh = "30/09/2002";
        nhanVien.diaChi = "Kiên Giang";
        nhanVien.boPhanlamviec = "Quản lí";
        nhanVien.luongUSD = 5000;
        
        nhanVien.inThongtinNhanvien();
    }
    
}

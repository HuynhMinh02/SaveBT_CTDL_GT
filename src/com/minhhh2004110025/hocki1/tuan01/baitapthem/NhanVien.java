package com.minhhh2004110025.hocki1.tuan01.baitapthem;

public class NhanVien {
    String tenNhanvien ;
    int luongUSD ;
    String diaChi;
    String boPhanlamviec;
    String ngaySinh;
    void inThongtinNhanvien(){
        System.out.println ("Tên nhân viên: " + tenNhanvien);
        System.out.println ("Ngày sinh: " + ngaySinh);
        System.out.println ("Địa chỉ: " + diaChi);
        System.out.println ("Bộ phận làm việc: " + boPhanlamviec);
        System.out.println ("Lương của NV (USD): " + luongUSD + "USD");
    }
}

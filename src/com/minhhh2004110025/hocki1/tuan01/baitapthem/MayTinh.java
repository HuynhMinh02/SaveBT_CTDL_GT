package com.minhhh2004110025.hocki1.tuan01.baitapthem;

public class MayTinh {
    String nhaSanxuat;
    int namSanxuat;
    String heDieuhanh;
    String ram;
    String cpu;
    int giaMay;
    int namBaohanh;

    void inThongtinMaytinh() {
        System.out.println ("Nhà sản xuất: " + nhaSanxuat);
        System.out.println ("Năm sản xuất: " + namSanxuat);
        System.out.println ("Hệ điều hành: " + heDieuhanh);
        System.out.println ("Ram: " + ram);
        System.out.println ("CPU: " + cpu);
        System.out.println ("Giá máy tính: " + giaMay + "USD");
        System.out.println ("Năm bảo hành: " + namBaohanh + "tháng");
    }
}

package com.minhhh2004110025.baitapthem;

public class NhanViennewTestDriver {
    public static void main(String[] args) {
        NhanViennew nhanViennew;
        nhanViennew = new NhanViennew("Huỳnh Hữu Minh",5000,"Kiên Giang","Quản lí","30/09/2002");

        System.out.println ("Tên nhân viên: " + nhanViennew.tenNhanvien);
        System.out.println ("Ngày sinh: " + nhanViennew.ngaySinh);
        System.out.println ("Địa chỉ: " + nhanViennew.diaChi);
        System.out.println ("Bộ phận làm việc: " + nhanViennew.boPhanlamviec);
        System.out.println ("Lương của NV (USD): " + nhanViennew.luongUSD + "USD");
    }
    
}

package com.minhhh2004110025.hocki1.baitapthem;

public class SachDocnewTestDrive {
    public static void main(String[] args) {
        SachDocnew sachDocnew;
        sachDocnew = new SachDocnew("Nhà giả Kim","Paulo Coelho",1988,200000,50,"Tiểu thuyết");

        System.out.println ("Tên sách: " + sachDocnew.tenSach);
        System.out.println ("Nhà xuất bản: " + sachDocnew.nhaXuatban);
        System.out.println ("Năm xuất bản: " + sachDocnew.namXuatban);
        System.out.println ("Giá bán: " +sachDocnew.giaBan);
        System.out.println ("Số lượng: " +sachDocnew.soLuong);
        System.out.println ("Loại sách: " +sachDocnew.loaiSach);
    }
    
}

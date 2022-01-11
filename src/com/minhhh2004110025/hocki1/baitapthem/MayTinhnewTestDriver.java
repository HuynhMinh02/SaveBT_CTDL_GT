package com.minhhh2004110025.hocki1.baitapthem;

public class MayTinhnewTestDriver {
    public static void main(String[] args) {
        MayTinhnew mayTinhnew;
        mayTinhnew = new MayTinhnew("Không rõ", 2021, "Window 11", "Dual Channel 128G bus 3400Mhz", "Intel Core i9 11900K (8 nhân/5.3GHz)",100000, 3);

        System.out.println ("Nhà sản xuất: " + mayTinhnew.nhaSanxuat);
        System.out.println ("Năm sản xuất: " + mayTinhnew.namSanxuat);
        System.out.println ("Hệ điều hành: " + mayTinhnew.heDieuhanh);
        System.out.println ("Ram: " + mayTinhnew.ram);
        System.out.println ("CPU: " + mayTinhnew.cpu);
        System.out.println ("Giá máy tính: " + mayTinhnew.giaMay + "USD");
        System.out.println ("Năm bảo hành: " + mayTinhnew.namBaohanh + "tháng");
    }
    
}

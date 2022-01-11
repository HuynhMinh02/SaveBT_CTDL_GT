package com.minhhh2004110025.hocki1.tuan01.baitapthem;

public class MayTinhTestDrive {
    public static void main(String[] args){
        MayTinh mayTinh = new MayTinh();
        mayTinh.nhaSanxuat = "Không rõ";
        mayTinh.namSanxuat = 2020;
        mayTinh.heDieuhanh = "Window";
        mayTinh.ram = "Dual Channel 128G bus 3400Mhz";
        mayTinh.cpu = "Intel Core i9 11900K (8 nhân/5.3GHz)";
        mayTinh.namBaohanh = 3 ;
        mayTinh.giaMay = 100000;

        mayTinh.inThongtinMaytinh();
    }
    
}

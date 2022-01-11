package com.minhhh2004110025.hocki1.tuan01.baitapthem;

public class XeHoi {
    String tenChuXeHoi;
    String hangSanxuat;
    String dongXeHoi;
    String giayPheplaixe;
    int dungTichXang;

    void inThongtinChuxe(){
        System.out.println ("Tên chủ xe: " + tenChuXeHoi);
        System.out.println ("Số: " + giayPheplaixe);
        System.out.println ("Hãng sản xuất: " + hangSanxuat);
        System.out.println ("Dòng xe hơi: " + dongXeHoi);
        System.out.println ("Dung tích xăng: " + dungTichXang + "cc");
    }
}

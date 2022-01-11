package com.minhhh2004110025.hocki1.tuan02;
import java.util.Date; 

public class SinhVien {
    String mssv;
    String tenSinhVien;
    int tuoi;

    String queQuan;

    Date ngaySinh;

    void inThongTinSV (){
        System.out.println ("Mã số sinh viên: " + mssv);
        System.out.println("Tên sinh viên: " + tenSinhVien);
        System.out.println("Tuổi sinh viên: " + tuoi);
        System.out.println("Quê quán sinh viên: " + queQuan);
        System.out.println("Ngày sinh sinh viên: " + ngaySinh);
    }
}

package com.minhhh2004110025.baithicuoihocki;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangHoa {
    static int autoId;
    int id;
    String loaiHang;
    String name;
    double giaNhap;
    int tonKho;
    Date ngayNhapHang = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    String strDate = formatter.format(ngayNhapHang);
    private Node head, tail;

    public HangHoa(String loai, String name, double gia, Date nnk, int tonKho) {
        this.id = HangHoa.autoId++;
        this.loaiHang = loai;
        this.name = name;
        this.giaNhap = gia;
        this.ngayNhapHang = nnk;
        this.tonKho = tonKho;
    }

    public HangHoa() {
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaiHang(){
        return this.loaiHang;
    }

    public void setLoaiHang(String loai){
        this.loaiHang = loai;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getGiaNhap() {
        return this.giaNhap;
    }

    public void setGiaNhap(double gia){
        this.giaNhap = gia;
    }

    public Date getNgayNhapHang(){
        return this.ngayNhapHang;
    }

    public void setNgayNhapHang(Date nkk){
        this.ngayNhapHang = nkk;
    }

    public int getTonKho(){
        return this.tonKho;
    }

    public void setTonKho(int tk){
        this.tonKho = tk;
    }

    public String getStrDate() {
        return strDate;
    }
    
    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }
}

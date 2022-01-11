package com.minhhh2004110025.hocki1.tuan05;

public class SVGD {
    private String hoTen;
    private double diemTB;

    public SVGD (){
        this.hoTen = null;
        this.diemTB = 0;
    }
    public SVGD (String hoTen, double diemTB){
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    public void setTen (String hoTen){
        this.hoTen = hoTen;
    }

    public String getTen(){
        return this.hoTen;
    }

    public void setDiem(double diemTB){
        this.diemTB = diemTB;
    }

    public double getDiem(){
        return this.diemTB;
    }
}
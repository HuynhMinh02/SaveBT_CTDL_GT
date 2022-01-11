package com.minhhh2004110025.tuan04;

public class sanPham {
    private String ten;
    private double donGia;

    public sanPham (){
        this.ten = null;
        this.donGia = 0;
    }

    public sanPham(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return this.ten;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return this.donGia;
    }
    
}

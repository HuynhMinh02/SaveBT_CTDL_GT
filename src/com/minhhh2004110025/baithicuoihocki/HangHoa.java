package com.minhhh2004110025.baithicuoihocki;

import java.util.Scanner;

public class HangHoa {
    String loaiHang;
    String maHang;
    String name;
    double giaNhap;
    int tonKho;

    HangHoa(){

    }
    HangHoa(String loai, String id, String ten, double gia, int tk){
        loaiHang = loai ;
        maHang = id ;
        name = ten ;
        giaNhap = gia ;
        tonKho = tk ;
    }
    Scanner scanner = new Scanner(System.in);
    void nhapthongtinHangHoa(){
        System.out.println ("Loại Hàng Hóa: ");
        loaiHang = scanner.nextLine();
        System.out.println ("Mã ID: ");
        maHang = scanner.nextLine();
        System.out.println ("Tên hàng hóa: ");
        name = scanner.nextLine();
        System.out.println ("Giá sản phẩm nhập: ");
        giaNhap = scanner.nextDouble();
        System.out.println ("Số lượng sản phẩm trong kho: ");
        tonKho = scanner.nextInt();
    }
    void inthongtinHangHoa(){
        System.out.println("_______________>><<_______________");
        System.out.println("Loại: " + loaiHang);
        System.out.println("Id: " + maHang);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá nhập: " + giaNhap);
        System.out.println("Số lượng hàng tồn kho: " + tonKho);
        System.out.println("_______________>><<_______________");
    }
}

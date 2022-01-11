package com.minhhh2004110025.hocki1.tuan04;

import java.util.Arrays;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        //cú pháp khai báo mảng
        int[] mangSoNguyen;//chưa chỉ định số phần tử

        mangSoNguyen = new int[5];//=> mảng trong java là 1 kiểu tham chiếu đối tượng

        
        double mangSoThuc[] = new double[10];


        //trước khi dùng thì phải xác định số phần tử của mảng
        mangSoNguyen[0] = 2;

        //KHAI BÁO CÓ KHỞI TẠO GIÁ TRỊ CHO MẢNG
        double diemMonHoc[] = new double[]{10, 5, 8, 9};
        System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));
        diemMonHoc[0] = diemMonHoc[1];
        //5.5, 5.5, 3.0, 4.5
        
        System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));

        System.out.println("Số phần tử của mảng điểm môn học: "+ diemMonHoc.length);


        //CÁCH 2
        String dsTenSinhVien[] = {"Tèo", "Tý", "Tửng"};

        //dùng vòng lặp để duyệt mảng
        System.out.println("=================DUYỆT MẢNG =========================");

        for(int i = 0; i < diemMonHoc.length; i++){
            System.out.println(diemMonHoc[i]);
        }

        System.out.println("==================For each ==========================");
        //FOR-EACH
        for(double diem : diemMonHoc){

            System.out.println(diem);

        }
        //mảng có dữ liệu tham chiếu đối tượng
        Dog [] danhsachDog = new Dog[7];

        Dog dog0 = new Dog(10, "Đen", "Fido");
        Dog dog1 = new Dog(7, "Vàng", "La La");
        Dog dog2 = new Dog(25, "Đen trắng", "Lulu");

        danhsachDog[0] = dog0;
        danhsachDog[2] = dog2;
        danhsachDog[3] = dog1;

        danhsachDog[1] = new Dog(55, "Xám", "Nanh trắng");

        danhsachDog[3].inThongTin();


    }
}
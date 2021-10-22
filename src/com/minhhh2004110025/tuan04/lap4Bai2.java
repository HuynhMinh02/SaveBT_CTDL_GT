package com.minhhh2004110025.tuan04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class lap4Bai2{
    static Scanner sc = new Scanner(System.in);
    static ArrayList <String> list = new ArrayList<String>();
    static void Menu(){
        System.out.println("------------------MENU------------------");
        System.out.println(">>1. Nhập danh sách họ và tên.");
        System.out.println(">>2. Xuất danh sách vừa nhập.");
        System.out.println(">>3. Xuất danh sách ngẫu nhiên.");
        System.out.println(">>4. Sắp xếp giảm dần và xuất danh sách.");
        System.out.println(">>5. Tìm và xoá họ tên nhập từ bàn phím.");
        System.out.println(">>6. Kết thúc.");
        System.out.print("Chọn chức năng: ");
        int key = sc.nextInt();
        sc.nextLine();
        switch(key){
            case 1:
                System.out.println("Bạn chọn chức năng Nhập danh sách họ và tên !");
                nhap();
                break;
            case 2:
                System.out.println("Bạn chọn chức năng Xuất danh sách vừa nhập !");
                xuat();
                break;
            case 3:
                System.out.println("Bạn chọn chức năng Xuất danh sách ngẫu nhiên !");
                xuatNgauNhien();
                break;
            case 4:
                System.out.println("Bạn chọn chức năng Sắp xếp giảm dần và xuất danh sách !");
                sapXep();
                break;
            case 5:
                System.out.println("Bạn chọn chức năng Tìm và xóa họ tên nhập từ bàn phím !");
                xoa();
                break;
            case 6:
                System.out.println("Bạn chọn chức năng kết thúc! Tạm biệt!");
                System.exit(0);
                break;
        }
    }
    static void nhap(){
        while(true){
            System.out.print("Nhập họ và tên: ");
            String x = sc.nextLine();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)?: ");
            if(sc.nextLine().equals("N"))
                break;
        }
    }
    static void xuat(){
        for (String a : list){
            System.out.println("Họ và tên: " +a);
        }    
    }
    static void xuatNgauNhien(){
        Collections.shuffle(list);
        xuat();
    }
    static void sapXep(){
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }
    static void xoa(){
        System.out.print("Nhập tên cần xoá: ");
        String name = sc.nextLine();
        for (String a : list) {
            if(a.equals(name)){
                list.remove(a);
                System.out.println("Đã xoá!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        do {
            Menu();
            System.out.print("Quay trở về MENU lựa chọn ?(y/n): ");
        } while(sc.nextLine().equals("y"));
    }  
    
}





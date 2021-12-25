package com.minhhh2004110025.baithicuoihocki;

import java.util.Scanner;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

public class HangHoaTestDrive {
    public void Menu(){
        do{
            System.out.println("|>>>>>>>>>>>>>>>>>MENU<<<<<<<><<<<<<<<|");
            System.out.println("|>>1. Thêm sản phẩm.                  |");
            System.out.println("|>>2. Xóa sản phẩm.                   |");
            System.out.println("|>>3. Tìm kiếm sản phẩm.              |");
            System.out.println("|>>4. Sắp xếp  sản phẩm.              |");
            System.out.println("|>>5. Thông kế sản phẩm trong kho.    |");
            System.out.println("|>>6. Kết thúc!                       |");
            System.out.println("|>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<|");
            System.out.print("Hãy lựa chọn số từ 1 -> 6: ");
            Scanner scanner = new Scanner(System.in);
            int soChon = scanner.nextInt();
            scanner.nextLine();
            switch(soChon){
                case 1:
                    System.out.println("_______Bạn đã chọn Thêm sản phẩm_______");
                    MenuAdd();

                    break;
                case 2:
                    System.out.println("_______Bạn đã chọn Xóa sản phẩm_______");
                    
                    break;
                case 3:

                     System.out.println("_______Bạn đã chọn tìm và xoá sản phẩm_______");
                
                     break;
                case 4:
                     System.out.println("_______Bạn đã chọn sắp xếp sản phẩm_______");
                     
                    break;
                case 5:

                    System.out.println("_______Bạn đã chọn Thống kê các sản phẩm trong kho_______");
                    
                    break;
                case 6:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai !");    
            }    
        }while(true);
    }
    public void MenuAdd(){
        System.out.println("1. Thêm vào đầu!");
        System.out.println("2. Thêm vào vị trí bất kì!");
        System.out.println("3. Thêm vào cuối!");
        System.out.println("Hãy lựa chọn cách thêm");
        Scanner scanner = new Scanner(System.in);
        int key1 = scanner.nextInt();
        scanner.nextLine();
        switch(key1){
            case 1:
                System.out.println("_______Bạn đã chọn Thêm vào đầu_____");

                break;
            case 2:
                System.out.println("_______Bạn đã chọn Thêm vào vị trí bất kì______");

                break;
            case 3:
                System.out.println("_______Bạn đã chọn thêm vào cuối____");
                System.exit(0);
            default:
                System.out.println("Lựa chọn sai");
        }while(true);
    }
}

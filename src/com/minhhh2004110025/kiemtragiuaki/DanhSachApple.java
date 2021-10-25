package com.minhhh2004110025.kiemtragiuaki;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachApple {
    
    static ArrayList<aApple> aapple = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public void Menu(){
        do{
            System.out.println("|>>>>>>>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<<|");
            System.out.println("|>>1. Nhập danh sách Apple.                    |");
            System.out.println("|>>2. Xuất danh sách Apple.                    |");
            System.out.println("|>>3. Tìm táo theo màu                         |");
            System.out.println("|>>4. Thêm táo vào kho.                        |");
            System.out.println("|>>5. Kết thúc!                                |");
            System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<|");
            System.out.print("Hãy lựa chọn số từ 1 -> 5: ");
            Scanner scanner = new Scanner(System.in);
            int soChon = scanner.nextInt();
            scanner.nextLine();
            switch(soChon){
                case 1:
                    System.out.println("_______Bạn đã chọn nhập danh sách sản Apple_______");
                    nhapThongTinApple();
                    break;
                case 2:

                    System.out.println("_______Bạn đã chọn xuất danh sách sản Apple_______");
                    intThongTinApple();
                    break;
                case 3:

                    System.out.println("_______Bạn đã chọn tìm táo theo màu_______");
                    intThongTinApple();
                    break;
                case 4:

                    System.out.println("_______Bạn đã chọn thêm táo vào kho_______");

                    break;
                case 5:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai !");    
            }    
            System.out.println("Quay về MENU (y/n)?: ");
            input.nextLine();
        }while(input.nextLine().equals("y"));   
    }

    public void nhapThongTinApple(){
        while(true){

            aApple apple = new aApple();
            apple.nhapThongTinApple();

            input.nextLine();
            aapple.add(apple);

            System.out.println("Nhập thêm táo: (y/n) ?");
            if(input.nextLine().equals("n"))
            break;
        }
    }
    
    public void intThongTinApple(){
        for(aApple apple: aapple){
            apple.inThongTinApple();
        }
    }

    public void timTaotheocolor(){
        System.out.println("Màu cần tìm là: ");
        for(aApple apple: aapple){
            if(input.nextLine().equals(apple.color))
            {
            apple.inThongTinApple();
            }
        }
    }
}
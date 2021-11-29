package com.minhhh2004110025.baithicuoihocki;

import java.util.Scanner;

public class HangHoaTestDrive {
    public void Menu(){
        do{
            System.out.println("|>>>>>>>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<<|");
            System.out.println("|>>1. Nhập danh sách sản phẩm.                 |");
            System.out.println("|>>2. Xuất danh sách sản phẩm.                 |");
            System.out.println("|>>3. Sắp xếp sản phẩm giảm dần theo giá.      |");
            System.out.println("|>>4. Tìm và xoá sản phẩm.                     |");
            System.out.println("|>>5. Xuất giá trung bình của các sản phẩm.    |");
            System.out.println("|>>6. Kết thúc!                                |");
            System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<|");
            System.out.print("Hãy lựa chọn số từ 1 -> 6: ");
            Scanner scanner = new Scanner(System.in);
            int soChon = scanner.nextInt();
            scanner.nextLine();
            switch(soChon){
                case 1:
                    System.out.println("_______Bạn đã chọn nhập danh sách sản phẩm_______");
                    break;
                case 2:

                    System.out.println("_______Bạn đã chọn xuất danh sách sản phẩm_______");
                    
                    break;
                case 3:

                    System.out.println("_______Bạn đã chọn sắp xếp sản phẩm giảm dần theo giá_______");
                    
                    break;
                case 4:

                    System.out.println("_______Bạn đã chọn tìm và xoá sản phẩm_______");
                    
                    break;
                case 5:

                    System.out.println("_______Bạn đã chọn xuất giá trung bình của các sản phẩm_______");
                    
                    break;
                case 6:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai !");    
            }    
        }while(true);
    }
}

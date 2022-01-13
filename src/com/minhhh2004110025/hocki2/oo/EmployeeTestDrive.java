package com.minhhh2004110025.hocki2.oo;

import java.util.Scanner;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("|>>>>>>>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<<|");
            System.out.println("|>>1. Nhập tên nhân viên.                      |");
            System.out.println("|>>2. Xuất danh sách nhân viên.                |");
            System.out.println("|>>3. Tính lương nhân viên.                    |");
            System.out.println("|>>4. Kết thúc! Chào tạm biệt.                 |");
            System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<|");
            System.out.print("Hãy lựa chọn số từ 1 -> 4: ");
            int key = scanner.nextInt();
            scanner.nextLine();
            switch(key){
                case 1:
                    System.out.println("_______Bạn đã chọn nhập thông tin nhân viên_______");
                    employee.nhapThongTin();
                    break;
                case 2:

                    System.out.println("_______Bạn đã chọn xuất thông tin nhân viên_______");
                    employee.inThongTin();
                    break;
                case 3:
                    System.out.println("_______Bạn đã chọn tình lương_______");
                    employee.tinhLuong();
                    employee.inThongTin();
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai !");    
            }
        }while(true);   
    }
}



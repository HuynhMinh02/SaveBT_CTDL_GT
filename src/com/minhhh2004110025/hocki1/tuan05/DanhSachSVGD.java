package com.minhhh2004110025.hocki1.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSVGD {
   private ArrayList <SVGD> list = new ArrayList<>();

   public void nhapDsSVGD (){
       System.out.println("Nhập danh sách sinh viên!");
       Scanner scanner = new Scanner(System.in);
       int i = 1;
       do{
           System.out.printf("Tên sinh viên thứ %d: ",i);
           String s = scanner.nextLine();
           if (s == null || s.equals("")){
               break;
           }
           System.out.print("Điểm trung bình của sinh viên: ");
           double diemTB = scanner.nextDouble();
           list.add(new SVGD (s, diemTB));
           scanner.nextLine();
           i++;
       }while(true);
   }
   public void inThongTinSVGD(){
        System.out.println("=================Danh sách sinh viên============");
        System.out.println("Tên SV:\t\t\t|Điểm TB:\t\t");
        for (SVGD  svgd : list){
        System.out.printf("%10s\t\t| %.3f \n",svgd.getTen(), svgd.getDiem());
      }
   }

   public void xuatSVtheoDiem(){

   }

   public void timSV(){
       
   }

   public void suaSV(){

   }
   public void XoaSVGDtheoten (){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập tên sinh viên cần xóa: ");
       String hoTen = scanner.nextLine();
       SVGD tk = null;

       for (SVGD svgd : list) {
           if (svgd.getTen().equals(hoTen)){
               tk= svgd;
               break;
           }
       }
       if (tk != null){
           list.remove(tk);
           System.out.println("Sinh viên đã được xóa khỏi danh sách thành công!!");
       }else
        {
            System.out.println("Không có tên sinh viên trong danh sách!!");

        }
   }
   public void Menu (){
       do{
        System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<<<<|");
        System.out.println("|>>1. Nhập danh sách sinh viên!                   |");
        System.out.println("|>>2. Xuất danh sách sinh viên!                   |");
        System.out.println("|>>3. Xuất danh sách sinh viên theo khoảng điểm!  |");
        System.out.println("|>>4. Tìm sinh viên theo họ va tên!               |");
        System.out.println("|>>5. Tìm và sửa sinh viên theo họ tên!           |");
        System.out.println("|>>6. Tìm và xóa sinh viên theo họ tên!           |");
        System.out.println("|>>7. Kết thúc!!                                  |");
        System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<|");
        System.out.println("Bấm số để chọn (1/2/3/4/5/6/7): ");
        Scanner scanner = new Scanner(System.in);
        int soChon = scanner.nextInt();
        scanner.nextLine();
        switch(soChon){
            case 1:
                    System.out.println("_______Bạn đã chọn nhập danh sách sinh viên_______");
                    nhapDsSVGD();
                    break;
            case 2:
                    System.out.println("_______Bạn đã chọn xuất danh sách sản phẩm_______");
                    inThongTinSVGD();
                    break;
            case 3:
                    System.out.println("_______Bạn đã chọn xuất danh sách sinh viên theo khoảng điểm_______");
                    xuatSVtheoDiem();
                    break;
            case 4:
                    System.out.println("_______Bạn đã chọn tìm sinh viên theo họ va tên_______");
                    timSV();
                    break;
            case 5:
                    System.out.println("_______Bạn đã chọn tìm và sửa sinh viên theo họ tên_______");
                    suaSV();
                    break;
            case 6:
                    System.out.println("_______Bạn đã chọn tìm và xóa sinh viên theo họ tên!_______");
                    XoaSVGDtheoten();
                    break;
            case 7:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai !"); 
                    
        }
       }while(true);
   }
}

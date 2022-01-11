package com.minhhh2004110025.tuan04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class DsSanPham {
    private ArrayList <sanPham> list = new ArrayList<sanPham>();

    public void nhapSanPham(){
        System.out.println("Nhập danh sách sản phẩm") ;
        Scanner scanner = new Scanner(System.in);
        int i = 1 ;
        do{
            System.out.printf("Tên sản phẩm thứ %d: ",i);
            String string = scanner.nextLine();
            if (string == null || string.equals("")){
                break;
            }
            System.out.print("Giá sản phẩm: ");
            double donGia = scanner.nextDouble();
            list.add(new sanPham (string, donGia));
            scanner.nextLine();
            i++;
        }while (true) ;
    }
    public void inThongTinSP(){
        System.out.println("=================Danh sách sản phẩm============");
        System.out.println("Tên SP:\t\t\t|Giá:\t\t");
        for (sanPham  sanpham : list){
            System.out.printf("%10s\t\t| %.3f \n",sanpham.getTen(), sanpham.getDonGia());
        }
    }
    public void sapXeptheoGia(){
        Collections.sort(list, (a,b)-> (int) (a.getDonGia() - b.getDonGia()));
        System.out.println("==========Danh sách sản phẩm sau khi sắp xếp==========");
        inThongTinSP();
    }
    public void xoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần xóa: ");
        String ten = scanner.nextLine();
        sanPham tk = null;
        // sử dụng foreach
        for (sanPham sanpham : list) {
            if (sanpham.getTen().equals(ten)){
                tk = sanpham;
                break;
            }
            
        }
        if (tk != null){
            list.remove(tk);
            System.out.println("Sản phẩm đã được xóa thành công!!");
        }else
            {
                System.out.println("Không có tên sản phẩm trong danh sách!!");

           }
    }
    public void tinhGiaTB(){
        double giaTB = 0, sum = 0;
        for (sanPham  sanpham : list) {
            sum += sanpham.getDonGia();
        }
        giaTB = sum / list.size ();
        System.out.println("Giá trung bình của sản phẩm là: " + giaTB);
    }
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
                    nhapSanPham();
                    break;
                case 2:

                    System.out.println("_______Bạn đã chọn xuất danh sách sản phẩm_______");
                    inThongTinSP();
                    break;
                case 3:

                    System.out.println("_______Bạn đã chọn sắp xếp sản phẩm giảm dần theo giá_______");
                    sapXeptheoGia();
                    break;
                case 4:

                    System.out.println("_______Bạn đã chọn tìm và xoá sản phẩm_______");
                    xoa();
                    break;
                case 5:

                    System.out.println("_______Bạn đã chọn xuất giá trung bình của các sản phẩm_______");
                    tinhGiaTB();
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
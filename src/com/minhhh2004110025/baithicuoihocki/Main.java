package com.minhhh2004110025.baithicuoihocki;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        LinkedList dshh = new LinkedList();
        dshh.DulieuMoi();
        Date ngayNhapHang = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String strDate= formatter.format(ngayNhapHang);
        Scanner scanner = new Scanner(System.in);
        int minh;
        do{
            System.out.println("|>>>>>>>>>>>>>>>>>MENU<<<<<<<><<<<<<<<|");
            System.out.println("|>>1. Thêm hàng hóa.                  |");
            System.out.println("|>>2. Xuất danh sách hàng hóa.        |");
            System.out.println("|>>3. Xóa hàng hóa.                   |");
            System.out.println("|>>4. Sửa hàng hóa.                   |");
            System.out.println("|>>5. Sắp xếp hàng hóa.               |");
            System.out.println("|>>6. Tìm kiếm sản phẩm.              |");
            System.out.println("|>>7. Thông kế sản phẩm trong kho.    |");
            System.out.println("|>>8. Kết thúc!                       |");
            System.out.println("|>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<|");
            System.out.print("Hãy lựa chọn chức năng từ 1 -> 8: ");
            int soChon = scanner.nextInt();
            scanner.nextLine();
            switch(soChon){
                case 1:
                    System.out.println("_________________________Bạn đã chọn Thêm sản phẩm_________________________");
                    String loaiHang = null;
                    scanner.nextLine();
                    System.out.println (">>>>>>>>Chọn loại hàng hóa<<<<<<<");
                    System.out.println (">> 1.Điện máy ");
                    System.out.println (">> 2.Thực phẩm ");
                    System.out.println (">> 3. Sành sứ ");
                    int key = scanner.nextInt();
                    switch (key) {
                    case 1: 
                        loaiHang = "Điện máy" ;
                        break;
                    case 2: 
                        loaiHang = "Thực phẩm";
                        break;
                    case 3: 
                        loaiHang = "Sành sứ" ;
                        break;
                    default: System.out.println ("Không tiếp nhận loại hàng khác");
                    break;
                    }
                    scanner.nextLine();
                    try{
                        System.out.println("Ngày nhập hàng: ");
                        ngayNhapHang = formatter.parse(scanner.nextLine());
                    }catch(Exception e){
                        System.out.println("Ngày nhập không đúng");
                    }
                    System.out.println ("Tên hàng hóa: ");
                    String name = scanner.nextLine();
                    System.out.println ("Giá sản phẩm nhập: ");
                    Double giaNhap = scanner.nextDouble();
                    System.out.println ("Số lượng sản phẩm trong kho: ");
                    int tonKho = scanner.nextInt();
                    HangHoa hanghoa = new HangHoa(loaiHang, name, giaNhap, ngayNhapHang , tonKho);
                    dshh.addHangHoa(hanghoa);
                break;
                case 2:
                    System.out.println("________________________________Bạn đã chọn xuất danh sách sản phẩm_____________________");
                    dshh.inthongtinHangHoa();
                    break;
                case 3:
                    System.out.println("________________________________Bạn đã chọn Xóa sản phẩm________________________________");
                    System.out.println("Nhập ID hàng hóa cần xóa: ");
                    int idx = scanner.nextInt();
                    dshh.RemoveHangHoa(idx);
                    dshh.inthongtinHangHoa();
                    break;
                case 4:
                    System.out.println("_________________________________Bạn đã chọn Sửa sản phẩm_____________________________");
                    System.out.println("Nhập ID hàng hóa cần sửa");
                    int ids = scanner.nextInt();
                    dshh.RepairHangHoa(ids);
                    dshh.inthongtinHangHoa();          
                break;
                case 5:
                    System.out.println("__________________________________Bạn đã chọn Sắp xếp sản phẩm_________________________________");
                    dshh.MenuSort();
                    dshh.inthongtinHangHoa();
                    break;
                case 6:
                    System.out.println("_________________________________Bạn đã chọn Tìm kiếm sản phẩm__________________________________");
                    dshh.MenuSearch();
                    dshh.inthongtinHangHoa();
                break;
                case 7:
                    System.out.println("______________________________Bạn đã chọn Thống kê các sản phẩm trong kho________________________________");
                    dshh.Statistic();
                    break;
                case 8:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);   
            }System.out.println("Chọn 1 để tiếp tục hoặc 0 để thoát: ");
            minh = scanner.nextInt();    
        }while(minh == 1);
    }
}

package com.minhhh2004110025.baithicuoihocki;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class LinkedList {
    private int size;
    private Node head;
    private Node tail;
    private Date ngayNhapHang = new Date();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    private String strDate= formatter.format(ngayNhapHang);
    static Scanner scanner = new Scanner(System.in);
    static HangHoa hanghoa = new HangHoa();
    
    public LinkedList(){
        hanghoa.autoId = 1;
        this.head = null;
        this.tail = null;
    }

    public void inthongtinHangHoa(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DANH SÁCH HÀNG HÓA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", 
        "Mã hàng", "Loại hàng", "Tên hàng", "Giá Nhập", "Ngày Nhập Hàng", "Tồn kho");
        Node node = this.head;
        while (node != null) {
            System.out.printf("%-20d %-20s %-20s %-13s(USD)    %-20S %-20s \n",
            node.getHangHoa().getId(), node.getHangHoa().getLoaiHang(), node.getHangHoa().getName(), 
            node.getHangHoa().getGiaNhap(),formatter.format(node.getHangHoa().getNgayNhapHang()), node.getHangHoa().getTonKho());
            node = node.getNext();
        }    
    }

    public boolean kiemTra(){
        return this.head == null;
    }

    public void addHangHoa(HangHoa hanghoa){
        if (kiemTra()){
            this.head = this.tail = new Node(hanghoa);
            return;
        }
        Node newNode = new Node(hanghoa);
        this.tail.setNext(newNode);
        this.tail = newNode;
    }

    public boolean RemoveHangHoa(int id){
        Node node = this.head;
        if (this.head.getHangHoa().getId() == id){
            this.head = this.head.getNext();
            System.out.println("Hàng hóa đã được xóa!");
            return true;
        }
        else{
            System.out.println("Đối tượng đã xóa hoặc không tồn tại");
        }
        while(node != null)
        {
            if (node.getNext().getHangHoa().getId() == id){
                node.setNext(node.getNext());
                System.out.println("Hàng hóa được xóa khỏi danh sách");
                return true;
            }
            else{
                System.out.println("Không có Id trong danh sách!");
            }
            node = node.getNext();
        }
        System.out.println("Xóa không thành công!");
        return false;
    }

    public boolean RepairHangHoa(int id){
        Node node = this.head;
        while(node != null){
            if (node.getHangHoa().getId() == id){
                String loaiHang = null;
                System.out.println ("Chọn loại hàng cần nhập: ");
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
                    case 3:
                    loaiHang = "Sành sứ" ;
                    break;
                }
                scanner.nextLine();
                try{
                    System.out.println("Ngày nhập hàng: ");
                    ngayNhapHang = formatter.parse(scanner.nextLine());
                }catch (Exception e){ // xử lí ngoại lệ
                    System.out.println("Ngày nhập không hợp lệ !");
                }
                System.out.println ("Tên hàng hóa: ");
                String name = scanner.nextLine();
                System.out.println ("Giá sản phẩm nhập: ");
                Double giaNhap = scanner.nextDouble();
                System.out.println ("Số lượng sản phẩm trong kho: ");
                int tonKho = scanner.nextInt();
                node.getHangHoa().setLoaiHang(loaiHang);
                node.getHangHoa().setName(name);
                node.getHangHoa().setGiaNhap(giaNhap);
                node.getHangHoa().setNgayNhapHang(ngayNhapHang);
                node.getHangHoa().setTonKho(tonKho);
                return true;
            }
        node = node.getNext();
        }
        System.out.println("Sửa không thành công");
        return false;
    }

    public boolean SearchbyType(String loai){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DANH SÁCH HÀNG HÓA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", 
        "Mã hàng", "Loại hàng", "Tên hàng", "Giá Nhập", "Ngày Nhập Hàng", "Tồn kho");
        boolean found = false;
        Node node = this.head;
        while (node != null){
            if (node.getHangHoa().getLoaiHang().contains(loai)){//sử dụng Phương thức contains() tìm kiếm chuỗi ký tự
                System.out.printf("%-20d %-20s %-20s %-13s(USD)    %-20S %-20s \n",
                node.getHangHoa().getId(), node.getHangHoa().getLoaiHang(), node.getHangHoa().getName(), 
                node.getHangHoa().getGiaNhap(),formatter.format(node.getHangHoa().getNgayNhapHang()), node.getHangHoa().getTonKho());
                found = true;
            }
            node = node.getNext();
        }if (!found){
            System.out.println("Loại Hàng hóa cần tìm không cso trong kho!");
            return false;
        }
        return true;
    }
    
    public boolean SearchbyPrice(double min, double max){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DANH SÁCH HÀNG HÓA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", 
        "Mã hàng", "Loại hàng", "Tên hàng", "Giá Nhập", "Ngày Nhập Hàng", "Tồn kho");
        boolean found2 = false;
        Node node = this.head;
        while (node != null){
            if(node.getHangHoa().getGiaNhap() >= min && node.getHangHoa().getGiaNhap() <= max){
                System.out.printf("%-20d %-20s %-20s %-13s(USD)    %-20S %-20s \n",
                node.getHangHoa().getId(), node.getHangHoa().getLoaiHang(), node.getHangHoa().getName(), 
                node.getHangHoa().getGiaNhap(),formatter.format(node.getHangHoa().getNgayNhapHang()), node.getHangHoa().getTonKho());
                found2 = true;
            }
            node = node.getNext();
         } if (!found2) {
            System.out.println("Hết hàng hóa / Giá tìm kiếm quá thấp hoặc quá cao !");
            return false;
         }
         return true;
    }

    public boolean SearchbyDate(Date StartDate, Date EndDate){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DANH SÁCH HÀNG HÓA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", 
        "Mã hàng", "Loại hàng", "Tên hàng", "Giá Nhập", "Ngày Nhập Hàng", "Tồn kho");
        boolean found3 = false;
        Node node = this.head;
        while (node != null){
            if(node.getHangHoa().getNgayNhapHang().after(StartDate) && node.getHangHoa().getNgayNhapHang().before(EndDate))
            // sử dụng phương thức after, before
            {
            System.out.printf("%-20d %-20s %-20s %-13s(USD)    %-20S %-20s \n",
            node.getHangHoa().getId(), node.getHangHoa().getLoaiHang(), node.getHangHoa().getName(), 
            node.getHangHoa().getGiaNhap(),formatter.format(node.getHangHoa().getNgayNhapHang()), node.getHangHoa().getTonKho());
                found3 = true;
            }node = node.getNext();
        }if (!found3){
            System.out.println("Không có hàng được nhập vào ngày này!");
            return false;
        }
        return true;
    }

    public void SortupAscendingbyPrice(){
        Node node = this.head, subnode = null;
        Double temp;
        while (node != null){
            subnode = node.getNext();
            while (subnode != null){
                if(node.getHangHoa().getGiaNhap() > subnode.getHangHoa().getGiaNhap()){
                    temp = node.getHangHoa().giaNhap;
                    node.getHangHoa().giaNhap = subnode.getHangHoa().giaNhap;
                    subnode.getHangHoa().giaNhap = temp;
                }subnode = subnode.getNext();
            }node = node.getNext();
        }System.out.println("Đã sắp xếp danh sách tăng dần thep giá");
    }

    public void SortDescendingbyPrice(){
        Node node2 = this.head, subnode2 = null;
        Double temp2;
        while (node2 != null){
            subnode2 = node2.getNext();
            while (subnode2 != null){
                if (node2.getHangHoa().getGiaNhap() < subnode2.getHangHoa().getGiaNhap()){
                    temp2 = node2.getHangHoa().giaNhap;
                    node2.getHangHoa().giaNhap = subnode2.getHangHoa().giaNhap;
                    subnode2.getHangHoa().giaNhap = temp2;
                }subnode2 = subnode2.getNext();
            }node2 = node2.getNext();
        }System.out.println("Danh sách đã được sắp xếp giảm dần theo giá");
    }

    public void SortDescendingbyDate(){
        Node node3 = this.head, subnode3 = null;
        Date temp3;
        while (node3 != null) {
            subnode3 = node3.getNext();
            while (subnode3 != null) {
                if (node3.getHangHoa().getNgayNhapHang().before(subnode3.getHangHoa().getNgayNhapHang())){
                    temp3 = node3.getHangHoa().getNgayNhapHang();
                    node3.getHangHoa().ngayNhapHang = subnode3.getHangHoa().ngayNhapHang;
                    subnode3.getHangHoa().ngayNhapHang = temp3;
                }subnode3 = subnode3.getNext();
            }node3 = node3.getNext();
        }System.out.println("Danh sách đã được sắp xếp giảm dần theo ngày hàng nhập kho!");
    }

    public void SortupAscendingbyDate(){
        Node node4 = this.head, subnode4 = null;
        Date temp4;
        while (node4 != null){
            subnode4 = node4.getNext();
            while (subnode4 != null){
                if (node4.getHangHoa().getNgayNhapHang().before(subnode4.getHangHoa().getNgayNhapHang())){
                    temp4 = node4.getHangHoa().getNgayNhapHang();
                    node4.getHangHoa().ngayNhapHang = subnode4.getHangHoa().ngayNhapHang;
                    subnode4.getHangHoa().ngayNhapHang = temp4;
                }subnode4 = node4.getNext();
            }node4 = node4.getNext();
        }System.out.println("Danh sách đã được sắp xếp tăng dần theo ngày hàng nhập kho!");
    }

    public void Statistic(){
        Node node = this.head;
        int total = 0;
        float totalValue = 0;
        while (node != null) {
            total += node.getHangHoa().getTonKho();
            totalValue += node.getHangHoa().getGiaNhap();
            node = node.getNext();
        }
        System.out.println("THỐNG KÊ SỐ HÀNG VÀ GIÁ TRỊ TRONG KHO");
        System.out.println("TỔNG SỐ LƯỢNG HÀNG HÓA TRONG KHO LÀ: "+ total);
        System.out.println("TỔNG GIÁ TRỊ HÀNG HÓA TRONG KHO LÀ: "+ totalValue);
    }

    public void nhapNgay(){
        try{
            System.out.println("Ngày nhập hàng: ");
            ngayNhapHang = formatter.parse(scanner.nextLine());
        }catch(Exception e){
            System.out.println("Ngày nhập không đúng");
        }
    }
    
    public void DulieuHangHoa(HangHoa hanghoa)
    {
        if(kiemTra()){
            this.head = this.tail = new Node (hanghoa);
            return;
        }
        Node newNode = new Node(hanghoa);
        this.tail.setNext(newNode);
        this.tail = newNode;
    }

    public void DulieuMoi(){
        try{
            String Date1 = "30-09-2021";
            String Date2 = "03-10-2021";
            String Date3 = "21-10-2021";
            String Date4 = "27-10-2021";
            String Date5 = "30-11-2021";
            String Date6 = "27-12-2021";
            String Date7 = "28-12-2021";
            String Date8 = "29-12-2021";
            String Date9 = "01-01-2022";
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date1 = formatter.parse(Date1);
            Date date2 = formatter.parse(Date2);
            Date date3 = formatter.parse(Date3);
            Date date4 = formatter.parse(Date4);
            Date date5 = formatter.parse(Date5);
            Date date6 = formatter.parse(Date6);
            Date date7 = formatter.parse(Date7);
            Date date8 = formatter.parse(Date8);
            Date date9 = formatter.parse(Date9);
            HangHoa hanghoa1 = new HangHoa("Điện máy", "Máy lạnh", 3000, date1, 20 );
            HangHoa hanghoa2 = new HangHoa("Thực phẩm", "Gạo", 50, date6, 20 );
            HangHoa hanghoa3 = new HangHoa("Sành sứ", "Đĩa", 20, date2, 100 );
            HangHoa hanghoa4 = new HangHoa("Điện máy", "Máy giặc", 2500, date3, 20 );
            HangHoa hanghoa5 = new HangHoa("Thực phẩm", "Dầu ăn", 3, date7, 100 );
            HangHoa hanghoa6 = new HangHoa("Điện máy", "Máy điều hòa", 5000, date4, 20 );
            HangHoa hanghoa7 = new HangHoa("Sành sứ", "Bình trà", 20, date5, 50 );
            HangHoa hanghoa8 = new HangHoa("Thực phẩm", "Mì", 1, date8, 1000 );
            HangHoa hanghoa9 = new HangHoa("Điện máy", "Máy sấy tóc", 100, date1, 30 );
            HangHoa hanghoa10 = new HangHoa("Sành sứ", "Muỗng", 2, date1, 500 );
            HangHoa hanghoa11 = new HangHoa("Thực phẩm", "Nước mắm", 3, date9, 100 );
            HangHoa hanghoa12 = new HangHoa("Điện máy", "TIVI", 6000, date1, 10 );
            HangHoa hanghoa13 = new HangHoa("Sành sứ", "Tô", 3, date1, 200 );
            HangHoa hanghoa14 = new HangHoa("Thực phẩm", "Nước tương", 5, date6, 200 );
            HangHoa hanghoa15 = new HangHoa("Điện máy", "Tủ lạnh", 3500, date1, 50 );
            HangHoa hanghoa16 = new HangHoa("Sành sứ", "Chén", 2, date1, 500 );
            HangHoa hanghoa17 = new HangHoa("Thực phẩm", "Dầu hào", 1.5, date7, 100 );
            HangHoa hanghoa18 = new HangHoa("Điện máy", "Quạt máy", 100, date1, 100 );
            HangHoa hanghoa19 = new HangHoa("Sành sứ", "Ly", 4, date1, 200 );
            HangHoa hanghoa20 = new HangHoa("Thực phẩm", "Hạt niêm", 3, date8, 200 );
            DulieuHangHoa(hanghoa1);
            DulieuHangHoa(hanghoa2);
            DulieuHangHoa(hanghoa3);
            DulieuHangHoa(hanghoa4);
            DulieuHangHoa(hanghoa5);
            DulieuHangHoa(hanghoa6);
            DulieuHangHoa(hanghoa7);
            DulieuHangHoa(hanghoa8);
            DulieuHangHoa(hanghoa9);
            DulieuHangHoa(hanghoa10);
            DulieuHangHoa(hanghoa11);
            DulieuHangHoa(hanghoa12);
            DulieuHangHoa(hanghoa13);
            DulieuHangHoa(hanghoa14);
            DulieuHangHoa(hanghoa15);
            DulieuHangHoa(hanghoa16);
            DulieuHangHoa(hanghoa17);
            DulieuHangHoa(hanghoa18);
            DulieuHangHoa(hanghoa19);
            DulieuHangHoa(hanghoa20);
        }catch (Exception e){
            e.getCause();
        }
    }

    public void MenuSort() {
        System.out.println(">>1. Sắp xếp tăng dần theo giá hàng nhập kho!");
        System.out.println(">>2. Sắp xếp giảm dần theo giá hàng nhập kho!");
        System.out.println(">>3. Sắp xếp tăng dần theo ngày hàng nhập kho!");
        System.out.println(">>4. Sắp xếp giảm dần theo ngày hàng nhập kho!");
        System.out.println("Hãy lựa chọn chức năng từ 1 -> 4: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        switch(key){
        case 1:
            System.out.println("_______Bạn đã chọn Sắp xếp tăng dần theo giá hàng nhập kho!_______ ");
            SortupAscendingbyPrice();
            break;
        case 2: 
            System.out.println("_______Bạn đã chọn Sắp xếp giảm dần theo giá hàng nhập kho!_______ ");
            SortDescendingbyPrice();
            break;
        case 3:
            System.out.println("_______Bạn đã chọn Sắp xếp tăng dần theo ngày hàng nhập kho!_______ ");
            SortupAscendingbyDate();
        break;
        case 4:
        System.out.println("_______Bạn đã chọn Sắp xếp giảm dần theo ngày hàng nhập kho!_______ ");
            SortDescendingbyDate();
        }
    }

    public void MenuSearch(){
        System.out.println(">>1. Tìm kiếm theo loại hàng hóa!");
        System.out.println(">>2. Tìm kiếm theo giá nhập hàng hóa!");
        System.out.println(">>3. Tìm kiếm theo ngày hàng nhập kho!");
        System.out.println("Hãy lựa chọn chức năng từ 1 -> 3: ");
        int key1 = scanner.nextInt();
        switch(key1){
            case 1:
            System.out.println("_______Bạn đã chọn Tìm kiếm theo loại hàng hóa_________"); 
            System.out.println(">>1. Điện máy!");
            System.out.println(">>2. Thực phẩm!");
            System.out.println(">>3. Sành sứ!");
            System.out.println("Hãy lựa chọn  loại hàng mà bạn muốn 1 -> 3: ");
            String lhh = null;
            int key2 = scanner.nextInt();
            switch (key2) {
                case 1:
                    System.out.println("_______Bạn đã chọn Điện máy_____");
                    lhh = "Điện máy";
                break;
                case 2:
                    System.out.println("_______Bạn đã chọn Thực phẩm_____");
                    lhh = "Thực phẩm";
                break;
                case 3:
                    System.out.println("_______Bạn đã chọn Sành sứ_____");
                    lhh = "Sành sứ";
                default: System.out.println("Không có loại hàng hóa bạn muốn!");
                break;
            }
            SearchbyType(lhh);
            break;
            case 2:
                System.out.println("_______Bạn đã chọn Tìm kiếm theo giá nhập hàng hóa_________");
                System.out.println("Nhập khoảng giá của sản phẩm mà bạn muốn tìm!");
                System.out.println("Giá từ: "); double min = scanner.nextDouble();
                System.out.println("đến: "); double max = scanner.nextDouble();
                SearchbyPrice(min, max);
            break;
            case 3: 
                System.out.println("_______Bạn đã chọn Tìm kiếm theo ngày nhập hàng hóa_________");
                System.out.println("Nhập khoảng thời gian mà bạn muốn tìm!");
                Date StartDate = new Date();
                Date EndDate = new Date();
                scanner.nextLine();
                System.out.println ("Tính từ ngày: ");
                 try{
                    System.out.println("Nhập ngày: ");
                    StartDate = formatter.parse(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Ngày nhập không đúng!");
                }
                System.out.println("đến ngày: ");
                try{
                    System.out.println("Nhập ngày: ");
                    EndDate = formatter.parse(scanner.nextLine());
                }catch (Exception e) {
                    System.out.println("Ngày nhập không đúng!"); 
                }
                SearchbyDate(StartDate, EndDate);
            break;
        }  
    }
}


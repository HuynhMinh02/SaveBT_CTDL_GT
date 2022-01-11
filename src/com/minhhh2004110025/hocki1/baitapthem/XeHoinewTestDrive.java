package com.minhhh2004110025.baitapthem;

public class XeHoinewTestDrive {
    public static void main(String[] args) {
        XeHoinew xeHoinew;
        xeHoinew = new XeHoinew("Huỳnh Hữu Minh", "79468516145", "Lamborghini", "Thể thao", 6498);

        System.out.println ("Tên chủ xe: " +xeHoinew.tenChuXeHoi);
        System.out.println ("Số: " +xeHoinew.giayPheplaixe);
        System.out.println ("Hãng sản xuất: " +xeHoinew.hangSanxuat);
        System.out.println ("Dòng xe hơi: " +xeHoinew.dongXeHoi);
        System.out.println ("Dung tích xăng: " +xeHoinew.dungTichXang + "cc");
    }
    
}

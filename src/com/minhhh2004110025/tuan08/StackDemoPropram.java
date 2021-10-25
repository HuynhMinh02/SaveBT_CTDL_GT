package com.minhhh2004110025.tuan08;

import java.util.Stack;

public class StackDemoPropram {
    public static void main(String[] args){
        Stack <String> stack;
        stack = new Stack<>();

        stack.push("Welcome");
        stack.push("TO");
        stack.push("Data Structure and ALgotirhm");

        System.out.println(stack);
        //lấy ra 1 phần tử (xóa phần tử khỏi stack)
        String poped = stack.pop();
        System.out.println("==> Đã lây phần tử ra khỏi danh sách: " + poped);
        System.out.println("========Phần tử còn lại của stack========");
        System.out.println(stack);

        // Thăm nút đỉnh = không loại khỏi danh sách
        String pTduocTham = stack.peek();
        System.out.println("Thăm phần tử đỉnh: " + pTduocTham);

        // Sau khi thăm
        System.out.println(stack);
        }
}

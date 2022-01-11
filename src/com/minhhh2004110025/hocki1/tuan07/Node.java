package com.minhhh2004110025.hocki1.tuan07;

public class Node {
    //Nội dung
    int data;

    //Liên kết đến nút tiếp theo --> là 1 tham chiếu
    Node next; //biến tham chiếu kiểu note 

    public Node(){

    }
    public Node(int d){
        data = d;
    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }
}

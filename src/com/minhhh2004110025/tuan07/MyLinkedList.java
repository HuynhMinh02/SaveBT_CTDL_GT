package com.minhhh2004110025.tuan07;

public class MyLinkedList {
    Node head = null;
    Node tail = null;
    
    public MyLinkedList(){
    }
    void add(int data) {
        // bước 1: tạo node mới 
        Node newNode = new Node(data);
        // bươc 2: kiểm tra và thêm một nút vao danh sách rỗng
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            //nếu danh sách không rỗng //thêm vao duôi danh sách
            tail.next =newNode;
            tail = newNode;// di chuyển theo ra cuối
        }
    }
    void remove(){

    }
    void print(){
        //bước 1: lưu head(nút đầu) vào biến tạm
        Node tam = head;
        //bước 2 ktra
        if (head== null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("========Các nút trong danh sách=========");
        while (tam != null){
            System.out.println(tam.data);
            tam = tam.next;
        }
    }
    void find(){

    }

}

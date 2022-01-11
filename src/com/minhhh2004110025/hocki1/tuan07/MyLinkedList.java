package com.minhhh2004110025.hocki1.tuan07;

public class MyLinkedList {
    Node head = null;
    Node tail = null;
    
    public MyLinkedList(){
    }
    void removeHead(Node head) {
        if (head == null){
            System.out.println("Danh sách rỗng");
            return;
        }else{
            head = head.next;
        }

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

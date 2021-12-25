package com.minhhh2004110025.baithicuoihocki;

import java.util.Scanner;

public class LinkedList {
    Node head = null;
    Node tail = null;
    HangHoa hanghoa;
    
    LinkedList(){

    }
    void addHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    void addTail(){
        Node newNode = new Node();
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    void add(){

    }
    void display(){
        int i = 0;
        Node temp = head;
        if (temp == null){
            System.out.println("Đã hết / Không có hàng trong kho!");
        }
        System.out.println(">>>>>>>>Danh sách Hàng Hóa trong kho<<<<<<<");
        while (temp != null){
            System.out.println("Hàng hóa" + i);
            //temp.data.inthongtinHangHoa();
            temp = temp.next;
            i++;
        }
            System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<");
        }
    }

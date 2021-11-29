package com.minhhh2004110025.tuan01.kiemtragiuaki;

import java.util.Scanner;

public class LinkedList {
    Node head = null;
    Node tail = null;

    static Node dSach = new Node(); 
    Scanner add = new Scanner(System.in);

    public void addTail() {
        Node newNode = new Node();
        newNode.nhapThongTin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addHead() {
        Node newNode = new Node();
        newNode.nhapThongTin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void inDanhSach() {
        Node temp = head;

        if (head == null) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Các nút trong danh sách:  ");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void removeTail() {
        Node temp = head;
        if (head == null) {
            System.out.println("Trống");
            return;
        }
        while (temp != null) {
            if (temp.next == tail) {
                tail = temp;
                tail.next = null;
                return;
            }
            temp = temp.next;
        }
    }
}

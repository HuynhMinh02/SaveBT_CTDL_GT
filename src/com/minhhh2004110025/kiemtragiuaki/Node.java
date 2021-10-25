package com.minhhh2004110025.kiemtragiuaki;
 
import java.util.Scanner;
public class Node {


    int data;
    Node next;
    Scanner sc = new Scanner(System.in);
    public Node(){
        
    }

    public Node(int d){
        data = d;
    }

    public void nhapThongTin(){
        System.out.println("nhập Node: ");
        data = sc.nextInt();
    }
}

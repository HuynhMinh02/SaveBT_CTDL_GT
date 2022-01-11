package com.minhhh2004110025.tuan01.nhap;

public class Node {
        Apple data;
     
        Node next;
    
        Node() {
    
        }
    
        Node(Apple d) {
            data = d;
        }
    
        Node(Apple d, Node n) {
            data = d;
            next = n;
        }
 }

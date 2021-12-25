package com.minhhh2004110025.baithicuoihocki;

public class Node {
    int data;

    Node next;

    public Object hanghoa;
    
    Node() {}

    Node(int d) {
        data = d ;
    }
    Node(int d, Node n) {
        data = d;
        next = n;
    }
}

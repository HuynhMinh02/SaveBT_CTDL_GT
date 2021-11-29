package com.minhhh2004110025.baithicuoihocki;

public class Node {
    int data;

    Node next;
    
    public Node() {}

    public Node(int d) {
        data = d;
    }
    public Node(int d, Node n) {
        data = d;
        next = n;
    }
}

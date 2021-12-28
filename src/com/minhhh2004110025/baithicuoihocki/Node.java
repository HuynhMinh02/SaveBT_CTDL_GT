package com.minhhh2004110025.baithicuoihocki;

public class Node {
    public HangHoa hanghoa;
    public Node next;

    public Node(){

    }

    public Node(HangHoa hanghoa) {
        this.hanghoa = hanghoa;
        this.next = null;
    }

    public HangHoa getHangHoa(){
        return hanghoa;
    }

    public void setHangHoa(HangHoa hanghoa){
        this.hanghoa = hanghoa;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node (HangHoa hanghoa, Node next) {
        this.hanghoa = hanghoa;
        this.next = next;
    }
}

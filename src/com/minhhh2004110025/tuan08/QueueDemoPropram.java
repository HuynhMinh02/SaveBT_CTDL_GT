package com.minhhh2004110025.tuan08;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class QueueDemoPropram {
    public static void main(String[] args) {

        Queue<Integer> queue ;
        // dùng danh sách liên kết 
        queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(12);

        // lấy ra 1 phần tử trong queue và lấy đầu

        System.out.println(queue);
        int ptduocLayRa = queue.remove();
        System.out.println("Phần tử được lấy ra từ Queue: " + ptduocLayRa);
        System.out.println("Phần tử còn lại trong Queue");
        System.out.println(queue);

        // thăm 1 phần tử của queue (thăm là xem nhưng không làm gì phần tử)
        int pTduocTham = queue.peek();
        System.out.println("Phần tử được thăm" + pTduocTham);
        System.out.println("Phần tử còn lại trong queue sau Thăm");
        System.out.println(queue);
    }
    
}

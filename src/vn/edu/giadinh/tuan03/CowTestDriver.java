package vn.edu.giadinh.tuan03;

public class CowTestDriver {
    public static void main(String[] args){
        Cow cow;
        cow = new Cow(15);
        System.out.println("Weight: " + cow.weight + "kg");

        cow = new Cow(5);
        System.out.println("Weight: " + cow.weight + "kg");

        cow = new Cow(25.5, "USA", "Bảy màu");

        System.out.println("Weight: "+ cow.weight + "kg");
        System.out.println("Breed:" + cow.breed);
        System.out.println("Color:" + cow.color);
    }
}

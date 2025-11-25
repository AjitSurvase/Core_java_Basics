package Abstraction;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("SELECT MODEL");
        System.out.println("1: samsung\t 2: sony");
        int choice=sc1.nextInt();

        System.out.println("enter price");
        double price=sc1.nextDouble();

        //object  of factory class
        TvFactory t1=new TvFactory();

        //call factory method
        Tv t=t1.purchesTv(choice);
        t.getInfo();
        t.getOfferPrice(price);
    }
}

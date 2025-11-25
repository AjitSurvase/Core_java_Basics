package uss;

public class practice3 {
//using third variable :
    public static void main(String[] args) {
        int x=10;
        int y=20;

        System.out.println("value of x before swaping :"+x);
        System.out.println("value of y before swapping :"+y);


        System.out.println("***************************");
//        int temp;
//        temp=x;
//        x=y;
//        y=temp;
//        System.out.println("value of x after swaping :"+x);
//        System.out.println("value of y after swapping :"+y);




        //without using third variable:
        x=x+y;
        y=x-y;
        x=x-y;


        System.out.println("value of x after swaping :"+x);
        System.out.println("value of y after swapping :"+y);

    }



}

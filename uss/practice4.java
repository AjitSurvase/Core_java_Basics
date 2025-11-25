package uss;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc1.nextInt();

//        int n=10;
        for(int i=1; i<=10;i++)
        {
            System.out.println(num*i);
        }

    }
}

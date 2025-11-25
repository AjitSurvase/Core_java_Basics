package uss;

import java.util.Scanner;

public class reversetable {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc1.nextInt();

        for(int i=10;i>=1;i--)
        {
            System.out.println(num*i);
        }
    }
}

package uss;

import java.util.Scanner;

public class ascci {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the character ");
        char ch=sc1.next().charAt(0);             //for character input next().charAt(0) method use

        int asc=ch;                       //typecasting
        System.out.println(asc);
    }
}

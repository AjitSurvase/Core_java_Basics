package Shyna_Tech_Yarns;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("enter the n number");
        Scanner sc1=new Scanner(System.in);

        int num=sc1.nextInt();


        int num1=0;
        int num2=1;

        int num3;

        for(int i=3;i<=num;i++)
        {
            num3=num1+num2;
            num1=num2;
            num2=num3;

            System.out.println(num3);
        }




    }
}

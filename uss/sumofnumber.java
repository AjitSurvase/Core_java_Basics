package uss;

import java.util.Scanner;

public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the length");
        int num=sc1.nextInt();

        int sum=0;

        for(int i=1;i<=num;i++)
        {
            System.out.println("ennter the digit");
            int num2=sc1.nextInt();

            sum=sum+num2;
        }
        System.out.println(sum);
    }
}

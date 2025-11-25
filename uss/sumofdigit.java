package uss;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc1.nextInt();

       int sum=0;

       while(num>0)
       {
            sum+=num%10;   //last digit

             num= num/10;

       }
        System.out.println(sum);
    }
}

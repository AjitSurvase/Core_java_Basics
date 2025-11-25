package uss;

import java.util.Scanner;

public class sumofevennum {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc1.nextInt();


        int sum = 0, i = 2;

       while(i<=num)

       {
          sum=sum+i;
          i=i+2;                //increment by 2
       }
        System.out.println(sum);
    }
}

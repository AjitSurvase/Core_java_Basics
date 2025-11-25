package uss;

import java.util.Scanner;

public class febonaccic {
    public static void main(String[] args) {

        int num1=0;
        int num2=1;
        int n;

        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number for febonaccic series");
        int num=sc1.nextInt();
        System.out.println(num1+" "+num2+" ");
          for(int i=3;i<num;i++)
          {
               n=num1+num2;
               num1=num2;
               num2=n;
              System.out.println(n);
          }

    }
}

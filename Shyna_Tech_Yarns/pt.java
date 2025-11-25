package Shyna_Tech_Yarns;

import java.util.Scanner;

public class pt {
    public static void main(String[] args) {


        int flag=1;    // assume this is  for prime number


        System.out.println("enter the number");
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();

        if(n<=1)
        {
            System.out.println("it is not a prime number");
            return;
        }


        for(int i=2;i<=n;i++)
        {
           if(n%10==0){
               flag=0;     // asume its not a prime number
               break;

           }
        }
        if(flag==1){
            System.out.println("it's  a prime number");
        }

        else
        {
            System.out.println("its not a prime number");
        }



    }
}

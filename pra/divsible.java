package pra;

import java.util.Scanner;

public class divsible {

    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc1.nextInt();

        if(num%6==0 && num%9==0)
        {
            System.out.println("foo bar");
        }

        else if(num%6==0)
        {
            System.out.println("foo ");
        }
        else if(num%9==0 )
        {
            System.out.println("bar");
        }

    }
}

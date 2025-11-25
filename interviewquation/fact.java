package interviewquation;

import java.util.Scanner;

public class fact {

    public static void main(String[] args) {


        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number ");

        int num=sc1.nextInt();
        int multi=1;

        for(int a=num;a>=1;a--)
        {

            multi=multi*a;

        }
        System.out.println(multi);
    }

}

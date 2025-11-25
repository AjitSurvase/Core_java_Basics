package Forloopprogram;

import java.util.Scanner;

public class ForDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER no of user");
        int count=sc1.nextInt();

        for(int a=1;a<=count;a++)
        {
            System.out.println("enter username");
            String name=sc1.next();
            System.out.println("welcome "+name);
        }
    }
}

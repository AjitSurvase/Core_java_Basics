package uss;

import java.util.Scanner;

public class practice {
//given String into threequal paarts

    public static void main(String[] args) {


//        String s="ilovejava";
//
//        System.out.println(s.length());
//
//        int n=s.length();
//
//        int part=n/3;
//
//        System.out.println(part);
//
//        System.out.println(s.substring(0,part));
//        System.out.println(s.substring(part,part*2));
//        System.out.println(s.substring(part*2,part*3));


        Scanner sc1=new Scanner(System.in);

        System.out.println("enter the given String ");
        String s=sc1.next();

        System.out.println("enter how many parts you want");
        int n= sc1.nextInt();

        int len=s.length();


        if(s.length()%n!=0)
        {
            System.out.println("string cant divede into equal parts");
            return;
        }

        int parts=len/n;


        for (int i=0;i<len;i+=parts){
            System.out.println(s.substring(i,i+parts));
        }

    }
    }


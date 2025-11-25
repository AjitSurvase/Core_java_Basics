package uss;


//program for given String into equal parts

import java.util.Scanner;

public class equalpart2 {

    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("give the String here:");
        String s= sc1.next();

        System.out.println("how many part you want");
        int n= sc1.nextInt();

        int lengthOf=s.length();

//        System.out.println(lengthOf);

        if(s.length()%n!=0)
        {
            System.out.println("can not eqaul parts ");
            return;
        }


        int partsize=lengthOf/n;

        for(int i=0;i<lengthOf;i=i+partsize)
        {
            System.out.println(s.substring(i,i+partsize));
        }




    }
}


    //What happens with return;

   // After printing "cannot divide into equal parts", the program exits the main method immediately.

  //  So the loop never runs, and you avoid the crash.
package array;

import java.util.Scanner;

public class ArrayDemo7 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter number");
        int no=sc1.nextInt();

        int[] arr1={10,20,30,40,50};
        boolean found=false;

        for(int a=0;a<arr1.length;a++)
        {
            if (arr1[a]==no)

            {
                found=true;
            }

        }
        if(found)
        {
            System.out.println("no exist");
        }
        else
        {
            System.out.println("no does not exist");
        }
    }
}

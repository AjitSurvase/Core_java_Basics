package array;

import java.util.Scanner;

public class ArrayDemo14 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int [][][] arr1;
        arr1=new int[2][2][2];

        //1st row

        arr1[0][0][0]=10;
        arr1[0][0][1]=20;
        arr1[0][1][0]=30;
        arr1[0][1][1]=40;

        //2nd row

        arr1[1][0][0]=50;
        arr1[1][0][1]=60;
        arr1[1][1][0]=70;
        arr1[1][1][1]=80;



        //row
        for(int a=0;a<arr1.length;a++)
        {
            for(int b=0;b<arr1.length;b++)
            {
                for(int c=0;c<arr1.length;c++)
                {
                    System.out.print(arr1[a][b][c]+"\t");
                }//pannels completed

            }//colums completed

            System.out.println();

        }//row completed


    }
}

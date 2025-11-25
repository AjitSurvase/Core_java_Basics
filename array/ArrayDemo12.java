package array;

import java.util.Scanner;

public class ArrayDemo12 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER TOTAL NO OF ROWS");
        int rows=sc1.nextInt();

        System.out.println("ENTER TOTAL NO COLUMN");
        int col=sc1.nextInt();

        int [][] data=new int[rows][col];

        for(int a=0;a<rows;a++)
        {
            for(int b=0;b<col;b++)
            {
                data[a][b]=sc1.nextInt();

            }
        }
        for(int a=0;a<rows;a++)
        {
            for(int b=0;b<col;b++)
            {
                System.out.print(data[a][b]+"\t");

            }
            System.out.println();
        }
    }


}

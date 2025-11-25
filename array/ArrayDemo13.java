package array;

import java.util.Scanner;

public class ArrayDemo13 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("ENTER TOTAL NO OF FLOORS");
        int floors=sc1.nextInt();

        System.out.println("ENTER TOTAL NO OF FLATS");
        int flats=sc1.nextInt();

        int[][] apartment=new int[floors][flats];
        System.out.println("ENTER FLAT NO");

        for(int a=0;a<floors;a++)
        {
            for(int b=0;b<flats;b++)
            {
                apartment[a][b]=sc1.nextInt();
            }
        }
        System.out.println("===================");
        for(int a=0;a<floors;a++)
        {
            System.out.println("floors no:"+(a+1));
            for(int b=0;b<flats;b++)
            {
                System.out.print("flats no:"+apartment[a][b]+"\t\t");
            }
            System.out.println();
        }
    }
}

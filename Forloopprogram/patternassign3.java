package Forloopprogram;

public class patternassign3 {
    public static void main(String[] args) {
        int lines=3;
        int star=5;
        int space=0;

        for(int r=1;r<=lines;r++)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");

            }

            for(int c=1;c<=star;c++)
            {
                System.out.print("*");

            }
            System.out.println();
            star-=2;
            space++;
        }
    }
}

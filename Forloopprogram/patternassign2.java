package Forloopprogram;

public class patternassign2 {
    public static void main(String[] args) {
        int lines=2;
        int star=1;
        int space=2;

        for(int r=0;r<=lines;r++)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");

            }

            for(int c=1;c<=star;c++)
            {

                System.out.print(star-r);



            }

            star+=2;
            System.out.println();
            space--;


        }
    }
}

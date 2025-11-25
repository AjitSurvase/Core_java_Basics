package Forloopprogram;

public class pattern5 {
    public static void main(String[] args) {
        int lines=4;
        int star=4;

        for(int r=1;r<=lines;r++)
        {
            int no=4;
            for(int c=1;c<=star;c++)
            {
                System.out.print(no);
                 no--;
         }  System.out.println();
            star--;
        }
    }
}

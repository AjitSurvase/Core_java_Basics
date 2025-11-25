package Forloopprogram;

public class pattern3 {
    public static void main(String[] args) {
        int lines=3;
        int star=1;

        for(int r=1;r<=lines;r++)
        {
            for(int c=1;c<=star;c++)
            {
                System.out.print(c);
            }
            System.out.println();
            star++;
        }
    }
}

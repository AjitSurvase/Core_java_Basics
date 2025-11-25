package Forloopprogram;

public class pattern4 {
    public static void main(String[] args) {
        int lines=3;
        int star=1;


        for(int r=1;r<=lines;r++)
        {
            char ch='A';
            for(int c=1;c<=star;c++)
            {
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();
            star++;



        }
    }
}

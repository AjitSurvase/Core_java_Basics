package Forloopprogram;

public class patternassign1
{
    public static void main(String[] args)
    {
        int lines=3;
        int star=1;
        int space=2;

        for(int r=1;r<=lines;r++)
        {
         for(int s=1;s<=space;s++)
         {
             System.out.print(" ");
         }
         char ch='A';
         for(int c=1;c<=star;c++)
         {
             System.out.print(ch);
             ch++;
         }
            System.out.println();
         star+=2;
         space--;
        }
        }
    }
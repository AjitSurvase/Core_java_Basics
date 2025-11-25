package Forloopprogram;

public class pattern1 {
    public static void main(String[] args) {
        int lines=3;
        int star=1;
        //row
        for(int r=1;r<=lines;r++)
        {
       //column
         for(int c=1;c<=star;c++){
              System.out.print("*");
            }
            System.out.println();
            star++;
        }
    }
}
//output:
//*
//**
//***
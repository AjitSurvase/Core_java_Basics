package String;
import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("ENTER CHARCTER");

     /*   String s1=sc1.next();
        String s2=s1.toUpperCase();
        char c=s2.charAt(0); */

        char ch =sc1.next().toUpperCase().charAt(0);

        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')                      //VOWEL
        {
            System.out.println("GIVEN CHAR IS VOWEL");

        }
        else
        {
            System.out.println("GIVEN STRING IS CONSONANT");
        }





    }

}

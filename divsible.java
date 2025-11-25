//program for number divisible by 9 & 13 .
import java.util.Scanner;
public class divsible {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);

        System.out.println("ENTER NUMBER");
        int num=sc1.nextInt();

        if(num%9==0 && num%13==0 )
        {
            System.out.println("Foo Bar");
        }
        else if(num%9==0)
        {

            System.out.println("Foo");
        }
        else if(num%13==0)
        {
            System.out.println("Bar");
        }

    }
}

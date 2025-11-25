//program for some of digit
import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("enter number");
        int num=sc1.nextInt();
        int digit;
        int sum=0;
        while(num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("sum of digit "+sum);
    }
}

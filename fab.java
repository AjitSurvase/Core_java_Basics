import java.util.Scanner;

public class fab {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("enter the feb series no");
        int num=sc1.nextInt();

        int num1=0;
        int num2=1;
        int num3;

        for(int i=3;i<=num;i++)
        {
            num3=num1+num2;
            num1=num2;
            num2=num3;

            System.out.println(num3);
        }
    }
}

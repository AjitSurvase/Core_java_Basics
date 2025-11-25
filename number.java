import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number ");
        int num1=sc1.nextInt();

        System.out.println("enter the second number");
        int num2=sc1.nextInt();

        for(int i=num1;i<=num2;i++)
        {
            System.out.println(i);
        }

    }
}

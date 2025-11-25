import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int flag=1;                                    //assume it prime number
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc1.nextInt();


         if(num<=1)
         {
             flag=0;                   // assume its not prime
         }


        for(int i=2;i<=num;i++)
        {
            if(num%2==0) {
                flag = 0;
            }

        }
        if(flag==1)
        {
            System.out.println("it is prime number");
        }
        else
        {
            System.out.println("it is not prime number");
        }

    }
}

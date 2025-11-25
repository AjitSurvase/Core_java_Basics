import java.util.Scanner;

    public class AmstrongNum {

        public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Number");
            int n=s.nextInt();


            int temp=n,sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum=sum+rem*rem*rem;
                n=n/10;
            }
            if(temp==sum) {
                System.out.println( "Armstrong Number");
            }
            else {
                System.out.print(" not a Armstrong Number");
            }

        }

    }


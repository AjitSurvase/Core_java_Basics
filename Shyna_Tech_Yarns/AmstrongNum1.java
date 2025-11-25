package Shyna_Tech_Yarns;

import java.util.Scanner;

public class AmstrongNum1 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);       // taking user input
        System.out.println("Enter the Number");
        int n=s.nextInt();                      // storing input number in n

        int temp=n, sum=0;                      // keeping original number in temp
        while(n>0)                               // loop until n becomes 0
        {
            int rem=n%10;                       // extracting last digit
            sum=sum+rem*rem*rem;               // cube the digit and add to sum
            n=n/10;                             // remove last digit
        }
        if(temp==sum) {
            System.out.println( "Armstrong Number");
        }
        else {
            System.out.print("not an Armstrong Number");
        }
    }
}

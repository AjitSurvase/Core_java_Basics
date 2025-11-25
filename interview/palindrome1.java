package interview;

import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number");

        int num= sc1.nextInt();

        int org_num=num;
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev)
        {
            System.out.println(org_num+" number is palindrome ");
        }
        else
        {
            System.out.println(org_num+" number is not  palindrome ");
        }
    }
}

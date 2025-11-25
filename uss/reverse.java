package uss;

public class reverse {
    public static void main(String[] args) {
        int num=1234;

        int rev=0;

       while(num!=0)
       {
           int digit=num%10;
           System.out.println(digit);
           rev=rev*10+digit;
           num=num/10;
           //System.out.println(num);
       }
        System.out.println(rev);
    }
}


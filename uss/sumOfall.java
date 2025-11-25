package uss;

public class sumOfall {
    public static void main(String[] args) {

        int  sum=0;
        int  count=0;

        for(int i=100;i<=200;i++)
        {
            if(i%9==0) {
                System.out.println(i);
                sum=sum+i;
                count++;

            }

        }
        System.out.println(count);    //count
        System.out.println(sum);    //sum of the all number
    }
}

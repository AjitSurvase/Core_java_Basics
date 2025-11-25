 import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc1.nextInt();


        int multi=1;

        for(int i=num;i>=1;i--)
        {

            multi=multi*i;
        }

        System.out.println(multi);

    }
}

//5*4*3*2*1=120
//quation 5:
import java.util.Scanner;

class Demo5
{
	public static void main(String[] args)
	{
	 //step 2

	 Scanner sc1=new Scanner(System.in);

    
    System.out.println("ENTER FIRST NUMBER");
    int a=sc1.nextInt();

    System.out.println("ENTER SECOND NUMBER");
    int b=sc1.nextInt();

    System.out.println("ENTER THIRD NUMBER");
    int c=sc1.nextInt();


    if(a==b &b==c)
    {
    	System.out.println("all number are equal");
    }
   else
   {
    int m=a;
    if(b>m)
        m=b;
    if(c>m)
        m=c;
      System.out.println("number are not equal:"+a+b+c);
   	
   }


	}
}
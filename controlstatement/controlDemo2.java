//step 1
import java.util.Scanner;

class controlDemo2
{
	public static void main(String[] args)
	{
	 //step 2

	 Scanner sc1=new Scanner(System.in);

    
    System.out.println("ENTER FIRST NUMBER");
    int num1=sc1.nextInt();

    System.out.println("ENTER SECOND NUMBER");
    int num2=sc1.nextInt();


    if(num1>num2)
    {
    	System.out.println("NUMBER ONE IS GRETER THAN TWO");
    }
   else if(num1<num2)
   {
   	   System.out.println("NUMBER ONE IS LESS THAN TWO ");

   }
   else
   {
   	 System.out.println("BOTH NUMBER ARE EQUAL");
   }


	}
}
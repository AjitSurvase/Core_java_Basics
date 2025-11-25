//step 1
import java.util.Scanner;

class operatorDemo2
{
	public static void main(String[] args)
	{
          //step 2
	 Scanner sc1=new Scanner(System.in);

     System.out.println("ENTER NUMBER");
     int no=sc1.nextInt();

     String result=(no%2==0)?"even":"odd";
     System.out.println("no is:"+result);


	}
}

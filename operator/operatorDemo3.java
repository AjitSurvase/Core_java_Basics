//step 1
import java.util.Scanner;

class operatorDemo3
{
	public static void main(String[] args)
	{
          //step 2
	 Scanner sc1=new Scanner(System.in);

     System.out.println("ENTER CHOICE :");
     
     int choice=sc1.nextInt();

     String result=(choice==1)?"JAVA":((choice==2)?"SQL":"MANUAL");

     System.out.println("COURCE IS: "+result);


	}
}

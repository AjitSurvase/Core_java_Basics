//program for even number by input from user ;

import java.util.Scanner;
class Forloop6
{
	public static void main(String[] args )
	{

	 Scanner sc1=new Scanner(System.in);
	 System.out.println(" enter a start point");
	 int start=sc1.nextInt();

	 System.out.println("enter end point");
	 int end=sc1.nextInt();

	 System.out.println("---------------------------------");

	 for(int i=start ;i<=end;i++)
	 {
       if(i%2==0)
       {
       	System.out.println(i);
       }
	 }
	}
}
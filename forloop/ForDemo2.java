import java.util.Scanner;

class ForDemo2
{
	public static void main(String[] args)
	{
	 Scanner sc1=new Scanner(System.in);

	  System.out.println("ENTER START POINT");
	  int start=sc1.nextInt();

	  System.out.println("ENTER END POINT");
	  int end=sc1.nextInt();

	  for(int a=start; a<=end; a++)
	  {
	  	if(a%2==0)
	  	{
	  		System.out.println(a);
	  	}
	  }
	}
}
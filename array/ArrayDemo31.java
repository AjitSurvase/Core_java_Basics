import java.util.Scanner;

class ArrayDemo3
{
	public static void main(String[] args)
	{
	 Scanner sc1=new Scanner(System.in);

	 System.out.println("ENTER NO OF COURCES");
	 int num=sc1.nextInt();

     String[] cources=new String[num];
	 System.out.println("ENTER NAME OF COURCE");
	 

	 for(int a=0;a<num;a++)
	 {
	 	cources[a]=sc1.next();
	 }

	 System.out.println("============================");
	 System.out.println("SELECTED COURCE ARE");

	 for(String s:cources)
	 {
	 	System.out.println(s);
	 }
	}
}
import java.util.Scanner;

class ForDemo3
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);

		System.out.println("ENTER NO OF USERS");
		int count=sc1.nextInt();

		for(int a=1;1<=count;a++)
		{
			System.out.println("ENTER USER NAME");
			String name=sc1.next();


			System.out.println("welcome "+name);
		}

	}
}
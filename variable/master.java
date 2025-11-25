class Master
{
	 static int k=20;
     static void test()
	 {
	   System.out.println("TSET METHOD");
	 }
	}
class MainApp1
{
	public static void main(String[]args)
	{
		System.out.println("MAIN METHOD");
		Master.test();

		System.out.println("k value is:"+Master.k);
	}
}

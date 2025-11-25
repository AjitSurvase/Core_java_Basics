

class variableDemo
{
	static int k=25;
	String b;
	

	void test()
	{
		double d=36.25;
		System.out.println("D VALUES :"+d);
	}
}
class MainApp1
{
	public static void main(String[] args)
   {
      System.out.println("K VALUES :"+ variableDemo.k);
      variableDemo v1=new variableDemo();
      System.out.println("B VALUES :"+v1.b);

      v1.test();
    }
}
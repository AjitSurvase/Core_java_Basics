class MethodDemo1
{
	 //interenal method
	public static void main(String[] args)
 {
	System.out.println("main method");

	test();
	run();
 }


//external method

  static void test()
  {
  	System.out.println("TEST METHOD");

  }

//external method

  static void run()
  {
  	System.out.println("RUN METHOD");
  }

  }
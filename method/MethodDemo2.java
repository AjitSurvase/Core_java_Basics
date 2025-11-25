class MethodDemo2
{
   //internal method
	public static void main(String[] args)
	{
	 System.out.println("MAIN METHOD STARTED");

    test();
   
    System.out.println("MAIN METHOD ENDED");
	}

 //external method

 static void test()
 {
  System.out.println("TEST METHOD");
  run();


 }
 //external method 2


static void run()
{
	System.out.println("RUN METHOD");
}


}
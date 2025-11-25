class Master
{
	 static int k=20;

	 int p=10;

	 static void test()
	 {
	  System.out.println("TEST METHOD");

	 }
	 void display()
	 {
	  System.out.println("DISPLAY METHOD");
	 }
	 public static void main(String[] args)
	 {
	  System.out.println("PROGRAM STARTED");
	  System.out.println("K:"+k);
	  test();
	  Master m1=new Master();
	  System.out.println("P:"+ m1.p);
	  m1.display();
	  System.out.println("PROGRAM ENDED");
	 }

	
}
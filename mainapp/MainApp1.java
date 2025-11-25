class Master  //business logic class or functional class
{
  static int k=20;

  static void test()
  {
  	System.out.println("TEST METHOD");

  }
}




class MainApp1   //main class or excutable class
{
	
public static void main(String[] args)
{
   System.out.println("MAIN METHOD");
   Master.test();

   System.out.println("VALUE OF K:"+ Master.k);	
}
}
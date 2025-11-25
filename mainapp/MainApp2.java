//demonstarization of a non static function


class Central   //buiesness class or functional class 
{
	int k=10;  //data member

   void test() //member function
   {

   System.out.println("TEST METHOD");
   }
}



class MainApp2    // main class or executable class
{
	public static void main(String[] args)
	{
	 System.out.println("MAIN METHOD");
	 new Central().test();                                      //object ie.class name central= new Central()
	 System.out.println("VALUE OF K:"+new Central().k);
	}
}

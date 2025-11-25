//demonstarization of a non static function


class Central   //buiesness class or functional class 
{
	static int k=10;  //data member

    void test() //member function
   {

   System.out.println("TEST METHOD");
   }
}



class MainApp222    // main class or executable class
{
	public static void main(String[] args)
	{
	 System.out.println("MAIN METHOD");
	   new Central().test();                                      
	 System.out.println("VALUE OF K:"+ Central.k);
	}
}

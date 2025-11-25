class MethodDemo
{
   //internal method 
	public static void main(String[] args)
	{
   System.out.println("main method");
     display();
     display();

	}


	//external method 

	static void display()
	{
	 System.out.println("DISPLAY METHOD");
	}
}
class MethodDemo3
//internal method

{ 
	public static void main(String[] args)
	{
      addition(5,10);
      addition(100,150);
	}
   //External method

  static void addition(int a,int b)
  {
   int c=a+b;
   System.out.println("addition:"+c);
  }

}
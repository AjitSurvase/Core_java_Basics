class UnaryDemo2
{
	public static void main(String[] args)
	{

	 int x=8;
	 int y;

	 y=x--;    //post decrement
   
   System.out.println("X:"+x); //7
   System.out.println("Y:"+y); //8

	

  int p=3;
  int q;
  q=--p;       //pre decrement

  System.out.println("P:"+p); //
  System.out.println("Q:"+q); //
}
}
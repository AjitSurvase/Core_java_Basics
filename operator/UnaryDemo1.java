class UnaryDemo1
{
	public static void main(String[] args)
	{

	 int x=2;
	 int y;

	 y=x++;    //post increment
   
   System.out.println("X:"+x); //3
   System.out.println("Y:"+y); //2

	

  int p=7;
  int q;
  q=++p;       //pre increment

  System.out.println("P:"+p); //8
  System.out.println("Q:"+q); //8
}
}
class SwapToNum
{
	public static void main(String[] args)
	{

   int x=20;
   int y=40;

   System.out.println(x+"\t"+y);

   //using third vairable method 

   int data;
   data=x;
   x=y;
   y=data;

   System.out.println(x+"\t"+y);

   //without using third variable

  x= x+y;
  y=x-y;
  x=x-y;

  System.out.println(x+"\t"+y);

	}
}
class Swap
{
	public static void main(String[] args)
	{
	  int a=10;
	  int b=20;

	 System.out.println("value of a:"+a);
	 System.out.println("value of b:"+b);

	 // int data;
	 // data=a;
	 // a=b;
	 // b=a;

	 // System.out.println("value of a after swaping :"+a);
	 // System.out.println("value of b after swaping :"+b);
	

	//without using third variable:
     
     a=a+b;
     b=a-b;
     a=a-b;

     System.out.println("value of a after swapping:"+a);
     System.out.println("value of b after swaping :"+b);

	}
}
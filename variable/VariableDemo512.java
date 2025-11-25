class VariableDemo512
{
	public static void main(String[] args)
	{
	 int x=20;
	 int y=40;

	 System.out.println(x+"\t"+y);

    // third element use 

    int data;
     data=x;
     x=y;
     y=data;

     System.out.println(x+"\t"+y);

     // arthmeti ie.without using third element

     x=x+y;
     y=x-y;
     x=x-y;

     System.out.println(x+"\t"+y);

	}
}
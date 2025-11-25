class VariableDemo51
{
	public static void main(String[] args)
	{
		int x=20;
		int y=40;

	 System.out.println(x+"\t"+y);

	 //third variable apporoch 

	 int data;                                //x=20,x=40 data=z; 
	 data=x;                                 
	 x=y;
	 y=data;

	 System.out.println(x+"\t"+y);

    // arthematic apporoch

	 x=x+y;
	 y=x-y;
	 x=x-y;

	 System.out.println(x+"\t"+y);


	}

}
class operatorDemo1
{
	//INTERNAL METHOD:
	public static void main(String[] args)
	{
		int a=2;
		int b=4;

		if(++a>2 &&--b<4)
		{
			a++;
			b--;
		}
	   else
	   {
	   	b++;
	   	a--;
	   }

	   System.out.println(" UPDATED VALUE OF A:"+a); //4
	   System.out.println(" UPDATED VALUE OF B:"+b); //2
	 }
}	 

class BlockDemo5
{
	static
	{
     System.out.println("STATIC BLOCKS");
	}
	public static void main(String[] args)
	{
	 System.out.println("MAIN METHOD");
	 BlockDemo5 d1=new BlockDemo5();
	 BlockDemo5 d2=new BlockDemo5();
	 

	}

	{
	 System.out.println("NON STATIC BLOCKS");
	 
	}
	
}
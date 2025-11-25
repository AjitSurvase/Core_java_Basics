class Master
{
	static int k=10;
	static
	{
	 k=25;
	 System.out.println("BUISNESS STATIC BLOCKS 1");
	}
	static
	{
	 int k=30;
	 System.out.println("K LOCAL:"+k);
	 System.out.println("BUISNESS STATIC BLOCKS 2");
	}
}

class BlockDemo3
{
	public static void main(String[] args)
	{
	 System.out.println("MAIN METHOD");
	 System.out.println("K:"+Master.k);

	}
	static
	{
	 System.out.println("MAIN STATIC BLOCKS");
	}
}

//demo

class Master
{
	static int k=10;
	static
	{
	 
	 System.out.println("BUISNESS STATIC BLOCKS 1");

	}
	static
	{
	  
	 System.out.println("BUISNESS STATIC BLOCKS 2");
	}


}

class BlockDemo31
{
public static void main(String[] args)
{
	System.out.println("MAIN METHOD");
	System.out.println("K VALUE:"+Master.k);
}
static
{
  System.out.println("MAIN STATIC BLOCKS");
}

}
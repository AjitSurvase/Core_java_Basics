class BlockDemo2
{
	static int p=25;
	static int j=14;

	static
	{
	 p=78;
	 System.out.println(p+j); 
	}

   static
   {
    j=40;
    System.out.println(j+p);
   }

   public static void main(String[] args)
   {
    System.out.println("MAIN METHOD");
   }
}
//q4
class Demo4
{
	public static void main(String[] args)
	{
	 int num;

	 Scanner sc1=new Scanner(System.in);

    
    System.out.println("ENTER NUMBER");
    num=sc1.nextInt();

   if(num%5==0)
   {
   	System.out.println("yes");
   }
   else 
   {
   	System.out.println("no");
   }
  if (num>0)
  {
  	System.out.println(num+"positive number");
  }
  else if (num<0)
   {
  	System.out.println(num+"no is negative");
  }
}
}
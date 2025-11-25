class Employee

{
	public static void main(String arg)
	{
	 int x=20;
	 int y=40;

     System.out.println(x+"\t"+y);

	 //tbhird element
      int data;
      data=x;
      x=y;
      y=data;

      System.out.println(x+"\t"+y);

      //without using third element

      x=x+y;
      y=x-y;
      x=x-y;

    System.out.println(x+"\t"+y);
     
	}
}
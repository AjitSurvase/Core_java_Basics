class RevString                                         //program for reverse String.
{
	public static void main(String[] args)
	{
	 String s="jspider";

	 System.out.println(s);

	 char[] data=s.toCharArray();

	 for(int i=0; i<data.length; i++)
	 {
	 	System.out.print(data[i]);
	 }

             System.out.println();
             System.out.println("=========================");

     for(int i=data.length-1;i>=0;i--)
     {
     	System.out.println(data[i]);
     }

	}
}
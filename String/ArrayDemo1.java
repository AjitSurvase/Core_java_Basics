
// program for 1D array:

class ArrayDemo1
{
	public static void main(String[] args)
	{
	  //decleration 
		char[] arr1;

		//size allocation
		 arr1=new char[3];

		//intialization
		arr1[0] ='a';
		arr1[1] ='b';
		arr1[2] ='c';

 /*  for(int a=0;a<arr1.length;a++)
   {
   	System.out.println(arr1[a]);
   }*/


//enhanced for loop
   for(char a:arr1)
   {
   	System.out.println(a);
   }

   
	}
}
//logical opertor
class operatorDemo111
{
	public static void main(String[] args)
	{
	  int x=10;
	  int y=12;
	  int z=14;

	  if((x++>y-- || ++z<x--)&&(z-->x-- || y++>++x))
	  {
	   x++;
	  }

    System.out.println("UPDATED VALUE OF X:"+x); //10
    System.out.println("UPDATED VALUE OF Y:"+y); //11
    System.out.println("UPDATED VALUE OF Z:"+z); //15



	}
}
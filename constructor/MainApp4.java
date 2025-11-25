class demo
{
	int k;


	demo(int k)
	{
	  this.k=k;                 //jvm will confuse k varible is instance or local so (this.k)  keyword is use.
	}

	void display()
	{
	  System.out.println(k);
	}
}

class MainApp4
{
	public static void main(String[] args)
	{


	  demo d1=new demo(25);
	  d1.display();

     }
}
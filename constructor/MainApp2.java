class product
{
	int productId;
	String productName;


//user defined constructor

product(int id,String name)
{
	productId=id;
	productName=name;
}

void display()
{
	System.out.println(productId+"\t\t"+productName);
}
}

class MainApp2
{
	public static void main(String[] args)
	{
		product p1=new product(101,"laptop");
		p1.display();
		product p2=new product(102,"mobile");
		p2.display();
	}
}

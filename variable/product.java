class Product
{
	public static void main(String[] args)
	{
	  int Price=200;
	  int Qty=5;
	  double TotalAmount=Price+Qty;

	  System.out.println("TotalAmount:"+TotalAmount);

	  double Discount=TotalAmount-TotalAmount+0.05;
	  System.out.println("Discount:"+TotalAmount);

	  Double GstAmount=TotalAmount+TotalAmount*0.1;

	  System.out.println("TotalAmountWithGst:"+GstAmount);
	}
}

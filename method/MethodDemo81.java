class MethodDemo81
{
	public static void main(String[] args)
	{

      calculateDiscount();


    }


static double calculateBill(int qty, double price)
{
	double totalamount=price*qty;
	System.out.println("BILL AMOUNT WITHOUT DISCOUNT:"+totalamount);
	return totalamount;
}



static void calculateDiscount()
{
	double amount=calculateBill(5,250.25);
	double finalamount=amount-amount*0.1;
	System.out.println("bill amount with DISCOUNT:"+finalamount);
}
}
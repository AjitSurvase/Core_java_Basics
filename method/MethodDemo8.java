class MethodDemo8
{
    public static void main(String[] args) 
	{
     calculateDiscount();

	}


static double calculateBill(int qty,double price)
{
	double billAmount=qty*price;
	System.out.println("ORIGINAL AMOUNT WITHOUT DISSCOUNT:"+billAmount);
	return billAmount;
}


static void calculateDiscount()
{
 double amount=calculateBill(5,250.25);
 double FinalAmount=amount-amount*0.1;
 System.out.println("FINAL AMOUNT WITH DISSCOUNT:"+FinalAmount);


}


}
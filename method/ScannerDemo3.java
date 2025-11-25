//step 1
import java.util.Scanner;
class ScannerDemo3
{
  public static void main(String[] args)
  {
	//step2

	Scanner sc1=new Scanner(System.in);

 //step 3


 System.out.println("ENTER QTY");
 int qty=sc1.nextInt();

 System.out.println("ENTER PRICE");
 double price=sc1.nextDouble();

 // external method call
 calculateBill(qty,price);
}



//external methhod
static void calculateBill(int qty,double price)
{
	double amount=qty*price;
	System.out.println("AMOUNT:"+amount);
}


}




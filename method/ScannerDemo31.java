//step1
import java.util.Scanner;

class ScannerDemo31
{ 
	//internal method

	public static void main(String[] args)
	{
      //step 2

      Scanner sc1=new Scanner(System.in);

      //step3
   

   System.out.println("Enter qty");
    int qty=sc1.nextInt();

    System.out.println("Enter price");
    double price=sc1.nextDouble();


    
    CalculateBill(5,50);

	}


	//external method

	static void CalculateBill (int qty,double price)
	{
		double amount=qty*price;
      System.out.println("amount:"+amount);
	}


}
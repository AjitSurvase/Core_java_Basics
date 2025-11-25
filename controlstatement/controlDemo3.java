//step1
import java.util.Scanner;

//internal method
class controlDemo3
{
	public static void main(String[] args)
	{
    
    //step 2
     Scanner sc1=new Scanner(System.in);

      // step 3
     System.out.println("SELECT PRODUCT");
     System.out.println("1.MOBILE:\t 2.EARPHONE");
     int choice=sc1.nextInt();


     System.out.println("ENTER QTY");
     int qty=sc1.nextInt();


     System.out.println("ENTER PRICE");
     double price=sc1.nextDouble();

    

   if(choice==1)
    {
   	  getMobileBill(qty,price);
    }
   else if(choice==2)
    {
  	   getEarphoneBill(qty,price);
    }
    else 
     {
     	System.out.println("INVALID CHOICE");

     }

	}

 //external method

   static void getMobileBill(int qty,double price)
   {
   	double Total=qty*price;
   	double Finalamount=Total-Total*0.1;
   	System.out.println("BILL AMOUNT:"+Finalamount);
   }



   static void getEarphoneBill(int qty,double price)
   {
   	double Total=qty*price;
   	double Finalamount=Total-Total*0.15;
   	System.out.println("BILL AMOUNT:"+Finalamount);

   }

}
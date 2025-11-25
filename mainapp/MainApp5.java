//step1
import java.util.Scanner;

//buisness logic class or functional
class HotelSimulator
{
	static double costofVegDish=250;
	static double costofNonVegDish=350;
	static double gstForAcHotel=0.18;
	static double gstForNonAcHotel=0.9;


  void CaculateAcBill(int typeOfDish,int qty)
  {
  	if(typeOfDish==1)
  	{

  	double total=costofVegDish*qty;
  	double finalamt=total+total*gstForAcHotel;
  	System.out.println("FINAL AMOUNT:"+finalamt);

    }

   else if(typeOfDish==2)
   {
    double total=costofVegDish*qty;
    double finalamt=total+total*gstForNonAcHotel;
    System.out.println("FINAL AMOUNT:"+finalamt);
   }
  else 
  	{
  		System.out.println("INVALID MENU TYPE");
  	}

 }
 void CalculateNonAcBill(int typeOfDish,int qty)
 {
 	if(typeOfDish==1)
 	{
 		double total=costofNonVegDish*qty;
 		double finalamt=total+total*gstForAcHotel;
 		System.out.println("FINAL AMOUNT:"+finalamt);

 	}
 	else if(typeOfDish==2)
 	{
 		double total=costofNonVegDish*qty;
 		double finalamt=total+total*gstForNonAcHotel;
 		System.out.println("FINAL AMOUNT:"+finalamt);
 	}
 	else 
 	{
 		System.out.println("INVALID MENU TYPE");
 	}

 }

}


//executable claa or main class
class MainApp5
{
	public static void main(String[] args)
     {
   //step 2
	Scanner sc1=new Scanner(System.in);

	System.out.println("SELECT TYPE OF HOTEL");
	System.out.println("1.AC:\n2.NONAC");
	int typeOfHotel=sc1.nextInt();

	System.out.println("SELECT TYPE OF MENU");
	System.out.println("1.VEG:\n2.NONVEG");
	int typeOfMenu=sc1.nextInt();

	System.out.println("ENTER DISH QTY");
	int qty=sc1.nextInt();

	if(typeOfHotel==1)
	{
		
        new HotelSimulator(). CaculateAcBill(typeOfMenu,qty);
	}
	else if(typeOfHotel==2)
	{
		 new HotelSimulator().CalculateNonAcBill(typeOfMenu,qty);
	}
	else 
	{
		System.out.println("INVALID HOTEL TYPE");
	}

}
}
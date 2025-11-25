//step 1
import java.util.Scanner;

//buisness logic class
class HotelSimulator
{
	static double costofVegDish=250;
    static double costofNonVegDish=350;
    static double gstforAcHotel=0.18;
    static double gstForNonAcHotel=0.9;

//calculate bill amount

    void CalculateAcBill(int typeofdish,int qty)
    {
	if(typeofdish==1)
	{
		double total=costofVegDish*qty;
		double finalamt=total+total*gstforAcHotel;
		System.out.println("FINAL AMOUNT:"+finalamt);
	}
	else if(typeofdish==2)
	{
		double total=costofNonVegDish*qty;
		double finalamt=total+total*gstforAcHotel;
		System.out.println("FINAL AMOUNT:"+finalamt);

	}
	else 
	{
		System.out.println("INVALID MENU TYPE");

	}
}

void CalculateNonAcBill(int typeofdish,int qty)
{
	if(typeofdish==1)
	{
		double total=costofNonVegDish*qty;
		double finalamt=total+total*gstForNonAcHotel;
		System.out.println("FINAL AMOUNT:"+finalamt);
	}
	else if(typeofdish==2)
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


class MainApp4
{
	public static void main(String[] args)
	{
     //STEP 2
	Scanner sc1=new Scanner(System.in);

	System.out.println(" SELECT TYPE OF HOTEL ");
    System.out.println("1.AC\n 2.NON AC");
    int typeOfHotel=sc1.nextInt();

    System.out.println("SELECT TYPE OF DISH");
    System.out.println("1.VEG\n 2.NON-VEG");
    int typeOfMenu=sc1.nextInt();

    System.out.println("ENTER DISH QTY");
    int qty=sc1.nextInt();


   if(typeOfHotel==1)
   {
   	new HotelSimulator().CalculateAcBill(typeOfMenu, qty);
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
 //step 1
 import java.util.Scanner;

//internal method 
 class controlDemo1
 {
  public static void main(String[] args)
  {
    //step2
     Scanner sc1=new Scanner(System.in);
     System.out.println("ENTER QTY");
     int qty=sc1.nextInt();

     System.out.println("ENTER PRICE");
     double price=sc1.nextDouble();

     //method call
     calculateBill(qty,price);
  }


  //External method

 static void calculateBill(int qty, double price)

 {
 	if(price>0.0)
  {
   double amount=qty*price;
   System.out.println("TOTAL AMOUNT:"+amount);

 } 
 else 
 {
 	 System.out.println("PRICE SHOULD NOT BE NEGATIVE VALUE");
 }

}
}
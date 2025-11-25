package overriding;

public class Flipkart extends Ecomerce{
    void sellprodcuct(int qty,double price)
    {
        double total=qty*price;
        //5% disccount

        double finalAmt=total-total*0.05;
        System.out.println("final amount:"+finalAmt);
    }
}

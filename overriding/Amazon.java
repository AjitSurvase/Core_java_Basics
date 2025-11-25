package overriding;
//subclass
public class Amazon extends Ecomerce{
    void sellprodcuct(int qty,double price)
    {
        double total=qty*price;
        //10% discount
        double finalAmt=total-total*0.1;
        System.out.println("final amount:"+finalAmt);
    }
}

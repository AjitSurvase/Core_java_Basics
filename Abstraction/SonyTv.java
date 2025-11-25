package Abstraction;
//implementation class
public class SonyTv implements Tv{
    @Override
    public void getInfo() {
        System.out.println("TV BRAND IS SONY");
        System.out.println("TV TYPE IS SMART");

    }

    @Override
    public void getOfferPrice(double price) {
        //10% off
         double total=price-price*0.01;
        System.out.println("offer price:"+total);
    }
}

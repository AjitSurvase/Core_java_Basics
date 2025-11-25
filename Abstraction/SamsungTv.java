package Abstraction;
//step 2 implementation class
public class SamsungTv implements Tv {

    @Override
    public void getInfo() {
        System.out.println("Tv brand is samsung");
        System.out.println("tv type is LED");
    }

    @Override
    public void getOfferPrice(double price) {
        //5% off
        double total=price-price*0.05;
        System.out.println("OFFER PRICE :"+total);
    }
}

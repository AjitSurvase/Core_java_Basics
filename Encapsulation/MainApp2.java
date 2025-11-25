package Encapsulation;

public class MainApp2 {
    public static void main(String[] args) {
        //object of outer class
        Bike b1=new Bike();
        System.out.println("company:"+b1.company);
        System.out.println("price:"+b1.price);

        //object of inner class
        Bike.engine e1=b1.new engine();
        e1.start();
    }
}

package Encapsulation;
//outer class
public class Bike {
    String company ="HERO";
    double price=50000.25;

    //inner class
    class engine
    {
        void start (){
            System.out.println("ENGINE STARTED");
        }
    }
}

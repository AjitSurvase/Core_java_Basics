// : program for method overriding

package overriding;

public class MainApp1 {
    public static void main(String[] args) {
        Amazon a1=new Amazon();
        a1.sellprodcuct(5,600);

        Flipkart f1=new Flipkart();
        f1.sellprodcuct(5,600);
    }
}

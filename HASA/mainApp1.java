package HASA;

public class mainApp1 {
    public static void main(String[] args) {
        laptop l1=new laptop();
        laptop.p1.StartProcessor();    //composition
        l1.display();
        laptop.p1.StopProcessor();     //composition

    }
}

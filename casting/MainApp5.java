package casting;

public class MainApp5 {
    public static void main(String[] args) {
        machine m1=new printer();        //upcasting
        m1.getType();

        printer p1=(printer)m1;       //downcasting
        p1.getType();
        p1.getPrinterInfo();

    }
}

package casting;

public class MainApp3 {
    public static void main(String[] args) {
         sample s1=new sample();
         s1.test();
         s1.display();

         //downcasting

        sample s2=(sample)new Demo();      //object of superclass & reference of subclass
    }
}

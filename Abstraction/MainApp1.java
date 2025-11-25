package Abstraction;
//presentation  layer
//step 3: create reference of type interface
public class MainApp1 {
    public static void main(String[] args) {

        Switch s1=null;

        s1=new SolarLight();    //upcasting
        s1.SwitchOn();
        s1.SwitchOff();

        s1=new LedLight();      //upcasting
        s1.SwitchOn();
        s1.SwitchOff();
    }

}

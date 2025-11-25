package Abstraction;
//provide implementation for object factory
public class SolarLight implements Switch{
    @Override
    public void SwitchOn() {
        System.out.println("SOLAR LIGHT SWITCH ON");
    }

    @Override
    public void SwitchOff() {
        System.out.println("SOLAR LIGHT SWITCH OFF");

    }
}

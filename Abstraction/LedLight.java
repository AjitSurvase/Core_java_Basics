package Abstraction;

public class LedLight implements Switch{
    @Override
    public void SwitchOn() {
        System.out.println("LED LIGHT SWITCH ON");
    }

    @Override
    public void SwitchOff() {
        System.out.println("LED LIGHT SWITCH OFF");
    }
}

package AbstractClass;

public class mainApp1 {
    public static void main(String[] args) {
        //accessing static members
        System.out.println("A:"+Demo.a);
        Demo.display();

        //subclass object
        //to access non-static members

        sample s1=new sample();
        s1.test();
        s1.run();
        System.out.println("B:"+s1.b);


    }
}

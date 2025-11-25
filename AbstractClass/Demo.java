package AbstractClass;
//superclass
public abstract class Demo{
    //static & non static variables

    static int a=10;
    double b=20.25;

    //constructor
    Demo(){
        System.out.println("Demo constructor");

    }
    //non-static abstract method
    abstract void test();

    //non-static concrete method
    void run(){
        System.out.println("run method");

    }
    //static concrete method
    static void display(){
        System.out.println("display method");
    }

    //static block
    static{
        System.out.println("static block");
    }

    //non-static block
    {
        System.out.println("non static block");
    }


}

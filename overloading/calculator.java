package overloading;

public class calculator {
    void multiply(int a,int b)
    {
        System.out.println(a*b);
    }

    void multiply(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }

    void multiply(double p,double q)
    {
        System.out.println(p*q);
    }
}

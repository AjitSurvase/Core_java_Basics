package PROGRAMMING;
//swap two nuber with or without using third vaiable
public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("before swapping of a:"+a);
        System.out.println("before swapping of b:"+b);

        //first apporch: with using third variable

        int temp=a;
        a=b;
        b=temp;

        // second apporch: without using third vaibale arthemtic apporch

        a=a+b;
        b=a-b;
        a=a-b;

        //third apporch

        b=a+b-(a=b);

        System.out.println(" after swaping the value of a:"+a);
        System.out.println(" after swapping the value of b:"+b);
    }
}

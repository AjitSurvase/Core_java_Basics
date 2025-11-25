public class swapNum
{
    public static void main(String[] args) {
        double a=10;
        double b=20;

        System.out.println("the value of a:"+a);
        System.out.println("the value of b:"+b);

        //first apporch:

//        double temp=a;
//        a=b;
//        b=temp;
//
//        System.out.println("after swapingt he value of a:"+a);
//        System.out.println("after swaping the value of b:"+b);

        //second apporch:
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//
//        System.out.println("after swaping the value of a:"+a);
//        System.out.println("after swaping the value of b:"+b);

        //third apporch:

        b=a+b-(a=b);

        System.out.println(" after swaping the value of a:"+a);
        System.out.println(" after swapping the value of b:"+b);
    }
}

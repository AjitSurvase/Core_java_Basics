//program for String reverse
//swap number using all three method

public class pattern {
    public static void main(String[] args) {
//        String str="Ajit";
//
//        System.out.println(str);
//
//        char[] data=str.toCharArray();
//
//        for(int a=data.length-1;a>=0;a--)
//
//        System.out.println(data[a]);

 System.out.println("=================================================");

   double x=10;
   double y=20;

        System.out.println(" before swap value of x:"+x);
        System.out.println(("value of y:"+y));

  //first apporch using third vaiable

        /*double data;
        data=x;
        x=y;
        y=data;

        System.out.println(" after swap value of x:"+x);
        System.out.println("value of y:"+y);*/

//secont apporch without using third vaibale

       /* x=x+y;
        y=x-y;
        x=x-y;

        System.out.println(x);
        System.out.println(y);*/

        //third apporch

        y=x+y-(x=y);

        System.out.println(x);
        System.out.println(y);

    }
    }



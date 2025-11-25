package Shyna_Tech_Yarns;

public class swaping {

    public static void main(String[] args) {

        int x=10;
        int y=20;

        System.out.println(x);
        System.out.println(y);

        System.out.println("*******************");

      int temp;
      temp=x;
      x=y;
      y=temp;

        System.out.println("After swapping value of x:"+x);
        System.out.println("After swapping value of y:"+y);
    }

}

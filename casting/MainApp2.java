package casting;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("select TV TYPE");
        System.out.println("1:SMART TV");
        System.out.println("2:LED TV");
        int choice=sc1.nextInt();

        TV t1=null;

        if(choice==1)
        {
            t1=new SmartTv();  //upcasting
        }
        else if(choice==2)
        {
            t1=new LedTv();     //upcasting
        }
        t1.getType();

    }
}

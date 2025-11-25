package array;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER NO OF COURCE");
        int count=sc1.nextInt();

        String[] cource=new String[count];
        System.out.println("ENTER COURCE NAME");
        for(int a=0;a<count;a++)
        {
            cource[a]=sc1.next();
        }
        System.out.println("================");
        System.out.println("SELECTED COURCE ARE");
      for (String s:cource)
        {
            System.out.println(s);
        }
    }

}

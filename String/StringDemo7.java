package String;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER USERNAME");

        String name=sc1.nextLine();
        String username=name.trim();
        boolean status=username.isEmpty();
        if(status==true)
        {
            System.out.println("enter valid username");
        }
        else
        {
            System.out.println("welcome "+username);
        }
    }
}

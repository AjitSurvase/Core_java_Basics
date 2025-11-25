package overloading;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        employee e1=new employee();

        System.out.println("SELECT SEARCH CRATERIA ");
        System.out.println("1: SEARCH BY ID");
        System.out.println("2: SEARCH BY NAME");
        int choice =sc1.nextInt();
        if(choice==1)
        {
            System.out.println("ENTER EMPLOYEE ID:");
            int id=sc1.nextInt();
            e1.searchEmployee(id);
        }
        else if(choice==2)
        {
            System.out.println("SEARCH BY NAME:");
            String name=sc1.next();
            e1.searchEmployee1(name);
        }
        else
        {
            System.out.println("invalid choice");
        }
    }
}

package uss;

public class employee2 {


     int emp_id;
     String empname;
     static String company="uss";

      employee2(int emp_id,String empname)
     {
         this.emp_id=emp_id;
         this.empname=empname;
     }
     void display()
     {
         System.out.println(emp_id+" "+empname+" "+company);
     }

    public static void main(String[] args) {
        employee2 obj1=new employee2(101,"bob");
        obj1.display();
    }
}

package uss;

public class employee1 {

    int emp_id;
    String ename;
    static String company="uss";

    employee1(int emp_id,String ename)
    {
        this.emp_id=emp_id;
        this.ename=ename;

    }
    void dispaly()
    {
        System.out.println(emp_id+" "+ename+" "+company);
    }
    public static void main(String[] args) {
        employee1 obj1=new employee1(101,"bob");
        obj1.dispaly();
    }

}

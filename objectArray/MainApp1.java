package objectArray;

public class MainApp1 {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"ROHAN",25000);
        Employee e2=new Employee(102,"SURAJ",26000);
        Employee e3=new Employee(103,"PRATIK",27000);

        //OBJECT ARRAY FOR EMPLOYEE CLASS
        Employee[] EmpArray;
        EmpArray=new Employee[3];
        EmpArray[0]=e1;
        EmpArray[1]=e2;
        EmpArray[2]=e3;

        for(int a=0;a<EmpArray.length;a++)
        {
            EmpArray[a].displayInfo();
        }


    }
}

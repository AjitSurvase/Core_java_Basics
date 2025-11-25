package objectArray;

public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary)
    {
      this.employeeId=employeeId;
      this.employeeName=employeeName;
      this.employeeSalary=employeeSalary;
    }
    void displayInfo() {
        System.out.println(employeeId + "\t" + employeeName + "\t" + employeeSalary);


    }
}

class employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	int yearOfExp;

//user defined constructor
employee(int id,String name,double salary,int exp)
{
  employeeId=id;
  employeeName=name;
  employeeSalary=salary;
  yearOfExp=exp;
}

employee(int id,String name,double salary)
{
	 employeeId=id;
	 employeeName=name;
	 employeeSalary=salary;

}


void display()
{
	System.out.println(employeeId+"\t"+employeeName+"\t"+employeeSalary+"\t"+yearOfExp);
}
}
class MainApp31
{
	public static void main(String[] args)
	{
      employee e1=new employee(101,"ajit",55555.55,5);
      e1.display();

      employee e2=new employee(102,"pratik",55555.25);
      e2.display();
	}
}



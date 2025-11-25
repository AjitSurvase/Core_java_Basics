class employee
{
	int employeeId;
	String employeeName;
	Double employeeSalary;
	int yearsOfExp;

//user defined constructor
employee(int id,String name, double salary,int exp)
{
	employeeId=id;
	employeeName=name;
	employeeSalary=salary;
    yearsOfExp=exp;
}
employee(int id,String name,double salary)
{
	employeeId=id;
	employeeName=name;
	employeeSalary=salary;
}

void display()
{
	System.out.println(employeeId+"\t"+employeeName+"\t"+employeeSalary+"\t"+yearsOfExp);

}
}

class MainApp3
{
	public static void main(String[] args)
	{
		employee e1=new employee(101,"ajit",55555.55,4);
		e1.display();

		employee e2=new employee(201,"pratik",55555.55);
		e2.display();
	}
}

//TOPIC NAME: reference variable example 

class employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;

	void acceptDetails(int id,String name,double salary)
	{
     employeeId=id;
     employeeName=name;
     employeeSalary=salary;
	} 


 void displayDetails()
 {
 	System.out.println("EMPLOYEE ID:"+employeeId);

 	System.out.println("EMPLOYEE NAME:"+employeeName);

 	System.out.println("EMPLOYEE SALARY:"+employeeSalary);
 }

}

class MainApp6
{
	public static void main(String[] args)
	{
		employee e1=new employee();
		e1.acceptDetails(101,"ajit",35000);            //referenced variable 
		e1.displayDetails();

		System.out.println("==============");

		employee e2=new employee();
		e2.acceptDetails(102,"sakshi",25000);
		e2.displayDetails();

       System.out.println(e1);                   // print address of e1
       System.out.println(e2);                   // print address of e2

	}
}
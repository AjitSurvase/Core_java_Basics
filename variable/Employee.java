class Employee
{
	public static void main(String[] args)
	{
		double BasicSalary=25000;
		double IncentiveSalary=5000;
		double TotalSalary=BasicSalary+IncentiveSalary;

		System.out.println("CurrentSalary:"+TotalSalary);

		double IncrementedAmount=BasicSalary+BasicSalary*0.1;

		Double UpdatedSalary=IncrementedAmount+BasicSalary;

		System.out.println("IncrementedAmount:"+UpdatedSalary);

	}
}
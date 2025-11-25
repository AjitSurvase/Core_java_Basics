import java.util.Scanner;
class BlockDemo41
{
    static Scanner sc1=new Scanner(System.in);
    static double accountBalance=2500.25;
    static int pin;

 static
 {
 	System.out.println("SELECT LANGUAGE");
 	System.out.println("1.ENGLISH \n 2.HINDI");
 	int choice=sc1.nextInt();

 	if(choice==1)
 	{
 		System.out.println("SELECT ENGLISH LANGUAGE");

 	}
 	else if(choice==2)
 	{
 		System.out.println("SELECT HINDI LANGUAGE");
 	}
 	else 
 	{
 		System.exit(0);                 
 	}
 }
static
{
	System.out.println("ENTER PIN");
	pin=sc1.nextInt();
} 

public static void main(String[] args)
{
	if(pin==1234)
	{ 
	 System.out.println("1.withdrow");
	 System.out.println("2.CheackBalance");
	 int choice=sc1.nextInt();

	 if(choice==1)
	 {
	 	System.out.println("ENTER AMOUNT");
	 	double amt=sc1.nextDouble();
	 	Withdrow(amt);
	 }
	 else if(choice==2)
	 {
	 	CheackBalance();
	 }
	 else 
	 {
	 	System.out.println("invalid CHOICE");
	 }
	}
	 else 
	 {
	 	System.out.println("INVALID PIN");
	 }

}

	


static void Withdrow(double amt)
{
	if(amt<=accountBalance)
	{
		accountBalance-=amt;
		System.out.println(amt+"RS DEBITED FROM ACCOUNT");

		CheackBalance();
	}
	else 
	{
		System.out.println("INSUFFICIENT BALANCE");
	}

}
static void CheackBalance()
{
	System.out.println("ACCOUNT BALANCE:"+accountBalance);
}

}

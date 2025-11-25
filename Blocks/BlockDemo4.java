import java.util.Scanner;

class BlockDemo4
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
		System.out.println("SELECTED ENGHLISH");
	}
	else if(choice==2)
	{
		System.out.println("SELECTED HINDI");
	}  
    else 
    {
    	System.exit(0);          //stop the execution.
    }
		
}

static 
{
	System.out.println("ENTER PIN NO");
	 pin=sc1.nextInt();

}

 
 public static void main(String[] args)
 {
 	if(pin==1234)
 	{
 		System.out.println("1.WITHDROW");
 		System.out.println("2.CHEAK BALANCE");
        int choice=sc1.nextInt();

        if(choice==1)
        {
        	System.out.println("ENTER AMOUNT");
        	double amt=sc1.nextDouble();
            Withdrow(amt);
        }
        else if(choice==2)
        {
             CheakBalance();
        }
        else 
        {
          System.out.println("INVALID CHOICE");
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
         CheakBalance();

 	}
 	else 
 	{
 		System.out.println("INSUFFICIENT BALANCE");
 	}
 }
 static void CheakBalance()
 {
 	System.out.println("ACCOUNT BALANECE "+accountBalance);
 }


}


 	
 
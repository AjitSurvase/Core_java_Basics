import java.util.Scanner;

class Ticket
{
	static int availableTicket=40;
	static double price=100.0;

 void bookTicket(int bookCount)
 {
  if(bookCount<=availableTicket)
  {
  	availableTicket=availableTicket-bookCount;
  	double total=bookCount*price;
  	System.out.println("TOTAL AMOUNT:"+total);
  	System.out.println(bookCount+"ticket have available");
  	showTicket();
  }
  else
  {
  	System.out.println("TICKET ARE NOT AVILABLE");

  }
 
}


void cancelTicket(int cancelCount)
{
	availableTicket=availableTicket+cancelCount;
	System.out.println(cancelCount+"TICKET HAVE BEEN CANCELLED");
	showTicket();

}
 void showTicket()
 {
 	System.out.println("AVILABLE TICKETS:"+availableTicket);

 }

}

class MainApp5 
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);

		Ticket t1=new Ticket();

		//display option

     System.out.println("1:book Ticket");
     System.out.println("2:cancel Ticket");
     System.out.println("3:view Ticket");

     int choice=sc1.nextInt();

     if(choice==1)
     {
     	System.out.println("PLESE ENTER NO OF BOOK TICKETS");
     	int Count=sc1.nextInt();
     	t1.bookTicket(Count);
     }
  else if(choice==2)
  {
  	System.out.println("PLESE ENTER NO OF CANCEL TICKETS");
  	int Count=sc1.nextInt();
  	t1.cancelTicket(Count);
  }
  else if(choice==3)
  {
  	t1.showTicket();

  }
  else
{
	System.out.println("INVALID CHOICE");
}


	}
}


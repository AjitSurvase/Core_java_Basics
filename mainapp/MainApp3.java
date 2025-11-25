 //step 1
import java.util.Scanner;

class Circle
{
	static double pi=3.14;

	static void display()
	{
		System.out.println("DISPLAY METHOD");
	}

 
   //AREA OF CIRCLE 
	void area(double rad)
	{
		double result=pi*rad*rad;                              // pi r square
		System.out.println("AREA :"+result);
	}

  //curcumference of circle
	void Circumference(double rad)
	{
		double result=2*pi*rad;                                  //2pir
        System.out.println("CIRCUMFERENCE:"+result);
	}



}

//mainclass or executable class 
class MainApp3
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);

		System.out.println("SELECT OPERATION TYPE");
		System.out.println("1: AREA OF CIRCLE");
		System.out.println("2:CIRCUMFERNCE OF CIRCLE");
		int choice=sc1.nextInt();

		System.out.println("ENTER RADIUS");
		double radius=sc1.nextDouble();

     
     if (choice==1)
     {
     	new Circle().area(radius);
     }
     else if(choice==2)
     {
     	new Circle().Circumference(radius);
     }
     else 
     {
     	System.out.println("INVALID CHOICE");
     }


	}
}





//step 1

import java.util.Scanner;

class Circle                                 //buisness logic or functional class
{
	static double  pi=3.14;

    static void display()
    {
    System.out.println("DISPLAY METHOD");

    }


  void area(double rad)
  {
  	double result=pi*rad*rad;
  	System.out.println("AREA:"+result);
  }


  void Circumference(double rad)
  {
  	double result=2*pi*rad;
  	System.out.println("Circumference:"+result);
  }

}
class MainApp33                                       //main class or executable
{
	public static void main(String[] args)
	{
       //step 2
    Scanner sc1=new Scanner(System.in);

    System.out.println("SELECT OPERATION");
    System.out.println("1.AREA");
    System.out.println("2.CIRCUMFERENCE");
    int choice=sc1.nextInt();

    System.out.println("ENTER RADIUS");
    double rad=sc1.nextDouble();


    if(choice==1)
    {
    	new Circle().area(rad);
    }
    else if(choice==2)
    {

    	new Circle().Circumference(rad);
    }
    else 
    {
    	System.out.println("INVALID CHOICE");

    }


	}
}
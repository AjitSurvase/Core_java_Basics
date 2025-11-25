//quation 2:

class demo2
{
	public static void main(String[] args)
	{
     SecondToMinute(500);
     MinuteToSecond(5);

	}

//external method
 static void SecondToMinute(double second)

 {
  double result=second/60;
  System.out.println("MINUTE:"+result);
 }

static void MinuteToSecond(double minute)
{
	double result=minute*60;
	System.out.println("SECOND:"+result);
}


}




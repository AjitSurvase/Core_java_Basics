class MethodDemo4
{
//internal method 
	public static void main(String[] args)
{

     areaOfCircle(9.9);      //arggument
     AreaOfCircle(9.9f);      //arggument
}

//external method

static void areaOfCircle(double rad) //pearametrized method
{
   double result=3.14*rad*rad;
	System.out.println("AREA OF CIRCLE:"+result);
}





//float
 



static void AreaOfCircle(float rad)
{
	float result=3.14f*rad*rad;
	System.out.println("AREA OF CIRCLE:"+result);
}



}

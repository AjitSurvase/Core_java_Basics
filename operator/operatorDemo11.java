//logical operato
class operatorDemo11
{
	public static void main(String[] args)
	{
	 int p=12;
	 int q=8;

    if((++p<12 || q++>8)&& p-->10)
    {
     p++;

    }
  else
  {
   q++;
  }
  

    System.out.println(" UPDATED VALUE OF P:"+p);  //13
    System.out.println(" UPDATED VALUE OF Q:"+q);  //10


	}
}
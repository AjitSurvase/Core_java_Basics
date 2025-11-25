class VariableDemo3
{
	public static void main(String[] args)
    {
     string s1="JAVA, s2="SQL",s3="MANUAL", s4="WT";
    
     System.out.println(s1+s2+s3+s4);
     
     s2=s4;
     s3=s1;
     s1=s3;
     s4=s2;

     System.out.println(s1+s2+s3+s4);
     
    }

}
class MethodDemo4
{
	public static void main(String[] args)
	{
     createaccount("ajit");

	}



//external method

static void createaccount(String name)
{
	System.out.println(name + " ACCOUNT CREATED SUCCESFULLY");
	UpdateProfile();
}

static void UpdateProfile()
{
	System.out.println("UPDATED SUCCESFULLY");
}
}
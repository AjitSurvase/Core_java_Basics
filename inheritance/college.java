package inheritance;
//subclass
public class college extends university{
    public college(String UniversityName,String CollegeName)
    {
        super(UniversityName);
        System.out.println("COLLEGE :"+CollegeName);
    }

}

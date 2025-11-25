package inheritance;
//subclass
public class department extends college {
    department(String UniversityName,String CollegeName,String DepartmentName)
    {
        super(UniversityName,CollegeName);
        System.out.println("DEPARTMENT:"+DepartmentName);
    }

}

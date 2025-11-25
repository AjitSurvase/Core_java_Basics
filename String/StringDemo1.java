package String;

public class StringDemo1 {
    public static void main(String[] args) {
        //constant pool area

        String s1="JAVA";
        String s2="SQL";
        String s3="JAVA";

        //new constant pool area

        String str1=new String("JAVA");
        String str2=new String("sql");
        String str3=new String("JAVA");

        System.out.println(s1==s2); //false
        System.out.println(s1==s3);//true
        System.out.println(str1==str3);//false
        System.out.println(s1==str1);//false
        System.out.println(s1.equals(str3));//true
        System.out.println(s2.equals(str2));//false
        System.out.println(s2.equalsIgnoreCase(str2));//true


    }

}

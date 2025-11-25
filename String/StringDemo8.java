package String;

import javax.jws.soap.SOAPBinding;

public class StringDemo8 {
    public static void main(String[] args) {
        String str1="JAVA";
        String str2=str1.replace('J','P');               //char to be replaced
        System.out.println(str2);


        String str3="JAVA PROGRAMING";
        String str4=str3.replace("JAVA","PYTHON");
        System.out.println(str4);

        String str5="SQL";
        String str6=str5.concat("PLSQL");
        System.out.println(str6);

    }
}

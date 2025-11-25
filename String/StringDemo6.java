package String;

import javax.jws.soap.SOAPBinding;

public class StringDemo6 {
    public static void main(String[] args) {
        String s="JAVA_SQL_MANUAL_J2EE_WT";
        System.out.println(s);

        String[] arr1=s.split("_");
        for(int a=0;a<arr1.length;a++)
        {
            System.out.println(arr1[a]);
        }
    }

}

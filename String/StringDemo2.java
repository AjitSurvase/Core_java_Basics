//write a program to proof that string object is immutable in nature;

package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="JAVA";
        System.out.println(s1==s2);
        s1=s1+"J2EE";
        System.out.println(s1==s2);
    }
}

package String;




public class StringDemo3 {
    public static void main(String[] args) {
        String s = "java developer";

        System.out.println(s.length());                   //14
        System.out.println(s.charAt(7));                   //v
        System.out.println(s.indexOf("a"));                //1
        System.out.println(s.lastIndexOf("a"));        //3
        System.out.println(s.contains("Dev"));            //false
        System.out.println(s.startsWith("jav"));          //true
        System.out.println(s.endsWith("per"));            //true
        System.out.println(s.substring(5));                //developer
        System.out.println(s.substring(0,4));             //java
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());



    }
}

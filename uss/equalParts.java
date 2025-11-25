package uss;

public class equalParts {


    //it is hardcode:
    public static void main(String[] args) {

        String s="ILoveAjit";


        int a=s.length()/3;

        System.out.println(a);

        String part1=s.substring(0,3);
        String part2=s.substring(3,6);
        String part3=s.substring(6,9);

        System.out.println("part1:"+part1);
        System.out.println("part2:"+part2);
        System.out.println("part3:"+part3);






    }
}

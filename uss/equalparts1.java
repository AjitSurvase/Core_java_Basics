package uss;

public class equalparts1 {

    public static void main(String[] args) {

        String s="ilovejava";

        int a=s.length()/3;

//        System.out.println(a);


        String part1=s.substring(0,a);
        String part2=s.substring(a,a*2);
        String part3=s.substring(a*2,a*3);


        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);

    }
}

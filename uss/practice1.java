package uss;

public class practice1 {

    public static void main(String[] args) {

        String s="Ajit";
//
//        StringBuilder sb=new StringBuilder(s);
//        System.out.println(sb.reverse());



       // second Apporch
        char[] data=s.toCharArray();

        for(int i=data.length-1;i>=0;i--)
        {
            System.out.print(data[i]);
        }

    }
}

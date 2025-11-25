package Shyna_Tech_Yarns;

public class revString {
    public static void main(String[] args) {


        String s="Ajit";

        //using tocharArray..

        char[] data=s.toCharArray();
        for(int i=data.length-1;i>=0;i--)
        {
            System.out.print(data[i]);
        }

        System.out.println(" ");

        //using Stringbuilder;

        StringBuilder sb=new StringBuilder(s);
        sb.reverse();

        System.out.println(sb);



    }
}

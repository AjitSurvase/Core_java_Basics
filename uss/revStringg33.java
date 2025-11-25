package uss;

public class revStringg33 {

    public static void main(String[] args) {

        String s="Ajit";

        System.out.println(s);

        char data[] =s.toCharArray();

        for(int i=data.length-1;i>=0;i--)
        {
           System.out.print(data[i]);
        }

    }
}

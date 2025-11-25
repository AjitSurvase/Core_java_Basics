package Shyna_Tech_Yarns;

public class frequency {

    public static void main(String[] args) {

        String num="999988876673334";

        int[]frq=new int[10];

        for(char c:num.toCharArray())    //for each loop.
        {
            frq[c - '0']++;
        }

        for(int i=0;i<10;i++)
        {
           if(frq[i]>0)
           {
               System.out.println(i + " : " + frq[i]);
           }
        }


    }
}

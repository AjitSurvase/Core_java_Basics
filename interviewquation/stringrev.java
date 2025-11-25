package interviewquation;

public class stringrev {

    public static void main(String[] args) {


        String s="Ajit";

        System.out.println(s);

        char[] data=s.toCharArray();

        for(int a=data.length-1;a>=0;a--)
        {
            System.out.print(data[a]);

        }
    }
}

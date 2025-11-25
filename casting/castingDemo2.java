package casting;

public class castingDemo2 {
    public static void main(String[] args) {
        char ch1='S';
        char ch2='J';

        //widning
        int x1=ch1;
        int x2=ch2;
        System.out.println(x1+"\t\t"+x2);     //83,74  (ASCII value)
        int x3=70;

        //narrowing
        char ch3=(char)x3;
        System.out.println(ch3);
    }
}

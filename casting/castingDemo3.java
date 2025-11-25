package casting;

public class castingDemo3 {
    public static void main(String[] args) {
        float f1=25.36f;
        int a1=(int)f1;                           //narrowing
        System.out.println(a1);                   //25

        short s1=25684;                       //because range is -320000 to 32000
        int a2=s1;
        System.out.println(a2);               //widning 25684

       short s2=(short)458963;              //narowing
        System.out.println(s2);              //211 : garbage value


    }
}

package casting;

public class castingDemo1 {
    public static void main(String[] args) {
        int a=25;                             //matching information
        double b=25.36;                       //matching information
        System.out.println(a+"\t\t"+b);

        int x=(int)56.37;                      //narrowing
        System.out.println(x);                  //56

        double y=30;                            //widning
        System.out.println(y);                   //30.0
    }
}

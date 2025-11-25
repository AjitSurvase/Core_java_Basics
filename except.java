public class except {


    public static void main(String[] args) {
        int a=2;

        int b=0;
        try {
            System.out.println(a / b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("division by zero is not valid");
        }
        finally{
            System.out.println("succsess");
        }
    }

}

package uss;

public class except1 {
    public static void main(String[] args) {
       int a[]={1,2,3,4};
        try{
            System.out.println(a[5]);
        }catch(ArithmeticException e)
        {
            System.out.println("it is not possible");
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException ");
        }
        finally
        {
            System.out.println("success");
        }
    }
}

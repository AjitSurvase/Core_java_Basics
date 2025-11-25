package casting;

public class mainApp4 {
    public static void main(String[] args) {
         Demo d1=new Demo();

         if(d1 instanceof sample ) {
             sample s1 = (sample) new Demo();
         }
         else{
             System.out.println("PROPERTIES NOT AVILABLE");
         }
    }
}

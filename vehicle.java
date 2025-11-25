 abstract  class vehicle {
     void start()
    {
        System.out.println();
    }

}
class car extends vehicle
{
    void start()
    {
        System.out.println("car start using key");
    }
}

 class bike extends vehicle
 {
     void start()
     {
         System.out.println("bike start using kick");
     }

     public static void main(String[] args) {
         car c=new car();
         c.start();

         bike b=new bike();
         b.start();
     }
 }
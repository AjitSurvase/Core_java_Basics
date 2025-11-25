package array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] data =new int[5];
        data[0]=10;
        data[1]=20;
        data[2]=30;
        data[3]=40;
        data[4]=50;

       //enhanced for loop
        for(int a:data)
        {
            System.out.println(a);
        }
        System.out.println("===========================");
      //normal for loop
      for(int a=0;a<5;a++)
      {
          System.out.println(data[a]);
      }
    }
}

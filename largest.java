import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size =sc1.nextInt();

        int arr[]=new int[size];


        for(int i=0;i<size;i++)
        {
            System.out.println("insert element");
            arr[i]=sc1.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element is:"+max);


    }
}

package uss;
import java.util.Scanner;
public class laregestnum {

        public static void main(String[] args)
        {
            Scanner sc1=new Scanner(System.in);

            System.out.println("length of array");
            int lenofarray=sc1.nextInt();


            int[] arr=new int[lenofarray];


            for (int i=0; i<lenofarray;i++)
            {
                arr[i]=sc1.nextInt();
            }
            int max=arr[0];
            for (int i=1; i<lenofarray;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            System.out.println(max);

        }
    }







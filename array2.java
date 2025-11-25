import java.util.Scanner;
import java.util.Arrays;
public class array2 {

        public static void main(String[] args){

            Scanner scan= new Scanner(System.in);
            System.out.println("enter the size of an array:");
            int size=scan.nextInt();
            int arr[]=new int[size];

            for(int i=0;i<=size-1;i++) {

                System.out.println("enter the array element:");

                arr[i]=scan.nextInt();

            }
            System.out.println(Arrays.toString(arr));

        }

    }

//[1,2,3,4,5]
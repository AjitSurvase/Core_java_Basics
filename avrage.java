import java.util.Scanner;
class averageprogram
{
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);

        System.out.println("enter the size of array");

        int size=sc1.nextInt();

        int[] array=new int[size];

        int sum=0;

        for(int i=0;i<size;i++)
        {

            System.out.println("array element");
            array[i]=sc1.nextInt();
            sum += array[i];


        }
        double avg =sum/array.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}

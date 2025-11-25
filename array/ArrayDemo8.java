package array;

public class ArrayDemo8 {
    public static void main(String[] args) {

        int [] arr1;
        arr1=new int[3];
        arr1[0]=100;
        arr1[1]=200;
        arr1[2]=300;

        printArray(arr1);                    //main to external

        int[] values=takeArray();            //external to main
        for(int a=0;a<values.length;a++)
        {
            System.out.println(values[a]);
        }
    }
    //print array using external method

    static void printArray(int[] data)
    {
        for(int a=0;a<data.length;a++)
        {
            System.out.println(data[a]);
        }
    }
    //create array using external method

    static int[] takeArray()
    {
        int[] arr1;
        arr1=new int[3];
        arr1[0]=400;
        arr1[1]=500;
        arr1[2]=600;
        return arr1;
    }
}

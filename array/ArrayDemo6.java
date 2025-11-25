package array;

public class ArrayDemo6 {
    public static void main(String[] args) {

        int [] arr1={50,100,150};

        int[] arr2={200,250,300};

        int[] result= new int[arr1.length];

        for(int a=0;a<arr1.length;a++)
        {
            result[a]=arr1[a]+arr2[a];
            System.out.println("RESULT IS:"+result[a]);
        }
    }
}

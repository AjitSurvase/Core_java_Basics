package array;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int [][] arr1;
        arr1=new int [2][2];
        arr1[0][0]=100;
        arr1[1][0]=200;
        arr1[0][1]=300;
        arr1[1][1]=400;

        //rows
        for(int a=0;a<arr1.length;a++)
        {
            //colums
            for(int b=0;b<arr1.length;b++)
            {
                System.out.print(arr1[a][b]+"\t");
            }
            System.out.println();
        }
    }
}

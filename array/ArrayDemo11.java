package array;

public class ArrayDemo11 {
    public static void main(String[] args) {
        String[][] arr1;                          //ARR1 IS A VARIBLE ONLY .
       arr1=new String[4][2];
      //  String[][] data=new String[4][2];

        arr1[0][0]="INDIA";
        arr1[0][1]="DELHI";
        arr1[1][0]="PAKISTN";
        arr1[1][1]="LAHORE";
        arr1[2][0]="ENGLAND";
        arr1[2][1]="LANDON";
        arr1[3][0]="RUSIA";
        arr1[3][1]="MASCO";

        //ROWS
        for (int a=0;a<arr1.length;a++)
        {
            //colums
            for(int b=0;b<arr1[a].length;b++)
            {
                System.out.print(arr1[a][b]+"\t\t");
            }
            System.out.println();
        }



    }
}

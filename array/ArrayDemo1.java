package array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //decleration
        char[] arr1;
        //size allocation
        arr1=new char[3];
        //initialization

        arr1[0]='A';
        arr1[1]='B';
        arr1[2]='C';


       /* System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]); */

        for(int a=0;a<3;a++)
        {
            System.out.println(arr1[a]);
        }

    }
}

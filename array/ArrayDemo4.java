package array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER NO OF SUBJECT");
        int count=sc1.nextInt();

        double[] marks=new double[count];
        System.out.println("ENTER MARKS OF RESPECTIVE SUBJECT");


        double sum=0;
        for(int a=0;a<count;a++) {
            marks[a] = sc1.nextDouble();
            sum = sum + marks[a];
        }

            double avg=sum/count;
            System.out.println("AVG VALUE:"+avg);


    }
}

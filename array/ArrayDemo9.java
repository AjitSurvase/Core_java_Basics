package array;

import java.util.Scanner;

public class ArrayDemo9 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER TOTAL NO OF BILLS");
        int count=sc1.nextInt();

        //create an array to store bill amounts

        double[] amounts=new double[count];
        System.out.println("ENTER BILL AMOUNTS");
        for(int a=0;a<count;a++)
        {
            amounts[a]=sc1.nextDouble();
        }
         totalAmtCalcultaion(amounts);       //just call the method



    }
    static double[] gstCalculation(double[] amounts)
    {
        //create an array to store gst amounts

        double[] gstAmounts=new double[amounts.length];
        for(int a=0;a<amounts.length;a++)
        {
            if(amounts[a]<=1000)
            {
                gstAmounts[a]=amounts[a]*0.5;
            }
            else
            {
                gstAmounts[a]=amounts[a]*0.1;
            }
        }
        return gstAmounts;
    }//end of gstcalculation()

    static void totalAmtCalcultaion(double[] amounts)
    {
        double[] gstAmounts=gstCalculation(amounts);

        //create an array to store total amounts

        double[] totalAmounts=new double[amounts.length];

        //sum of original bill and get bills

        for(int a=0;a<amounts.length;a++)
        {
            totalAmounts[a]=gstAmounts[a] + amounts[a];

        }
        double sumOfOriginalBill=0.0;
        double sumOfGstBill=0.0;
        double sumOfTotalAmounts=0.0;

        //summation of all array elements

        for(int a=0;a<amounts.length;a++)
        {
            sumOfOriginalBill+=amounts[a];
            sumOfGstBill+=gstAmounts[a];
            sumOfTotalAmounts+=totalAmounts[a];
        }

        //print all the details

        System.out.println("org.amt\t gst.amount\t total.amount");
        System.out.println("=================================");

        for(int a=0;a<amounts.length;a++)
        {
            System.out.println(amounts[a]+"\t\t"+gstAmounts[a]+"\t\t"+totalAmounts[a]);
        }
        System.out.println("=================================");
        System.out.println(sumOfOriginalBill+"\t\t"+sumOfGstBill+"\t\t"+sumOfTotalAmounts);
    }//end of calculation
}//end of class

package uss;
import java.util.ArrayList;
public class sumavgofele {
    public static void main(String[] args) {

        ArrayList<Integer> num= new ArrayList();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        int sum=0;

        for (int number : num) {
            sum += number;
        }

        int average = 0;
        if (!num.isEmpty()) {
            average =  sum / num.size();
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


    }
}

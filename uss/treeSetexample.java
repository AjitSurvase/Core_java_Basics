package uss;
import java.util.*;

public class treeSetexample {

    public static void main(String[] args) {
        TreeSet<Integer>t1=new TreeSet<Integer>();
        t1.add(79);
        t1.add(18);
        t1.add(20);
        t1.add(71);
        t1.add(52);
        t1.add(64);
        t1.add(45);

       for(int x:t1)
       {
            System.out.println(x);
        }

    }
}

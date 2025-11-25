package uss;
import java.util.*;

public class hashSetExample {
    public static void main(String[] args) {

        //creating hashset and adding elemnt
        //set is unorderd collection which does not allow duplicate
        HashSet<String>set =new HashSet<String>();
        set.add("ravi");
        set.add("vijay");
        set.add("ravi");
        set.add("ajay");
        set.add("ron");
        set.add("john");

        //traversing elemnt

        Iterator<String>itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

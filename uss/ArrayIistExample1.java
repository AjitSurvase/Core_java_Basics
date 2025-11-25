package uss;
import java.util.*;
public class ArrayIistExample1 {
    public static void main(String[] args) {

        ArrayList<String>name =new ArrayList<>();

        name.add("ajit");
        name.add("shivam");
        name.add("yash");
        name.add("ajit");
        name.add("shivam");

        System.out.println(" orginal list with duplicate:"+name);


        Set<String> uniqueNames = new LinkedHashSet<>(name);

        ArrayList<String> Duplicate = new ArrayList<>(uniqueNames);

        System.out.println("removing duplicates:" + Duplicate);
    }
}

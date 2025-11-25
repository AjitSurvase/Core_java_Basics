package uss;
import java.util.*;
public class Arraylist4 {
    public static void main(String[] args) {
        ArrayList<String>str=new ArrayList<>();

        if(str.isEmpty())
        {
            System.out.println("array list is empty");
        }
        else
        {
            System.out.println("array list is not emplty");
        }

        str.add("Ajit");

        if (str.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}

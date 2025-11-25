package uss;
import java.util.*;

public class hashmapexample1 {

    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<Integer,String>();
        map.put(100,"amit");
        map.put(103,"vijay");
        map.put(102,"rahul");

      //Elemnts can traverse in any order
        //for each loop  use in this
    for(Map.Entry m:map.entrySet())
    {
        System.out.println(m.getKey()+" "+m.getValue());
    }

    }
}

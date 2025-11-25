package uss;
import java.util.*;
public class hashmapexample {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put(1,"amit");
        map.put(5,"rahul");
        map.put(2,"jai");
        map.put(6,"amit");
        map.put(7,"david");

        Set set =map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){

            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}

package uss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class demo3 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>();
        list.add(456);
        list.add(896);
        list.add(258);
        list.add(123);
        list.add(111);

      //  Comparator<Integer> com=new comp();
      //  Collections.sort(list,com);

        for(int i:list)
        {
            System.out.println(i);
        }

    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(45);
        data.add(55);
        data.add(65);
        data.add(75);

        //option 4: iterator interface

        Iterator<Integer> itr= data.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //concurrent modification

          while (itr.hasNext()){
              if(itr.next()==55){
                  itr.remove();
              }
          }
        System.out.println(data);
    }
}
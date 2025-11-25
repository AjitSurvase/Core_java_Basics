import java.util.*;
public class vector_class {
    public static void main(String[] args) {

        Vector<String>v=new Vector<String>();
        v.add("ayush");
        v.add("amit");
        v.add("ashish");
        v.add("garima");
        v.add("ajit");

        Iterator<String>itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

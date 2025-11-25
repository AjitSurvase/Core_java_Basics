
import java.util.*;

public class Example {

    public static void main(String[] args) {
        List<String> List=new LinkedList<>();
        List.add("one");
        List.add("Two");

        List.add("OneThree");

        List.add("Three");
        List.add("One");

        List<String> list2 = new LinkedList<>();

        List.add("One");

        List.removeAll(list2);

        for (String item : List) System.out.print(item + " ");
    }
}
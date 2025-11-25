package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Character>data=new ArrayList<>();

        data.add('A');                    //0
        data.add('c');                    //2
        data.add('D');                    //3
        data.add(1,'B');     //1
        data.set(2,'E');
        data.add('H');
        data.add(3,'J');
        data.remove(4);

        System.out.println(data);


    }
}

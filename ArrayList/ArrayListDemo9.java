package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo9 {
    public static void main(String[] args) {

        product p1 = new product(1, "AC", 5500.25);
        product p2 = new product(2, "PROJECTOR", 5600.25);
        product p3 = new product(1, "MOBILE", 5700.25);

        ArrayList<product> data = new ArrayList<>();

        data.add(p1);
        data.add(p2);
        data.add(p3);

        //normal print
        System.out.println(data);

        //for each loop
        for (product p : data) {
            System.out.println(p);

        }
    }
    }


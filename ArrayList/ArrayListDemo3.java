package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> cources = new ArrayList<>();

        cources.add("JAVA");
        cources.add("SQL");
        cources.add("MANUAL");

        //OPTION 1
         System.out.println(cources);

        //option 2: for loop
        for (int a = 0; a < cources.size(); a++) {
            System.out.println(cources.get(a));
           }

         //option 3 " for each loop

        for(String s:cources)
        {
            System.out.println(s);
        }

    }
}
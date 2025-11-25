package uss;
import java.util.*;
import java.io.*;


public class simple {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(new student (101,"vijay",23));
        a1.add(new student (106,"ajay",27));
        a1.add(new student (105,"jai",21));

        System.out.println("sorting by name");
       // Collections.sort(a1.new nameComparator());
        Iterator itr=a1.iterator();
        while (itr.hasNext()){
            student str=(student)itr.next();
            System.out.println(str.rollno+""+ str.name+""+ str.age);
        }
        System.out.println("sorting by age");

      //  Collections.sort(a1.new ageComarator());
        Iterator itr2=a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}

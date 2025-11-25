package uss;

public class student implements Comparable<student> {
    int rollno;
    String name;
    int age;

    student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }


    public int compareTo(student st) {
   if(age==st.age)
       return 0;
   else if(age>st.age)
       return 1;
   else
       return -1;
    }


}
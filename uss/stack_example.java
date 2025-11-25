package uss;
import java.util.*;
public class stack_example {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<String>();

        stack.push("ayush");
        stack.push("garvit");
        stack.push("amit");
        stack.push("ashish");
        stack.push("garmia");


        stack.pop();
        stack.peek();

        Iterator<String>itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

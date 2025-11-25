package uss;
import java.util.*;
public class priorityqueueexample {
    public static void main(String[] args) {
        PriorityQueue<String> Queue=new PriorityQueue<String>();

        Queue.add("roy");
        Queue.add("tina");
        Queue.add("ron");
        Queue.add("divid");

        System.out.println("head:"+Queue.element());
        System.out.println("head:"+Queue.peek());
        System.out.println("itreating the queue element");

        Iterator itr=Queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        Queue.remove();
        Queue.poll();

        System.out.println("after removing two elemnet");

        Iterator<String> itr2=Queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());

        }
    }
}

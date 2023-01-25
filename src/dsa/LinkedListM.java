package dsa;

import static dsa.DSA.p;
import java.util.LinkedList;

public class LinkedListM {

    public static void main(String[] args) {
        
        //LinkedList can be treated as a Stack or a Queue
        
        LinkedList<String> linkedList = new LinkedList<>();
        
        //LinkedList as a Stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.pop();
        
        //LinkedList as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
//        linkedList.poll();

        linkedList.add(1, "DD");
        linkedList.remove(1);
        linkedList.addFirst("Fi");
        linkedList.addLast("L");
//        linkedList.removeFirst();
//        linkedList.removeLast();

        p(linkedList);
        p(linkedList.indexOf("C"));
        p(linkedList.peekFirst());
        p(linkedList.peekLast());
        

    }
}
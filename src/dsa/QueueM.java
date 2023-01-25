package dsa;

import static dsa.DSA.p;
import java.util.LinkedList;
import java.util.Queue;

public class QueueM {

    public static void main(String[] args) {
        
        Queue<String> que = new LinkedList();
        
        que.offer("Hi");
        que.offer("Bye");
        que.offer("Hello");
        
        p(que);
        
        p(que.poll());
        p(que.peek());
        p(que.isEmpty());
        p(que.contains("Hello"));

    }
    
}

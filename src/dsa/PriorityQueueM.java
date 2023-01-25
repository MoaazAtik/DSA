package dsa;

import static dsa.DSA.p;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueM {

    public static void main(String[] args) {

        //Ascending sorted queue
        Queue<String> qu = new PriorityQueue<>();

        //Descending sorted queue
//        Queue<String> qu = new PriorityQueue(Collections.reverseOrder());
        qu.offer("B");
        qu.offer("A");
        qu.offer("D");
        qu.offer("C");

        p(qu);

        while (!qu.isEmpty()) {
            p(qu.poll());
        }

    }
}

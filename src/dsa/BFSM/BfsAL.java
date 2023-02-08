package dsa.BFSM;

import static dsa.DSA.p;
import static dsa.DSA.p2;
import java.util.LinkedList;
import java.util.Queue;

//Breadth First Search for Adjacency List
public class BfsAL {
    
    LinkedList<Integer> alist[];
    
    public BfsAL(int size) {
        alist = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            alist[i] = new LinkedList<Integer>();
        }
    }
    
    //adds an Undirected edge (for Undirected graph)
    public void addUEdge(int s, int d) {
        //the conditions below are to avoid multiple adding of the same nodes
        if (!alist[s].contains(d)) {
            alist[s].add(d);
        }
        if (!alist[d].contains(s)) {
            alist[d].add(s);
        }
    }
    
    //adds a Directed edge (for Directed graph)
    public void addDEdge(int s, int d) {
        alist[s].add(d);
    }
    
    public void print() {
        for (int i = 0; i < alist.length; i++) {
            p2(i + " --> ");
            for (int j = 0; j < alist[i].size(); j++) {
                p2(alist[i].get(j) + " -> ");
            }
            p();
        }
    }
    
    
    //Iterative BFS
    public void bfsI(int s) {
        boolean visited[] = new boolean[alist.length];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(s);
        visited[s] = true;
        
        while (!queue.isEmpty()) {
            s = queue.poll();

            p2(s + " ");
            
            for (int i : alist[s]) {
                if (!visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        p();
    }
    
    //Recursive BFS
    public void bfsR(int s) {
        boolean visited[] = new boolean[alist.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        
        bfsrHelper(s, visited, queue);
        p();
    }
    public void bfsrHelper(int s, boolean visited[], Queue<Integer> queue) {
        if (visited[s]) return; //base case
        
        visited[s] = true;
        p2(s + " ");
        
        for (int i : alist[s]) {
            if (!visited[i]) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {
            s = queue.poll();
            bfsrHelper(s, visited, queue);
        }
    }
    
    
}

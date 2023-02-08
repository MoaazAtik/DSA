package dsa.BFSM;

import static dsa.DSA.p;
import static dsa.DSA.p2;
import java.util.LinkedList;
import java.util.Queue;

//Breadth First Search for Adjacency Matrix
public class BfsAM {
    
    int matrix[][];
    
    public BfsAM(int size) {
        matrix = new int[size][size];
    }
    
    //adds an Undirected edge (for Undirected graph)
    public void addUEdge(int s, int d) {
        matrix[s][d] = 1;
    }
    
    //adds a Directed edge (for Directed graph)
    public void addDEdge(int s, int d) {
        matrix[s][d] = 1;
        matrix[d][s] = 1;
    }
    
    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                p2(matrix[i][j] + "  ");
            }
            p();
        }
        p();
    }
    
    
    //Iterative BFS
    public void bfsI(int s) {
        boolean visited[] = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(s);
        visited[s] = true;
        
        while (!queue.isEmpty()) {
            
            s = queue.poll();
            p2(s + " ");

            for (int i = 0; i < matrix[s].length; i++) {
                if (matrix[s][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        p();
    }
    
    //Iterative BFS can also be written like this
    public void bfsI2(int s) {
        boolean visited[] = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(s);
        
        while (!queue.isEmpty()) {
            
            s = queue.poll();
            if (!visited[s]) {
                p2(s + " ");
                visited[s] = true;

                for (int i = 0; i < matrix[s].length; i++) {
                    if (matrix[s][i] == 1) {
                        queue.offer(i);
                    }
                }
            }
        }
        p();
    }
    
    
    //Recursive BFS
    public void bfsR(int s) {
        boolean visited[] = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        
        bfsRHelper(s, visited, queue);
        p();
    }
    public void bfsRHelper(int s, boolean visited[], Queue<Integer> queue) {
        if (visited[s]) return; //base case
        
        visited[s] = true;
        p2(s + " ");
        
        for (int i = 0; i < matrix[s].length; i++) {
            if (matrix[s][i] == 1 && !visited[i]) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {
            s = queue.poll();
            
            bfsRHelper(s, visited, queue);
        }
    }
    
}

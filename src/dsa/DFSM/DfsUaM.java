package dsa.DFSM;

import static dsa.DSA.p;
import static dsa.DSA.p2;
import java.util.Stack;

//Depth First Search for Undirected Adjacency Matrix
public class DfsUaM {

    boolean adj[][]; //2D Array
    
    public DfsUaM(int nodes) { //nodes: number of nodes
        adj = new boolean[nodes][nodes];
    }
    
    public void print() {
        for (boolean[] row : adj) {
            for (boolean columnElement : row) {
                p2(columnElement + " ");
            }
            p();
        }
    }
    
    public void addEdge(int u, int v) {
        adj[u][v] = true;
        adj[v][u] = true;
    }
    
    //Iterative DFS
    public void dfsI(int s) {
        boolean visited[] = new boolean[adj.length];
        Stack<Integer> stack = new Stack();
        
        stack.push(s);
        while (!stack.isEmpty()) {            
            int u = stack.pop();
            
            if (!visited[u]) {
                visited[u] = true;
                p2(u + " ");
            
                for (int i = 0; i < adj[u].length; i++) {
//                    if (adj[u][i] == true) {
                    if (adj[u][i] == true && !visited[i]) {   //this may be faster since it wouldn't add the visited nodes to the stack
                        stack.push(i);
                    }
                }
            }
        }
        p();
    }
    
    //Recursive DFS
    public void dfsR(int s) {
        boolean visited[] = new boolean[adj.length];
        
        dfsrHelper(s, visited);
    }
    
    public void dfsrHelper(int s, boolean visited[]) {
        
        if (visited[s]) return; //base case
        
        visited[s] = true;
        p2(s + " ");
        
        for (int i = 0; i < adj[s].length; i++) {
            if (adj[s][i] == true && !visited[i]) {
                dfsrHelper(i, visited);
            }
        }
        p();
    }
    
}

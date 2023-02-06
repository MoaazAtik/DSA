package dsa.DFSM;

import static dsa.DSA.p;
import static dsa.DSA.p2;
import java.util.LinkedList;
import java.util.Stack;

//Depth First Search for Directed Adjacency List
public class DfsDaL {
    
    LinkedList<Integer>[] adj; //Array of Linked Lists
    
    public DfsDaL(int nodes) { //nodes: number of nodes
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < nodes; v++) {
            adj[v] = new LinkedList<>();
        }
    }
    
    public void addEdge(int u, int v) {
        adj[u].add(v);
    }
    
    //Iterative DFS
    public void dfsI(int s) {                   //s is the source node we want to start traversing from
        boolean visited[] = new boolean[adj.length];     //to keep track of the visited nodes
        Stack<Integer> stack = new Stack();     //to keep track of the unvisited neighbor nodes*
        
        stack.push(s);
        while (! stack.isEmpty()) {
            int u = stack.pop();
            
            if (!visited[u]) {                //if u is not visited
                visited[u] = true;
                p2(u + " ");

                for (int v : adj[u]) {        //get the neighbors of u and iterate through them

                    if (!visited[v]) {        //↓
                        stack.push(v);    //push the unvisited neighbors of u to the stack
                    }
                }
            }
        }
        p();
    }
    
    
    //Mine
    //Recursive DFS
    public void dfsR(int s) {
        boolean visited[] = new boolean[adj.length];
        dfsrHelper(s, visited);
    }
    
    public void dfsrHelper(int s, boolean visited[]) {
        if (visited[s]) return;
        
        visited[s] = true;
        p2(s + " ");
        for (int i : adj[s]) {
//        for (int i = 0; i < adj[s].size(); i++) {
            if (!visited[i]) {
                dfsrHelper(i, visited);
            }
        }
        p();
    }
    
}

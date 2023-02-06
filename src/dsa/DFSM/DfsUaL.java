package dsa.DFSM;

import static dsa.DSA.p;
import java.util.LinkedList;
import java.util.Stack;
import static dsa.DSA.p2;

//Dinesh Varyani
//Depth First Search for Undirected Adjacency List
public class DfsUaL {

    LinkedList<Integer>[] adj; //Array of Linked Lists
    int V; //number of vertices
    int E; //number of edges
    //V and E aren't really necessary
    
    public DfsUaL(int nodes) { //nodes: number of nodes
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }
    
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }
    
    //Iterative DFS
    public void dfsI(int s) {                   //s is the source node we want to start traversing from
        boolean visited[] = new boolean[V];     //to keep track of the visited nodes
        Stack<Integer> stack = new Stack();     //to keep track of the unvisited neighbor nodes*
        
        stack.push(s);
        while (! stack.isEmpty()) {
            int u = stack.pop();
            
            if (!visited[u]) {               //if u is not visited
                visited[u] = true;
                p2(u + " ");

                for (int v : adj[u]) {       //get the neighbors of u and iterate through them

                    if (!visited[v]) {       //↓
                        stack.push(v);   //push the unvisited neighbors of u to the stack
                    }
                }
            }
        }
        p();
    }
    
    //Mine
    //recursive DFS
    public void dfsR(int s) {
        boolean visited[] = new boolean[adj.length];

        dfsrHelper(s, visited);
        
    }

    private void dfsrHelper(int s, boolean[] visited) {

        if (visited[s]) return; //base case
        
        visited[s] = true;
        p2(s + " ");
        
        for (int i : adj[s]){
            if (!visited[i]) {
                dfsrHelper(i, visited);
            }
        }
        
        p();
    }
    
}

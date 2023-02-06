package dsa.DFSAdjacencyMatrixM;

import static dsa.DSA.p;
import static dsa.DSA.p2;
import java.util.ArrayList;
import java.util.Stack;

public class GraphM {
    
    int[][] matrix;
    
    public GraphM(int size) {
        matrix = new int[size][size];
    }
    
    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }
    
    public boolean checkEdge(int src, int dst) {
        if(matrix[src][dst] == 1) return true;
        return false;
    }
    
    public void print() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                p2(matrix[row][column] + "  ");
            }
            p("");
        }
    }
    
    
    
    //The following lines aren't necessary for the matrix. They're written only to add headers (names) for the matrix by added nodes (names).
    ArrayList<NodeM> nodes;
    
    //this constructor-like method is to create a graph with headers
//    public GraphM(int size) {
    public void GraphMAnotherConstructor(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }
    
    public void addNode(NodeM node) {
        nodes.add(node);
    }
    
    public void printWithHeaders() {
        
        p2("   ");
        for (NodeM node : nodes) {
            p2(node.data + "  ");
        }
        p("");
        
        for (int row = 0; row < matrix.length; row++) {
            p2(nodes.get(row).data + "  ");
            for (int column = 0; column < matrix[row].length; column++) {
                p2(matrix[row][column] + "  ");
            }
            p("");
        }
        
    }
    
    
    //Bro's
    //Recursive Depth First Search (DFS) method
    public void depthFirstSearch(int src) {
        boolean visited[] = new boolean[matrix.length];
        
        dFSHelper(src, visited);
        
    }

    private void dFSHelper(int src, boolean[] visited) {
        
//        if (visited[src] == true) return; //base case 
        if (visited[src]) return; //base case 
        else {
            visited[src] = true;
            p2(nodes.get(src).data + " = visited ");
        }
        
        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
        return;
        
    }
    
    //Mine
    //Iterative Depth First Search (DFS) method
    public void dfsI(int src) {
        
        boolean visited[] = new boolean[matrix.length];
        Stack<Integer> stack = new Stack();
        stack.push(src);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            
            if (!visited[u]) {
                visited[u] = true;
                p2(String.valueOf(u) + nodes.get(u).data + " ");
                
                for (int i = 0; i < matrix[u].length; i++) {
//                    if (checkEdge(u, i) && !visited[i]) {     //This also does the same work
                    if (matrix[u][i] == 1) {
                        stack.push(i);
                    }
                }
            }
        }
        p();
        
    }
    
    
}

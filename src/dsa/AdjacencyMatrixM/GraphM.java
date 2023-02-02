package dsa.AdjacencyMatrixM;

import static dsa.DSA.p;
import static dsa.DSA.p2;
import java.util.ArrayList;

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
}

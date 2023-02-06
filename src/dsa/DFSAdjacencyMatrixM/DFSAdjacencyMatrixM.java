package dsa.DFSAdjacencyMatrixM;

import static dsa.DSA.p;

public class DFSAdjacencyMatrixM {
    

    public static void main(String[] args) {

        GraphM graph = new GraphM(5);
        
        //to add headers (names) for the matrix we added nodes (names), but it is not necessary for the matrix
        graph.GraphMAnotherConstructor(5);
        graph.addNode(new NodeM('A'));
        graph.addNode(new NodeM('B'));
        graph.addNode(new NodeM('C'));
        graph.addNode(new NodeM('D'));
        graph.addNode(new NodeM('E'));
        
        
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);
        
//        p(graph.checkEdge(0, 1));
//        graph.print();

        graph.printWithHeaders();

        graph.depthFirstSearch(0);
        graph.dfsI(0);

    }
    
}

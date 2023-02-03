package dsa.AdjacencyListM;

import static dsa.DSA.p;

public class AdjacencyListM {

    public static void main(String[] args) {

        GraphM graph = new GraphM();
        
        graph.addNode(new NodeM('a'));
        graph.addNode(new NodeM('b'));
        graph.addNode(new NodeM('c'));
        graph.addNode(new NodeM('d'));
        graph.addNode(new NodeM('e'));
        
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);
        
        p(graph.checkEdge(0, 1));
        p(graph.checkEdge(0, 2));
        graph.print();

    }
    
}

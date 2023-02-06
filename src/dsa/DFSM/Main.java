package dsa.DFSM;

//Dinesh Varyani
public class Main {

    public static void main(String[] args) {

        //Undirected Adjacency List
        DfsUaL graphul = new DfsUaL(5);
        
        graphul.addEdge(0, 1);
        graphul.addEdge(1, 2);
        graphul.addEdge(2, 3);
        graphul.addEdge(3, 0);
        graphul.addEdge(2, 4);

        graphul.dfsI(0);
        graphul.dfsR(0);

        //Directed Adjacency List
        DfsDaL graphdl = new DfsDaL(5);
        
        graphdl.addEdge(0, 1);
        graphdl.addEdge(1, 2);
        graphdl.addEdge(2, 3);
        graphdl.addEdge(3, 0);
        graphdl.addEdge(2, 4);

        graphdl.dfsI(0);
        graphdl.dfsR(0);
        
        //Undirected Adjacency Matrix
        DfsUaM graphum = new DfsUaM(5);
        
        graphum.addEdge(0, 1);
        graphum.addEdge(1, 2);
        graphum.addEdge(2, 3);
        graphum.addEdge(3, 0);
        graphum.addEdge(2, 4);
        
//        graphum.print();
        graphum.dfsI(0);
        graphum.dfsR(0);
        

        
        //Undirected Adjacency Matrix
        DfsDaM graphdm = new DfsDaM(5);
        
        graphdm.addEdge(0, 1);
        graphdm.addEdge(1, 2);
        graphdm.addEdge(2, 3);
        graphdm.addEdge(3, 0);
        graphdm.addEdge(2, 4);
        
        graphdm.dfsI(0);
        graphdm.dfsR(0);
        
//        graphdm.print();
    }
    
}

package dsa.BFSM;

public class Main {

    public static void main(String[] args) {

        //undirected graph
        BfsAM uGraphM = new BfsAM(5);
        
        //directed graph
        BfsAM dGraphM = new BfsAM(5);

        uGraphM.addUEdge(0, 1);
        uGraphM.addUEdge(1, 2);
        uGraphM.addUEdge(1, 4);
        uGraphM.addUEdge(2, 3);
        uGraphM.addUEdge(2, 4);
        uGraphM.addUEdge(4, 0);
        uGraphM.addUEdge(4, 2);
        
        dGraphM.addDEdge(0, 1);
        dGraphM.addDEdge(1, 2);
        dGraphM.addDEdge(1, 4);
        dGraphM.addDEdge(2, 3);
        dGraphM.addDEdge(2, 4);
        dGraphM.addDEdge(4, 0);
        dGraphM.addDEdge(4, 2);
        
//        uGraphM.print();
//        dGraphM.print();

//        uGraphM.bfsI2(0);
//        dGraphM.bfsI2(0);

//        uGraphM.bfsI(0);
//        dGraphM.bfsI(0);
//        uGraphM.bfsR(0);
//        dGraphM.bfsR(0);

        
        
        //undirected graph
        BfsAL uGraphL = new BfsAL(5);
        
        //directed graph
        BfsAL dGraphL = new BfsAL(5);

        uGraphL.addUEdge(0, 1);
        uGraphL.addUEdge(1, 2);
        uGraphL.addUEdge(1, 4);
        uGraphL.addUEdge(2, 3);
        uGraphL.addUEdge(2, 4);
        uGraphL.addUEdge(4, 0);
        uGraphL.addUEdge(4, 2);
        
        dGraphL.addDEdge(0, 1);
        dGraphL.addDEdge(1, 2);
        dGraphL.addDEdge(1, 4);
        dGraphL.addDEdge(2, 3);
        dGraphL.addDEdge(2, 4);
        dGraphL.addDEdge(4, 0);
        dGraphL.addDEdge(4, 2);
        
//        uGraphL.print();
//        dGraphL.print();

        uGraphL.bfsI(0);
        dGraphL.bfsI(0);
        uGraphL.bfsR(0);
        dGraphL.bfsR(0);


    }
    
}

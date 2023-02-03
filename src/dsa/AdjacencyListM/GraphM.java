package dsa.AdjacencyListM;

import java.util.ArrayList;
import java.util.LinkedList;
import static dsa.DSA.p;
import static dsa.DSA.p2;

public class GraphM {
    
    //Adjacency List using ArrayList:
    
    ArrayList<LinkedList<NodeM>> alist;
    
    public GraphM() {
        alist = new ArrayList<>();
    }
    
    public void addNode(NodeM node) {
        LinkedList<NodeM> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }
    
    public void addEdge(int src, int dst) {
        LinkedList<NodeM> currentList = alist.get(src);
        NodeM dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
        
        //or like this:
//        NodeM dstNode = alist.get(dst).get(0);
//        alist.get(src).add(dstNode);
    }
    
    public boolean checkEdge(int src, int dst) {
        LinkedList<NodeM> currentList = alist.get(src);
        NodeM dstNode = alist.get(dst).get(0);
        for (NodeM node : currentList) {
            if (dstNode == node) {
                return true;
            }
        }
        return false;
    }
    
    public void print() {
        for (LinkedList<NodeM> currentList : alist) {
            for (NodeM node : currentList) {
                p2(node.data + " -> ");
            }
            p();
        }
    }
    
    
    
    //Adjacency List using Array:
    
//    LinkedList<NodeM> array[];
//    int lastIndex = -1; //index of the last element in the array
//    int size = 5; //size of the array
//    
//    public GraphM() {
//        array = new LinkedList[size];
//    }
//    private void checkGrowArray() {
//        if (lastIndex == size) {
//            size = size * 3 / 2;
//            LinkedList<NodeM> newArray[] = new LinkedList[size];
//            for (int i = 0; i < array.length; i++) {
//                newArray[i] = array[i];
//            }
//            array = newArray;
//        }
//    }
//    public void addNode(NodeM node) {
//        lastIndex++;
//        checkGrowArray();
//        LinkedList<NodeM> currentList = new LinkedList<NodeM>();
//        currentList.add(node);
//        array[lastIndex] = currentList;
//    }
//    public void addEdge(int src, int dst) {
//        LinkedList<NodeM> currentList = array[src];
////        NodeM dstNode = array[dst].peek();
//        NodeM dstNode = array[dst].get(0);
//        currentList.add(dstNode);
//    }
//    public boolean checkEdge(int src, int dst) {
//        if (array[src] != null && array[dst] != null) {
//            LinkedList<NodeM> currentList = array[src];
//            NodeM dstNode = array[dst].peek();
//            for (NodeM node : currentList) {
//                if (dstNode == node) return true;
//            }
//        }
//        return false;
//    }
//    public void print() {
////        for (int i = 0; i < array.length; i++) { //this throws a null exception the array isn't full
//        for (int i = 0; i <= lastIndex; i++) {
//            for (int j = 0; j < array[i].size(); j++) {
//                p2(array[i].get(j).data + " -> ");
//            }
//            p();
//        }
//        
//        //this throws a null exception when the array isn't full
////        for (LinkedList<NodeM> currentList : array) {
////            for (NodeM node : currentList) {
////                p2(node.data + " -> ");
////            }
////            p();
////        }
//    }
    
    
}
package dsa.BinarySearchTreeM;

import static dsa.DSA.p;

public class Main {

    public static void main(String[] args) {

//this tree is fairly lap-sided (Unbalanced):
//         5
//1                 9
// 2            7
//  3         6   8
//   4

//it could be Balanced like this but it's a topic for AVL Trees
//                 5
//    2                      7
// 1     3              6        9
//          4                  8
//why the left-most child is not the smallest, and the right-most child is not the greater value?

//couldn'd it be balanced like this?
//a Balanced tree:
//                   5     
//          3                  7
//      2       4          6       8
//    1                              9  
        
        BinarySearchTreeM bstree = new BinarySearchTreeM();
    
        bstree.insert(new NodeM(5));
        bstree.insert(new NodeM(1));
        bstree.insert(new NodeM(9));
        bstree.insert(new NodeM(2));
        bstree.insert(new NodeM(7));
        bstree.insert(new NodeM(3));
        bstree.insert(new NodeM(6));
        bstree.insert(new NodeM(4));
        bstree.insert(new NodeM(8));
        
//        bstree.removeW(5);
//        bstree.remove(5);
        
        bstree.display();
        
        p(bstree.search(9));
        p(bstree.root.data);
        
        bstree.displayIn(bstree.root);
        p();
        bstree.displayPost(bstree.root);
        p();
        bstree.displayPre(bstree.root);

    }
    
}

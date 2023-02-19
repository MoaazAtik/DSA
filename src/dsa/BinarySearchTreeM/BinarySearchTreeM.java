package dsa.BinarySearchTreeM;

import static dsa.DSA.p;
import static dsa.DSA.p2;

public class BinarySearchTreeM {
    
    NodeM root;
    
    public void insert(NodeM newNode) {
        
//        root = insertHelper(root, newNode);
            //sets the winner of the battle as the root of the tree when the tree is empty. Otherwise it actually does nothing.
            root = duel(root, newNode);
    }
    
    //using recursion. Makes a duel (compares) between two nodes and sets the winner as parent and the loser as child.
//    private void insertHelper(NodeM root, NodeM node) {
    private NodeM duel(NodeM node, NodeM newNode) {
        
        if (node == null) { //base case.
            return newNode; //sets the newNode as a leaf node.
            //or:
//            node = newNode;
//            return node;
        }
        
        if (newNode.data < node.data) {
            node.left = duel(node.left, newNode);
        } else { //node.data < newNode.data
            node.right = duel(node.right, newNode);
        }
        
        return node;
    }
    
    
    public void display() {
        displayHelper(root);
    }
    
    private void displayHelper(NodeM node) {
        
        if (node != null) { //base case
            displayHelper(node.left);
            p2(node.data + " ");
            displayHelper(node.right);
            p2("^");
        }
    }
    
    
    public boolean search(int myNumber) {
        return searchDuel(root, myNumber);
    }
    
    private boolean searchDuel(NodeM node, int myNumber) {
                
        if (node == null) return false; //base case
        
//        if (node.data == myNumber) {
        else if (node.data == myNumber) {
            return true;
        } else if (myNumber < node.data) {
            return searchDuel(node.left, myNumber);
        } else { //node.data < myNumber
            return searchDuel(node.right, myNumber);
        }
        
    }
    
    
    //WilliamFiset - YT
    public void removeW(int elem) {
//        root = removeHelper(root, myNumber); //is it necessary?
        removeHelperW(root, elem);
    }
    private NodeM removeHelperW(NodeM node, int elem) {
        
        if (node == null) return null; //base case
        
        //find the element
        if (elem < node.data) {
            node.left = removeHelper(node.left, elem);
        } else if (node.data < elem) {
            node.right = removeHelper(node.right, elem);
            
        } else { //found the element
            //the actual removal of the element
            
            //the node has only a right subtree or no subtree at all.
            if (node.left == null) {
                return node.right;
            }
            //the node has only a left subtree or no subtree at all.
            else if (node.right == null) {
                return node.left;
            }
            //the node has two subtrees
            else {
                // Find the leftmost node in the right subtree
                NodeM tmp = findMin(node.right);
                
                //copy its value
                node.data = tmp.data;
                
                // Go into the right subtree and remove the leftmost node we
                // found and swapped data with. This prevents us from having
                // two nodes in our tree with the same value.
                node.right = removeHelper(node.right, tmp.data);
            }
        }
        
        return node;
    }
    private NodeM findMin(NodeM node) {
        while (node.left != null) {            
            node = node.left;
        }
        return node;
        
        //or:
//        NodeM cur = node;
//        while (cur.left != null) {            
//            cur = cur.left;
//        }
//        return cur;

        // When removing a node from a binary tree with two links the
        // successor of the node being removed can either be the largest
        // value in the left subtree or the smallest value in the right
        // subtree. In this implementation I have decided to find the
        // smallest value in the right subtree which can be found by
        // traversing as far left as possible in the right subtree.
    }
    
    
    //the remove() method of WilliamFiset is more convenient than the Bro's one
    //~Bro's
    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
        }
        else {
            p(data + " could not be found");
        }
    }
    
    private NodeM removeHelper(NodeM root, int data) {
        
        if (root == null) {
            return root; //which is null
        }
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else { //Node found
            if (root.left == null && root.right == null) {
                root = null;
            }
            else if (root.right != null) { //find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else { //find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    
    //find the least value below the right child of this root node
    private int successor (NodeM root) {
        root = root.right;
        while (root.left != null) {            
            root = root.left;
        }
        return root.data;
    }
    
    //find the gratest value below the left child of this root node
    private int predecessor (NodeM root) {
        root = root.left;
        while (root.right != null) {            
            root = root.right;
        }
        return root.data;
    }
    
    
    //In-order Traversal
    public void displayIn(NodeM root) {
        if (root == null) return;
        displayIn(root.left);
        p2(root.data + " ");
        displayIn(root.right);
    }
    //Post-order Traversal
    public void displayPost(NodeM root) {
        if (root == null) return;
        displayPost(root.left);
        displayPost(root.right);
        p2(root.data + " ");
    }
    //Pre-order Traversal
    public void displayPre(NodeM root) {
        if (root == null) return;
        p2(root.data + " ");
        displayPre(root.left);
        displayPre(root.right);
    }
}

package dsa;

import java.util.Stack;
import static dsa.DSA.p;

public class StackM {
    
    public static void main(String[] args){
        
        
        Stack<Integer> stack = new Stack<Integer>();

            stack.push(11);
            stack.push(22);

            stack.add(33);

            int pop = stack.pop();

            int peek = stack.peek();

            boolean empty = stack.empty();

            int search = stack.search(66);
            int search2 = stack.search(11);

            int capacity = stack.capacity();

            
            p(stack);
            p(pop);
            p(peek);
            p(empty);
            p(search);        
            p(search2);
            p(capacity);
        
    }
}

package dynamicArray;

import static dsa.DSA.p;

public class DynamicArrayM {

    public static void main(String[] args) {

        MyDynamicArray arr = new MyDynamicArray();
        
        
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(7);

//how would I remove an integer by defining it and not by its index?
//        arr.remove(6);
//        arr.remove(5);
//        arr.remove(4);
//        arr.remove((Integer)6);
//        arr.remove((Integer)5);
//        arr.remove((Integer)4);
//        arr.remove(Integer.toString(5));
//        arr.remove(Integer.toString(4));
//        arr.remove(String.valueOf(6));
//        arr.remove(String.valueOf(5));
//        arr.remove(String.valueOf(4));
//        arr.remove(Integer.parseInt("6"));
//        arr.remove(Integer.parseInt("5"));
//        arr.remove(Integer.parseInt("4"));
//        p(arr.sizeM());

        
        //adding some strings (not integers)
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        arr.add("6");
        arr.add("7");
        
//        arr.remove(6);
//        arr.remove(5);
//        arr.remove(4);
//        arr.remove("6");
//        arr.remove("5");
//        arr.remove("4");
//        arr.remove("3");
//        arr.remove("2");
        
        
        p(arr.sizeM());
        

    }//main()

    
    
    public static class MyDynamicArray {
    
        
        final int DEFAULT_CAPACITY = 3;
        int capacity = DEFAULT_CAPACITY;
        Object array[];
        
        
        //constructors
        public MyDynamicArray() {    
            array = new Object[capacity];
        }
        
        public MyDynamicArray(int capacity){
            this.capacity = capacity;
            array = new Object[capacity];
        }
        
        
        //Methods
        //adds an element to the end
        public void add(Object o) {
            //if the array reaches its maximum capacity, grow the array then add the element
            if (array[capacity - 1] != null) {
                
                grow();
            }
            
            //adding the element
            for (int i = 0; i < array.length; i++) {
                if(array[i] == null) {
                    array[i] = o;
                    return;
                }
            }
            
        }//enhance the method by avoiding double checking for null value
        
        //adds an element to a specified position
        public void add(Object o, int index) {
            
        }
        
        //removes the element by its index
        public void remove(int index) {
            //removing the element
            int i = index;
            while(i < array.length - 1) {
                array[i] = array[i + 1];
                i++;
            }
            array[i] = null;
            
            //shrinking the array if it reaches to its half size
            for (int j = array.length - 1; array[j] == null; j--) {
                if (j <= capacity * 2 / 3) {
                    shrink();
                }
            }
        }
        
        //removes the first occurence of an element
        public void remove(Object o) {
            //removing the element
            for (int i = 0; i < array.length; i++) {
                if (array[i] == o) {
                    
                    //this will remove the element and check if the array could be shrinked
                    remove(i);
                }
            }
        }

        //increases the capacity of the array
        public void grow() {
            //creating a new array with the increased capacity
            capacity = capacity * 3 / 2;
            Object newArray[] = new Object[capacity];
            
            //copiying the old array elements to the the new one
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            
            array = newArray;
        }
        
        //shrinks the capacity of the array
        public void shrink() {
            //creating a new array with the decreased capacity
            capacity = capacity * 2 / 3;
            Object newArray[] = new Object[capacity];
            
            //copiying the elements from the old array to the new one
            for (int i = 0; i < capacity; i++) {
                newArray[i] = array[i];
            }
            
            array = newArray;
        }
        
        //returns the current size/length/capacity of the array
        public int sizeM() {
            return array.length;
        }
        
        
        
    }//MyDynamicArray

}
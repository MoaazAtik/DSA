package dsa;

import static dsa.DSA.p;

public class DynamicArrayM {

    public static void main(String[] args) {

        //testing my dynamic array
//        MyDynamicArray arr = new MyDynamicArray();
//        
//        //adding some strings (not integers)
//        arr.add("1");
//        arr.add("2");
//        arr.add("3");
//        arr.add("4");
////        arr.add("5");
////        arr.add("6");
////        arr.add("7");
//        
////        arr.remove(6);
////        arr.remove(5);
////        arr.remove(4);
////        arr.remove("6");
////        arr.remove("5");
////        arr.remove("4");
////        arr.remove("3");
////        arr.remove("2");
//        
//        p(arr.sizeM());
//        p(arr.printArray());
//        
////how would I remove an integer by defining it and not by its index?
////        arr.add(1);
////        arr.add(2);
////        arr.add(3);
////        arr.add(4);
////        arr.add(5);
////        arr.add(6);
////        arr.add(7);
//
////        arr.remove(6);
////        arr.remove(5);
////        arr.remove(4);
////        arr.remove((Integer)6);
////        arr.remove((Integer)5);
////        arr.remove((Integer)4);
////        arr.remove(Integer.toString(5));
////        arr.remove(Integer.toString(4));
////        arr.remove(String.valueOf(6));
////        arr.remove(String.valueOf(5));
////        arr.remove(String.valueOf(4));
////        arr.remove(Integer.parseInt("6"));
////        arr.remove(Integer.parseInt("5"));
////        arr.remove(Integer.parseInt("4"));
////        p(arr.sizeM());


        //testing Bro's dynamic array
        BDynamicArray dynamicArray = new BDynamicArray();
		
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        
        p(dynamicArray.get(0));
        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        p(dynamicArray.search("C"));

        //to call the our toString() we can just write the name of the object instead of calling it explicitly
        p(dynamicArray);
        p("size**: " + dynamicArray.size);
        p("capacity: " + dynamicArray.capacity);
        p("empty: " + dynamicArray.isEmpty());


    }//main()

    //Bro's: get(i) add(o) insert(i,o) delete(o) search(o)* grow shrink toString (variable)size** isEmpty*
    //Mine:  get(i) add(o) add(o,i) remove(o) remove(i)* grow shrink printArray sizeM/capacity*
        
    //My dynamic array
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
            //growing the array if it is at its maximum capacity
            if (array[capacity - 1] != null) {
                grow();
                
                array[capacity * 2 / 3] = o;
                return;
            }
            
            //adding the element
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = o;
                    return;
                }
            }
            
        }
        
        //adds an element to a specified position
        public void add(Object o, int index) {
            //growing the array if it is at its maximum capacity
            if (array[capacity - 1] != null) {
                grow();
                
                array[capacity * 2 / 3] = o;
                return;
            }
            
            //shifting the elements after the index towards the end of the array
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            //adding the element to the specified index
            array[index] = o;
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
        
        //returns an element of the array at a specified index
        public Object get(int index) {
            return array[index];
        }
        
        //returns the array
        public String printArray() {
            String printedArray = "[";
            for (int i = 0; i < capacity - 1; i++) {
                printedArray += array[i] + ", ";
            }
            printedArray += array[capacity - 1] + "]";
            return printedArray;
        }
        
        
        
    }//MyDynamicArray

    
    //Bro Code's dynamic array
    public static class BDynamicArray {
        
        int size;
        int capacity = 10;
        Object[] array;
        
        
        public BDynamicArray() {
            this.array = new Object[capacity];
        }
        
        public BDynamicArray(int capacity) {
            this.capacity = capacity;
            this.array = new Object[capacity];
        }
        
        
        public Object get(int index) {
            return array[index];
        }
        public void add(Object data) {
            if (size >= capacity) {
                grow();
            }
            array[size] = data;
            size++;
        }
        public void insert(int index, Object data) {
            if (size >= capacity) {
                grow();
            }
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = data;
            size++;
        }
        public void delete(Object data) {
            for (int i = 0; i < size; i++) {
                if (array[i] == data) {
                    for (int j = 0; j < (size - i - 1); j++) {
                        array[i + j] = array[i + j + 1];
                    }
                    array[size - 1] = null;
                    size--;
                    if (size <= (int) capacity / 3) {
                        shrink();
                    }
                    break;
                }
            }
        }
        public int search(Object data) {
            for (int i = 0; i < size; i++) {
                if (array[i] == data) {
                    return i;
                }
            }
            return -1;
        }
        public void grow() {
            int newCapacity = (int) (capacity * 2);
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }
        public void shrink() {
            int newCapacity = (int) (capacity / 2);
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public String toString() {
            String string = "";
            for (int i = 0; i < capacity; i++) {
                string += array[i] + ", ";
            }
            if (string != "") {
                string = "[" + string.substring(0, string.length() - 2) + "]";
            } else {
                string = "[]";
            }
            return string;
        }
        
        
        
    }//DynamicArrayB
    
}
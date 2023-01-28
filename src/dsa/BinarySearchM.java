package dsa;

import static dsa.DSA.p;
import java.util.Arrays;

//finding an element whitin a Sorted array
public class BinarySearchM {

    public static void main(String[] args) {

        //if the provided array is not sorted you can call the pre-built java.util.Arrays.sort method (as Quick Sort algorithm)
        
        int array[] = new int[10];
//        int target = 8;
//        int target = 0;
//        int target = 9;
//        int target = 12;
        int target = -2;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        //using the pre-built binary search method that is imported from java.util.Arrays
//        int index = Arrays.binarySearch(array, target);

        //using my method
//        int index = myBinarySearch(array, target);
        
        //using Bro's method
        int index = bBinarySearch(array, target);
        
        p(index);
    }

    //My code
    private static int myBinarySearch(int[] array, int target) {
        
        int firstIndex = 0;
        int middleIndex = (array.length / 2);
        int lastIndex = array.length - 1;
                          
        if (target > array[lastIndex] || target < array[firstIndex]) {
            return -1;
        }
        
        while (middleIndex <= lastIndex) {
            
            if (array[middleIndex] == target) {
                return middleIndex;
            } else if (array[middleIndex] < target) {
                firstIndex = middleIndex;
                middleIndex =  ((lastIndex - firstIndex + 1) / 2) + firstIndex;
                //added 1 above because if the target was the last element in the array I would enter an endless loop 
                //because the middleIndex would always be (lastIndex-1)+0.5 and as and integer the 0.5 would be omited.
            } else { //target < array[middleIndex]
                lastIndex = middleIndex;
                middleIndex = ((lastIndex - firstIndex) / 2) + firstIndex;
            }
            
        }

        return -1;
    }
    
    //Bro Code's
    public static int bBinarySearch(int[] array, int target) {
        
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {            
            int middle = low + (high - low) / 2;
            int value = array[middle];
            
            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; //target found
        }
        
        return -1; //target not found
    }
}

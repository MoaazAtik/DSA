package dsa;

import static dsa.DSA.p;

public class LinearSearchM {

    public static void main(String[] args) {

        int array[] = {2, 5, 1, 3, 6, 9, 7};

        int index = myLinearSearch(array, 10);
        
        p(index);
    }

    //returns the index of a value by making Linear Search
    private static int myLinearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
}

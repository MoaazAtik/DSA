package dsa;

import static dsa.DSA.p;

public class InterpolationSearchM {

    public static void main(String[] args) {

//        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int array[] = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        
        int index = bInterpolationSearch(array, 4);
        
        p(index);
    }

    
    public static int bInterpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (value >= array[low] && value <= array[high] && low <= high) {            
            
            int probe = low + (high - low) * (value - array[low]) /
                                            (array[high] - array[low]);
            
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
    
}

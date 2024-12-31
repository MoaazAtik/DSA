package dsa;

import static dsa.DSA.p;

public class MergeSortM {

    public static void main(String[] args) {

        int array[] = {8, 2, 5, 3, 4, 7, 6, 1};
        
//        bMergeSort(array);
        myMergeSort(array);

        for (int i = 0; i < array.length; i++) {
            p(array[i]);
        }
    }
    
    
    public static void bMergeSort(int array[]) {
        
        int length = array.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        
        int i = 0; //left array
        int j = 0; //right array
        for ( ; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        
        bMergeSort(leftArray);
        bMergeSort(rightArray);
        bMerge(leftArray, rightArray, array);
    }
    
    public static void bMerge(int leftArray[], int rightArray[], int array[]) {
        
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;
        
        while (l < leftSize && r < rightSize) {            
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        
        while (l < leftSize) {            
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {            
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }


    private static void myMergeSort(int[] array) {
        // Divide
        if (array.length <= 1) return; // Base case

        int middleIndex = array.length / 2;
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[array.length - middleIndex];

        int i = 0;
        for (int l = 0; l < leftArray.length; l++) {
            leftArray[l] = array[i];
            i++;
        }
        for (int r = 0; r < rightArray.length; r++) {
            rightArray[r] = array[i];
            i++;
        }

        myMergeSort(leftArray);
        myMergeSort(rightArray);

        helper(array, leftArray, rightArray);
    }

    private static void helper(int[] array, int[] leftArray, int[] rightArray) {
        // Sort and Merge
        int i = 0, l = 0, r = 0;
        while (l < leftArray.length && r < rightArray.length) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        while (l < leftArray.length) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while (r < rightArray.length) {
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }
}

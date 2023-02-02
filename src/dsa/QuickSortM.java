package dsa;

import static dsa.DSA.p;

public class QuickSortM {

    public static void main(String[] args) {

        int array[] = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        
//        bQuickSort(array, 0, array.length - 1);
        myQuickSort(array, 0, array.length - 1);
        
        for (int i : array) {
            p(i);
        }

    }

    
    //Bro's
    private static void bQuickSort(int[] array, int start, int end) {
        
        if (end <= start) return; //base case
        
        int pivot = bPartition(array, start, end);

        bQuickSort(array, start, pivot - 1);
        bQuickSort(array, pivot + 1, end);
        
    }
    //Bro's
    public static int bPartition(int[] array, int start, int end) {
        
        int pivot = array[end];
        int i = start - 1;
        
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        
        return i;
    }
    
    //Mine
    public static void myQuickSort(int[] array, int start, int end) {
        
        if (start >= end) return; //base case
        
        int pivot = end;
        int j = start;
        int i = j - 1;
        int temp;
        
        while (j < pivot) {            
            if (array[j] < array[pivot]) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            j++;
        }
        i++;
        temp = array[j]; // = array[pivot] (because j = pivot)
        array[j] = array[i];
        array[i] = temp;
        
        //i represents the current pivot location
        myQuickSort(array, start, i - 1);
        myQuickSort(array, i + 1, end);
        
        //the previous recursive calling of the method can also be done like so:
//        pivot = i;
//        myQuickSort(array, start, pivot - 1);
//        myQuickSort(array, pivot + 1, end);
    }
    
}

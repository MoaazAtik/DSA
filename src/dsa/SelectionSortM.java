package dsa;

import static dsa.DSA.p;

public class SelectionSortM {

    public static void main(String[] args) {

        int array[] = {9, 3, 2, 4, 6, 7, 1, 8, 5};

        basicSelectionSort(array);
//        mySelectionSort(array);
//        bSelectionSort(array);
        
        for (int i : array) {
            p(i);
        }

    }


    public static void basicSelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {     // array.length "- 1" (Optimization)
            int minIndex = i;                            // "maxIndex" for Descending
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {        // ">" for Descending
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    
    //Mine
    public static void mySelectionSort(int array[]) {
        //9 1 7 6 5 4 3 2 1
        for (int i = 0; i < array.length - 1; i++) {
            //minimum value
            int min = array[i];
            int indexOfMin = i;
            for (int j = 1 + i; j < array.length; j++) {
                //tracking the min value during an iteration
                if (array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[indexOfMin] = temp;
        }
        
    }
    
    //Bro Code's
    public static void bSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //minimum index
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;            
        }
    }
    
}

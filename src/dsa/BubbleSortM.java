package dsa;

import static dsa.DSA.p;

public class BubbleSortM {

    public static void main(String[] args) {

        int array[] = {9, 3, 2, 4, 6, 7, 1, 8, 5};

//        myBubbleSort(array);
        bBubbleSort(array);
        for (int i : array) {
            p(i);
        }
    }

    
    //My method
    public static void myBubbleSort(int array[]) {
        
        int temp;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    //to sort in descending order
//                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
    
    //Bro Code's method
    public static void bBubbleSort(int array[]) {
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array [j + 1]) {
//                if (array[j] < array [j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
}

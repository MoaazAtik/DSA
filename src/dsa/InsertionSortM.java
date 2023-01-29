package dsa;

import static dsa.DSA.p;

public class InsertionSortM {

    public static void main(String[] args) {

        int array[] = {9, 3, 2, 4, 6, 7, 1, 8, 5};
        
//        myInsertionSort(array);
        bInsertionSort(array);

        for (int i : array) {
            p(i);
        }

    }
    
    
    public static void myInsertionSort(int array[]) {
        
        for (int i = 1; i < array.length; i++) {
//0 1 2 3 4 5 6 7 8
//9   2 4 6 7 1 8 5
//  3    
//temp 
            int temp = array[i];
            
            int j = i - 1;
            while (j >= 0) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
                j--;
            }
            array[j + 1] = temp;
        }
        //**instead of while (j >= 0) and }else{ I could write "while (j >= 0 && array[j] > temp)",
        //but not "while (array[j] > temp && j >= 0)" because otherwise it would throw an OutOfBoundsException aka. array[-1]
    }
    
    
    //Bro's
    public static void bInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    
}

package dsa;

import static dsa.DSA.p;

public class RecursionM {

    public static void main(String[] args) {

//        walkR(4);
//        walkI(4);
//        p(factorialR(5));
//        p(factorialI(5));
//        p(powerI(2, 3));
        p(powerR(2, 3));

    }
    
    
    //recursion
    public static void walkR(int steps) {
        
        if (steps < 1) { //Base case
            return;
        }
        p("You took a step " + steps);
        walkR(steps - 1); //Recursive case
        
    }
    
    //iteration
    public static void walkI(int steps) {
        for (int i = 0; i < steps; i++) {
            p("You took a step " + i);
        }
    }
    
    //recursion
    public static int factorialR(int number) {
        
        if (number == 1) { //the Base case
            return number;
        }
        
        return number * factorialR(number - 1); //the Recursive case
    }
    
    //iteration
    public static int factorialI(int number) {
        for (int i = number - 1; i > 1; i--) {
            number = number * i;
        }
        return number;
    }
    
    //recurtsion
    public static int powerR(int base, int exponent) {
    
        if (exponent == 1) { //base case
            return base;
        }
        
        return base * powerR(base, exponent - 1); //recursive case
    }
    
    //iteration
    public static int powerI(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }
    
}

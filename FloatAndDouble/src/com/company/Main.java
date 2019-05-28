package com.company;

public class Main {

    public static void main(String[] args) {
        // floating numbers: numbers with decimal points
        int myIntValue = 5 / 2; //outputs 2
        float myFloatValue = 5f / 2f;    //can hold 7 decimal digits (after decimal points). If missing 'f', by
        // default decimal numbers are recognized as doubles. So doubles are recommended to use.
        double myDoubleValue = 5d / 2d;    //can hold 16 decimal digits (after decimal points) so more precise.
        // Double the memory of int and float but faster on modern computers.
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);   //outputs 2.5
        System.out.println("myDoubleValue = " + myDoubleValue); //outputs 2.5

        //Convert a given number of pounds to kilograms
        //1. Create a variable to store the number of pounds
        double myWeightPounds = 100d;
        //2. Calculate the number of Kilograms for the number above and store in a variable.
        double myWeightKilo = myWeightPounds * 0.45359237d;
        //3. Print out the result.
        System.out.println("Kilograms = " + myWeightKilo);
        //Notes 1 pound is equal to 0.45359237 kilograms.
    }
}

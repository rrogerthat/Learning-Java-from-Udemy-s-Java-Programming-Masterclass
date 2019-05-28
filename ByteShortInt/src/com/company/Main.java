package com.company;

public class Main {

    public static void main(String[] args) {
        //Different data types:

        //int has width of 32
        int myMinValue = -2_147_483_648;    //use underscore to make integer easier to read
        int myMaxValue = 214748364;     //ctrl + D to duplicate line, ctrl + Y to delete line
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        //byte has width of 8
        byte myByteValue = 127;  //takes up less space than 'int' (from -128 to 127)
//        byte myNewByteValue = (myByteValue/2); //error: value should be a byte but expression converted
//        into 'int' by default

        byte myNewByteValue = (byte) (myByteValue / 2);   //fixed through type casting. Converted to byte
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has width of 16
        short myShortValue = 30000; //from -32768 to 32767;
        short myNewShortValue = (short) (myShortValue / 2);

        //long has a width of 64 (double int)
        long myLongValue = 100L;    //need to end it with 'L' or its lowercase

        //1. Create a byte variable and set it to any valid byte number.
        byte myTemp = 120;
        //2. Create a short variable and set it to any valid short number.
        short myAudience = 32000;
        //3. Create an int variable and set it to any valid int number.
        int myCount = 45000;
        //4. Create a variable of type long, and make it equal to to 50000 + 10 times the sum of the byte, plus the
        // short plus the int
        long myLength = 50000 + (10 * (myTemp + myAudience + myCount)); //don't need to do type casting as 'long'
        // automatically converts int to long

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        //String data type: not primitive data type but a class.
	    String myString = "This is a string";   //requires double quotes
        System.out.println("String output: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Number string is: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Result is: " + lastString);
    }
}

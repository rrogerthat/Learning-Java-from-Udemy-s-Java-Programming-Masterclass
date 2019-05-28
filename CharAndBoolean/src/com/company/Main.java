package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';  //accepts only 1 character or also unicode characters. Memory: width of 16, 2 bytes.
        char myUnicode = '\u00A9';
        System.out.println("Unicode output is " + myUnicode);

        boolean myBoolean = false;
        boolean isMale = true;

        //1. Find the code for the registered symbol on the same line as the copyright symbol.
        //2. Create a variable of type char and assign it the unicode value for that symbol.
        char myR = '\u00AE';    //requires single quotes
        //3. Display in on screen.
        System.out.println("Registered symbol is " + myR);
    }
}

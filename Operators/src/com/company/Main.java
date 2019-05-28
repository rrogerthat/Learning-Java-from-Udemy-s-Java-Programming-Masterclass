package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("Total is: " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println("Total is: " + result);

        previousResult = result;
        result = result * 10;
        System.out.println("Total is: " + result);

        previousResult = result;
        result = result / 5;
        System.out.println("Total is: " + result);

        previousResult = result;
        result = result % 3;
        System.out.println("Total is: " + result);

        result++;
        System.out.println("Total is: " + result);

        result--;
        System.out.println("Total is: " + result);

        result += 2;
        System.out.println("Total is: " + result);

        result *= 10;
        System.out.println("Total is: " + result);

        result -= 10;
        System.out.println("Total is: " + result);

        result /= 10;
        System.out.println("Total is: " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        boolean isCar = false;
        if (isCar = true)   //no error since if statement requires a boolean which turns out to be 'true' but should
            // use '==' or just 'isCar'. If entered 'isCar = 50', you would get error since not a boolean.
            System.out.println("This is not supposed to happen");

        //ternary operator
        boolean wasCar = isCar ? true : false;  //is true from ln 59
        if (wasCar)
            System.out.println("wasCar is true");

        //1. Create a double variable with the value 20
        double firstDouble = 20d;
        //2. Create a second variable of the type double with the value 80
        double secondDouble = 80d;
        //3. Add both numbers up and multiply by 25
        double doubleSum = (firstDouble + secondDouble) * 25;
        //4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        double myRemains = doubleSum % 40;
        //5. Write an "if" statement that displays a message "Total was over the limit"
        //   if the remaining total (#4) is equal to 20 or less.
        if (myRemains <= 20)
            System.out.println("Total was over the limit");
    }
}

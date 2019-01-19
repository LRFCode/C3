package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("I will add two numbers for you.  Please enter the first number:");
        double firstNumber = in.nextDouble();

        System.out.println("Please enter the second number:");
        double secondNumber = in.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println("The total of " + firstNumber + " and " + secondNumber + " is " + sum + ".");
    }
}

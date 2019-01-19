package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int withdrawal = 137;

        int numberOfTwenties = withdrawal / 20;
        int remainingAmount = withdrawal % 20;

        int numberOfTens = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfFives = remainingAmount / 5;
        int numberOfOnes = remainingAmount % 5;

        System.out.print("$20(" + numberOfTwenties + "), ");
        System.out.print("$10(" + numberOfTens + "), ");
        System.out.print("$5(" + numberOfFives + "), ");
        System.out.println("$1(" + numberOfOnes + ")");
    }
}

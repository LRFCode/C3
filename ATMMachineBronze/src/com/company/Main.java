package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int withdrawal = 137;

        int numberOfFives = withdrawal / 5;
        int numberOfOnes = withdrawal % 5;

        System.out.print("$5(" + numberOfFives + "), ");
        System.out.println("$1(" + numberOfOnes + ")");
    }
}

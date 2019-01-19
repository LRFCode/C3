package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double myNumber = 3.25;
        int wholePart = (int)myNumber;
        double fractionalPart = myNumber - wholePart;

        System.out.println("Whole part: " + wholePart);
        System.out.println("Fractional part: " + fractionalPart);
    }
}

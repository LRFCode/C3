package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number.");
        long inputNumber = in.nextLong();

        System.out.println("The number you entered was " + inputNumber);

        int intValue = (int) inputNumber;
        short shortValue = (short) inputNumber;
        byte byteValue = (byte) inputNumber;

        boolean fitsInt = (inputNumber == intValue);
        boolean fitsShort = (inputNumber == shortValue);
        boolean fitsByte = (inputNumber == byteValue);

        System.out.println("Number fits in long:  true");
        System.out.println("Number fits in int:   " + fitsInt);
        System.out.println("Number fits in short: " + fitsShort);
        System.out.println("Number fits in byte:  " + fitsByte);
    }
}

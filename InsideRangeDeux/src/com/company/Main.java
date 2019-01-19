package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int x = 0;
        boolean inRange = x >= 1 && x <= 5;
        System.out.println(x + " in range " + inRange);

        x = 1;
        inRange = x >= 1 && x <= 5;
        System.out.println(x + " in range " + inRange);

        x = 4;
        inRange = x >= 1 && x <= 5;
        System.out.println(x + " in range " + inRange);

        x = 5;
        inRange = x >= 1 && x <= 5;
        System.out.println(x + " in range " + inRange);

        x = 6;
        inRange = x >= 1 && x <= 5;
        System.out.println(x + " in range " + inRange);

        x = 10;
        inRange = x >= 1 && x <= 5;
        System.out.println(x + " in range " + inRange);
    }
}

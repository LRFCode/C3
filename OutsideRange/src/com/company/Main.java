package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int x = -1;
        boolean outRange = x < 0 || x > 11;
        System.out.println(x + " out range " + outRange);

        x = 0;
        outRange = x < 0 || x > 11;
        System.out.println(x + " out range " + outRange);

        x = 1;
        outRange = x < 0 || x > 11;
        System.out.println(x + " out range " + outRange);

        x = 10;
        outRange = x < 0 || x > 11;
        System.out.println(x + " out range " + outRange);

        x = 11;
        outRange = x < 0 || x > 11;
        System.out.println(x + " out range " + outRange);

        x = 12;
        outRange = x < 0 || x > 11;
        System.out.println(x + " out range " + outRange);
    }
}

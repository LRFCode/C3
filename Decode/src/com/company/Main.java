package com.company;

public class Main
{
    public static void main(String[] args)
    {
        char first = 'Q';
        char middle = 'W';
        char last = 'K';

        int offset = 5;

        first -= offset;
        middle -= offset;
        last -= offset;

        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);
    }
}

package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("     Truth Table");
        System.out.println("  a     b   | a || b");
        System.out.println("--------------------");
        System.out.println("false false | " + (false || false));
        System.out.println("false true  | " + (false || true));
        System.out.println("true  false | " + (true || false));
        System.out.println("true  true  | " + (true || true));
    }
}

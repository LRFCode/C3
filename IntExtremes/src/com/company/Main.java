package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int positiveInt = 2147483647;
        System.out.println(positiveInt);    //2147483647

        positiveInt = positiveInt + 1;
        System.out.println(positiveInt);    //-2147483648

        int negativeInt = -2147483648;
        System.out.println(negativeInt);    //-2147483648

        negativeInt = negativeInt - 1;
        System.out.println(negativeInt);    //2147483647
    }
}

package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final int SECONDS_PER_MINUTE = 60;
        final int SECONDS_PER_HOUR = 60 * SECONDS_PER_MINUTE;

        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("Please enter the number of seconds you would like to convert:  ");
        int inputSeconds = in.nextInt();

        int hours = inputSeconds / SECONDS_PER_HOUR;
        int remainingSeconds = inputSeconds % SECONDS_PER_HOUR;

        int minutes = remainingSeconds / SECONDS_PER_MINUTE;
        int seconds = remainingSeconds % SECONDS_PER_MINUTE;

        System.out.println(inputSeconds + " seconds is...");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
    }
}

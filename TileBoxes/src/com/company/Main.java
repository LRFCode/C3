package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final int TILES_PER_BOX = 8;
        final double WASTAGE_MULTIPLIER = 1.1;

        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter the width of the floor you are tiling:  ");
        int floorWidth = in.nextInt();

        System.out.println("Please enter the depth of the floor you are tiling:  ");
        int floorDepth = in.nextInt();

        double floorArea = floorWidth * floorDepth;
        int numberOfTiles = (int)(floorArea * WASTAGE_MULTIPLIER);

        //Add one short of a whole box to the tiles needed to account for integer division
        int numberOfBoxes = (numberOfTiles + TILES_PER_BOX - 1) / TILES_PER_BOX;

        System.out.println(("The total number of boxes you will need is:  " + numberOfBoxes));
    }
}

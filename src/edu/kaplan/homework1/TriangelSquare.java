package edu.kaplan.homework1;

/**
 * Created by ִלטענטי on 16.10.2015.
 */
public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        double side1, side2, side3;
        float length = 0;
        float halfp = 0;
        float square = 0;
        //-----Calculating the lengths of the sides----
        side1 = sideLength(x1, y1, x2, y2);
        side2 = sideLength(x2, y2, x3, y3);
        side3 = sideLength(x1, y1, x3, y3);
        //-----------------------------------------------------

        System.out.println("Length of side 1 is " + side1);
        System.out.println("Length of side 2 is " + side2);
        System.out.println("Length of side 3 is " + side3);

        //------Calculating perimeter------------------
        length = (float)(side1 + side2 + side3);
        //------Calculating square---------------------
        halfp = length/2;
        square = (float)(Math.sqrt(halfp*(halfp - side1)*(halfp - side2)*(halfp - side3)));

        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
   //--- Method for calculating the length of the side------
    public static double sideLength (int a1, int b1,int a2,int b2){
        double sidelenghth = 0;

        sidelenghth = Math.sqrt((a1 - a2)*(a1 - a2) +(b1 - b2)*(b1 - b2));

        return sidelenghth;
    }
}

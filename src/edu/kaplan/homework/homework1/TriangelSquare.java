package edu.kaplan.homework.homework1;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        //Calculating the lengths of the sides
        double side1 = calculateSideLength(x1, y1, x2, y2);
        double side2 = calculateSideLength(x2, y2, x3, y3);
        double side3 = calculateSideLength(x1, y1, x3, y3);

        System.out.println("Length of side 1 is " + side1);
        System.out.println("Length of side 2 is " + side2);
        System.out.println("Length of side 3 is " + side3);
        //Calculating perimeter
        float length = (float)(side1 + side2 + side3);
        //Calculating square
        float halfPerimeter = length/2;
        float square = (float)(Math.sqrt(halfPerimeter * (halfPerimeter - side1) *
                (halfPerimeter - side2) * (halfPerimeter - side3)));
        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
   //Method for calculating the length of the side
    public static double calculateSideLength (int a1, int b1,int a2,int b2){
        //double sidelenghth
        return Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2));
      //  return sidelenghth;
    }
}

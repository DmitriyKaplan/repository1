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
        //-----------------------------------------------------
        side1 = sidel(x1,y1,x2,y2);
        side2 = sidel(x2,y2,x3,y3);
        side3 = sidel(x1,y1,x3,y3);
        //-----------------------------------------------------

        System.out.println("Length of side 1 is " + side1);
        System.out.println("Length of side 2 is " + side2);
        System.out.println("Length of side 3 is " + side3);

        //------------------------------------------------------
        length = (float)(side1 + side2 + side3);
        //------------------------------------------------------
        halfp = length/2;
        square = (float)(Math.sqrt(halfp*(halfp - side1)*(halfp - side2)*(halfp - side3)));

        /*your code here*/
        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
    public static double sidel (int a1, int b1,int a2,int b2){
        double sidelenghth = 0;
        double temp1, temp2, temp3;
        temp1 = (a1 - a2)*(a1 - a2);
        temp2 = (b1 - b2)*(b1 - b2);
        temp3 = temp1 + temp2;
        sidelenghth = Math.sqrt(temp3);

        return sidelenghth;
    }
}

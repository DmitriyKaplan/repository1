package edu.kaplan.homework1;

/**
 * Created by ִלטענטי on 17.10.2015.
 */
public class ClockAngle {
    public static void main(String[] args) {
        boolean hours = true;
        boolean mins = true;
        byte result = 0;
        int x = 3;
        int y = 48;
//---validation-------------
        if (x>12) {
            x=12;
        }
        if (x<0) {
            x=0;
        }
        if (y>59) {
            y=59;
        }
        if (y<0) {
            y=0;
        }
//-------------------------------------

        //---the calculation of the angle of the arrow relative to 0-------
        int hourdeg = 30*x;
        int minutdeg = 6*y;
        int angle = 0;
        System.out.println("Hour degrees are " + hourdeg);
        System.out.println("Minute degrees are " + minutdeg);
//---The calculation of the angle between the arrows---------------
        int tempangle = Math.abs(hourdeg - minutdeg);

//---Checking acute angle(or 180 degrees)-------------------------
        if (tempangle>180) {
            angle = 360 - tempangle;
        }else{
            angle = tempangle;
        }
        System.out.println("Angle is " + angle);


       // System.out.println("Anglel between hours and minute narrows is " + result);
    }
}

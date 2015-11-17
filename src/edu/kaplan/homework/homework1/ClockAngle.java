package edu.kaplan.homework.homework1;

public class ClockAngle {
    public static void main(String[] args) {
        boolean hours = true;
        boolean mins = true;
        byte result = 0;
        int x = 12;
        int y = 45;
//validation
        if ((x > 12)|(x < 0)) {
            hours = false;
        }
        if ((y > 59)|(y < 0)) {
            mins = false;
        }
        boolean valid = hours&mins;
        if (valid == false) {
            System.out.println("Invalid set");
            System.exit(0);
        }
        //the calculation of the angle of the arrow relative to 0
        int hourdeg = (30 * x);
        int minutdeg = (6 * y);
        int angle = 0;
        System.out.println("Hour degrees are " + hourdeg);
        System.out.println("Minute degrees are " + minutdeg);
        //The calculation of the angle between the arrows
        int tempangle = Math.abs(hourdeg - minutdeg);
        //Checking acute angle(or 180 degrees)
        if (tempangle>180) {
            angle = 360 - tempangle;
        } else {
            angle = tempangle;
        }
        System.out.println("Angle between hours and minute arrows is " + angle);
    }
}

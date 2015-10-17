package edu.kaplan.homework1;

/**
 * Created by Дмитрий on 16.10.2015.
 */
public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        first = first + second;// Сумма обоих перем в фест
        second = first - second;//Секонд меняет свое значение на то, что было в фест
        first = first - second;//Из суммы вычитаем новый секонд и фест меняет свое значение на старый секонд
 /*int temp = first;
        first = second;
        second = temp;*/

        System.out.println("First = " + first + " , second = " + second);
    }

}

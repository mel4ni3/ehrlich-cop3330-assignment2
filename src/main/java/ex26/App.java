/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex26;

import java.util.*;
import java.lang.Math;

public class App {

    public static void main(String[] args) {

        double n, i, b, p;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        b = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent?) ");
        i = input.nextDouble();
        while (i < 0) {
            System.out.println("Please enter a percentage.");
            i = input.nextDouble();
        }

        System.out.print("What is the monthly payment you can make? ");
        p = input.nextDouble();

        n = calculateMonthsUntilPaidOff(i, b, p);

        System.out.print("It will take you " + n + " months to pay off this card.");

    }

    public static double calculateMonthsUntilPaidOff(double apr, double balance, double payment) {
        double res;

        apr /= 365;

        res =  (-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr);

        return res;
    }

}

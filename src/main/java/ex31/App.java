/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex31;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str ="";
        int pulse, age;

        System.out.print("What is your resting pulse? ");
        str = input.nextLine();

        while ((!isNumeric(str))){
            System.out.println("Number not entered.");
            str = input.nextLine();
        }

        pulse = Integer.parseInt(str);

        System.out.print("What is your age? ");
        str = input.nextLine();

        while (!isNumeric(str)){
            System.out.println("Number not entered.");
            str = input.nextLine();
        }

        age = Integer.parseInt(str);

        System.out.print("Resting Pulse: " + pulse + "\t\tAge: " + age + "\n\n");
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        heartRateCalculator(age, pulse);

    }

    public static void heartRateCalculator(int age, int pulse) {

        for(int i = 55; i <= 95; i = i+5) {
            int target = (((220 - age) - pulse) * i/100) + pulse;
            System.out.println(i + "%" + "          | " + target + " bpm");
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
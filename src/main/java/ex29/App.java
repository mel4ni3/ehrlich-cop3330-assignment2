/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex29;
import java.util.*;

public class App {

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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What's the rate of return?");

        String in = input.nextLine();


        while (!(isNumeric(in)) || in.equals("0")) {
            System.out.println("Sorry. That's not a valid input.");
            System.out.print("What's the rate of return?");
            in = input.nextLine();
            //num = Integer.parseInt(in);
        }

        int num = Integer.parseInt(in);

        int res = 72 / num;
        System.out.print("It will take " + res + " years to double your initial investment.");

    }
}

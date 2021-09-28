/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex32;

import java.util.*;

public class App {

    public static void main(String[] args) {

        String str = "";
        int level;
        Boolean again = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Guess the Number!\n");

        while (again) {

            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            str = input.nextLine();

            while (!isNumeric(str) || Integer.parseInt(str) > 3 || Integer.parseInt(str) < 1) {
                System.out.println("Enter a valid difficulty.");
                str = input.nextLine();
            }

            level = Integer.valueOf(str);

            guessTheNumber(level);

            System.out.print("Do you wish to play again (Y/N)? ");
            str = input.nextLine();

            if (str.equals("n") || str.equals("N")) {
                again = false;
            } else {
                continue;
            }

        }
    }

    public static void guessTheNumber (int level){

        Scanner input = new Scanner(System.in);
        int answer, max = 0, n = 1, guess = 0;
        String response = "";

        if (level == 1)
            max = 10;
        else if (level == 2)
            max = 100;
        else if (level == 3)
            max = 1000;

        Random random = new Random();
        answer = random.nextInt(max) + 1;

        System.out.print("I have my number. What's your guess? ");
        response = input.nextLine();

        while (!isNumeric(response)) {
            n++;
            System.out.println("Input is not a number.");
            response = input.nextLine();
        }

        guess = Integer.valueOf(response);

        while (guess != answer) {
            n++;

            if (guess < answer) {
                System.out.print("Too low. Guess Again: ");
            } else if (guess > answer) {
                System.out.print("Too high. Guess Again: ");
            }
            response = input.nextLine();

            while (!isNumeric(response)) {
                n++;
                System.out.println("Input is not a number.");
                response = input.nextLine();
            }

            guess = Integer.valueOf(response);
            }
            System.out.print("You got it in " + n + " guesses!\n\n");
        }

        public static boolean isNumeric (String str){
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

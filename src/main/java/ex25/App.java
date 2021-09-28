/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex25;
import java.util.*;

public class App {

    public static void passwordValidator(String password) {


        if(password.matches("[0-9]+") && password.length() < 8) {
                System.out.println(password + " is a very weak password.");
            }
        else if(password.matches("[A-Za-z]+") && password.length() < 8) {
            System.out.println(password + "is a weak password.");
        }
        else if(password.length() >= 8 && password.matches("^[A-Za-z0-9]+")){
            System.out.println(password + "is a strong password.");
        }

        else {
            System.out.println(password + " is a very strong password.");
        }


    }

    public static void main(String[] args) {

        String password;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the password:");
        password = input.nextLine();
        passwordValidator(password);

    }

}

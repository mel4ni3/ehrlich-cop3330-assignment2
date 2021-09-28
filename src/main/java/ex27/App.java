/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex27;

import java.util.*;

public class App {

    public static int checkFirstName(String first) {
        int flag = 0;

        if (first.equals("")) {
            System.out.println("The first name must be filled in.");
            flag = 1;
        }

        if (first.length() < 2) {
            System.out.println("The first name must be at least two characters long.");
            flag = 1;
        }

        return flag;
    }

    public static int checkLastName(String last) {

        int flag = 0;

        if (last.equals("")) {
            System.out.println("The last name must be filled in.");
            flag = 1;
        }


        if (last.length() < 2) {
            System.out.println("The last name must be at least two characters long.");
            flag = 1;
        }

        return flag;
    }

    public static int checkID(String ID) {

        int flag = 0;

        char array[] = ID.toCharArray();

        if (array[2] != '-') {
            flag = 1;
            System.out.print("The employee ID must be in the format of AA-1234.");
            return flag;
        }


        for (int i = 0; i < 2; i++) {
            if (!(array[i] >= 'a' && array[i] <= 'z')) {
                flag = 1;
                System.out.print("The employee ID must be in the format AA-1234.");
                return flag;
            }
        }

        for (int j = 3; j < 7; j++) {
            if (!(array[j] >= '0' && array[j] <= '9')) {
                flag = 1;
                System.out.print("The employee ID must be in the format AA-1234.");
                return flag;
            }
        }
        return flag;
    }

    public static int checkZipCode(String zipcode){
        char[] zip = zipcode.toCharArray();

        int flag = 0;

        if (zip.length != 5) {
            System.out.println("The zipcode must be a 5 digit number.");
            flag = 1;
            return flag;
        }

        for (int k = 0; k < 5; k++) {
            if (!(zip[k] >= '0' && zip[k] <= '9')){
                flag = 1;
                System.out.println("The zipcode must be a 5 digit number.");
                return flag;
            }
        }

    return flag;

    }

    public static void validateInput(String first, String last, String zipcode, String ID){
        int flag = 0;

        flag += checkFirstName(first);
        flag += checkLastName(last);
        flag += checkZipCode(zipcode);
        flag += checkID(ID);

        if (flag == 0)
            System.out.println("There were no errors found.");

    }

    public static void main(String[] args) {

        String first;
        String last;
        String zipcode;
        String ID;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first name: ");
        first = input.nextLine();
        System.out.print("Enter the last name: ");
        last = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        zipcode = input.nextLine();
        System.out.print("Enter the employee ID: ");
        ID = input.nextLine();


        validateInput(first, last, zipcode, ID);

    }

}

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex28;

import java.util.*;

public class App {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int total = 0;

        Scanner input = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.print("Enter a number: ");
            arr[i] =  input.nextInt();
        }

        for (int i=0; i<5; i++) {
            total +=  arr[i];
        }

        System.out.println("The total is "+ total + ".");
    }
}

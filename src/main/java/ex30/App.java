/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex30;

public class App {

    public static void main(String[] args) {

        int i = 0, j = 0;

        for(i = 1; i <= 12; i++) {

            for (j = 1; j <= 12; j++) {
                System.out.printf("%-4d", i*j);
            }
            System.out.print("\n");
        }
    }
}

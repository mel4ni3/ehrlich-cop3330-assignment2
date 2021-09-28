/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex35;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> names = new ArrayList<String>();
        String str = "";

        while(true){

            System.out.print("Enter a name: ");
            str = input.nextLine();

            if (str.equals("")) {
                break;
            }
            else {
                names.add(str);
            }
        }
        getWinner(names);
    }

    public static void getWinner(List names){

        Random random = new Random();
        int winner = random.nextInt(names.size());
        System.out.print("The winner is... " + names.get(winner) + ".");
    }
}
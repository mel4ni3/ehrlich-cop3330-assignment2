/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex33;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int i;
        List<String> answers = new ArrayList<String>();

        answers.add("Yes,");
        answers.add("No,");
        answers.add("Maybe,");
        answers.add("Ask again later.");

        System.out.println("What's your question? ");
        System.out.print("> ");
        String q = input.nextLine();

        i = random.nextInt(4);
        System.out.print("\n" + answers.get(i));

    }

}
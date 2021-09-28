/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex24;

import java.util.*;

public class App {

    static Boolean AnagramChecker(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        char[] one = first.toCharArray();
        char[] two = second.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        for (int i = 0; i < first.length(); i++)
            if (one[i] != two[i])
                return false;

        return true;

    }

    public static void main(String[] args) {

        String first = "";
        String second = "";
        Boolean isAnagram = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string:");
        first = input.nextLine();
        System.out.print("Enter the second string:");
        second = input.nextLine();

        isAnagram = AnagramChecker(first, second);

        if (isAnagram)
            System.out.print("\"" + first + "\"" + " and " + "\"" + second + "\"" + " are anagrams.");
        else
            System.out.print("\"" + first + "\"" + " and " + "\"" + second + "\"" + " are not anagrams.");

    }

}

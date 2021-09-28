/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex38;

import java.util.*;

public class App {

    public static void main(String[] args) {

        int i, j, len;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String n = input.nextLine();
        String[] nums = n.split(" ");
        len = nums.length;

        int[] arr = new int[len];

        for(i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        Integer[] even = filterNumbers(arr);
        System.out.print("The even numbers are");

        for (j = 0; j < even.length; j++) {
            if (j == even.length - 1)
                System.out.print(" " + even[j] + ".");
            else
                System.out.println(" " + even[j]);
        }
    }

    public static Integer[] filterNumbers(int[] nums) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        Integer[] evenNums;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
                evenNumbers.add(nums[i]);
        }

        evenNums = (Integer[]) evenNumbers.toArray();

        return evenNums;
    }

}
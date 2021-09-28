/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex36;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> data = new ArrayList<String>();

        String str = "";
        double avg, min, max, dev;

        while(str != "done"){

            System.out.print("Enter a number: ");
            str = input.nextLine();

            while(!isNumeric(str) && !(str.equals("done"))) {
                System.out.println("Invalid input.");
                str = input.nextLine();
            }

            data.add(str);
        }

        System.out.print("Numbers: ");

        for (int i = 0; i < data.size(); i++) {
            if (i == data.size()-1)
                System.out.print(data.get(i));
            else
                System.out.print(data.get(i) + ", ");
        }

        List<Double> dataNew = new ArrayList<Double>(data.size()) ;
        for (String datanum : data) {
            dataNew.add(Double.valueOf(datanum));
        }

        min = min(dataNew);
        max = max(dataNew);
        dev = dev(dataNew);
        avg = avg(dataNew);

        System.out.printf("\nThe average is %.2f\n", avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.printf("The standard deviation is %.2f", dev);

    }

    public static double dev(List<Double> data) {

        double sum = 0.0, std = 0.0, mean;
        int len = data.size(), i;

        for(double val : data) {
            sum += val;
        }
        mean = sum / len;

        for(double val: data) {
            std += Math.pow(val - mean, 2);
        }
        return Math.sqrt(std/len);
    }

    public static double max(List<Double> nums) {
        return Collections.max(nums);
    }

    public static double min(List<Double> nums) {
        return Collections.min(nums);
    }

    public static double avg(List<Double> nums) {

        double sum = 0.0;
        int count = 0;

        for (Double val: nums){
            sum += val;
            count++;
        }
        return (sum / count);
    }

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


}
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright Melanie Ehrlich
 */

package ex34;

import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> employees = new ArrayList<String>();
        List<String> employeesNew = new ArrayList<>();
        String del = "";
        int i, j;

        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("There are 5 employees:");

        for(i = 0; i < 5; i++){
            System.out.println(employees.get(i));
        }

        System.out.print("\nEnter an employee name to remove: ");
        del = input.nextLine();

        while(!employees.contains(del)){
            System.out.print("The employee name entered is not within the list, try again: ");
            del = input.nextLine();
        }

        System.out.println("\nThere are 4 employees: ");
        employeesNew = removeEmployee(employees, del);
        for(j = 0; j < 4; j++){
            System.out.println(employeesNew.get(j));
        }
    }

    public static List removeEmployee(List employees, String str) {

        employees.remove(str);
        return employees;
    }

}
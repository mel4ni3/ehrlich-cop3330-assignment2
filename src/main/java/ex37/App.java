/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex37;

import java.util.*;

public class App {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        int spc = 0, length = 0, n = 0;

        System.out.print("What's the minimum length? ");
        length = input.nextInt();

        System.out.print("How many special characters? ");
        spc = input.nextInt();

        System.out.print("How many numbers? ");
        n = input.nextInt();

        passMaker(length, spc, n);

    }

    public static void passMaker(int length, int spc, int n) {

        Random random = new Random();

        int i, rand;
        String strpass = "";
        String letter[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String number[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String special[] = {"!","&","-","%","$","*","@","^"};
        List<String> password = new ArrayList<String>();

        for (i = 0; i < n; i++) {
            rand = random.nextInt(number.length);
            password.add(number[rand]);
        }

        for (i = 0; i < spc; i++) {
            rand = random.nextInt(special.length);
            password.add(special[rand]);
        }

        for (i = 0; i < length - password.size() + 1; i++) {
            rand = random.nextInt(letter.length);
            password.add(letter[rand]);
        }

        Collections.shuffle(password);

        for (String s : password) {
            strpass += s;
        }

        System.out.print("Your password is " + strpass);

    }

}
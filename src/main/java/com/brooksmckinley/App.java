/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scan.nextInt();

        System.out.println("You are " + (oldEnough(age) ? "" : "not ") + "old enough to legally drive.");
    }

    public static boolean oldEnough(int age) {
        return age >= 16;
    }
}
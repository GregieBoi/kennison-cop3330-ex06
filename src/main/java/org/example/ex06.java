/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class ex06 {

    // main
    public static void main(String[] args) {

       // get cur date and single out year
       LocalDate cur_date = LocalDate.now();
       int cur_year = cur_date.getYear();

       // get age and retirement goal, convert to int, and calculate years to retirement and retirement year
       String str_cur_age = get_age();
       String str_ret_age = get_ret();
       int cur_age = Integer.parseInt(str_cur_age);
       int ret_age = Integer.parseInt(str_ret_age);
       int how_long = ret_age - cur_age;
       int ret_year = cur_year + how_long;

       // print output
       System.out.println("You have " + how_long + " years left until you can retire.\n" +
               "It's " + cur_year + " , so you can retire in " + ret_year + ".");
    }

    // gets age
    public static String get_age() {

        // prompt for input and return scan
        System.out.print("What is current age? ");
        Scanner input = new Scanner(System.in);
        return input.next();

    }

    // gets retirement age goal
    public static String get_ret() {

        // prompt for input and return scan
        System.out.print("At what age would you like to retire? ");
        Scanner input = new Scanner(System.in);
        return input.next();

    }
}

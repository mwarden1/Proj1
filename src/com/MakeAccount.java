package com;

import java.util.Scanner;

/**
 * Created by adakuuchendu on 4/18/17.
 */


public class MakeAccount {

    public MakeAccount(){

        //This constructor gets and prints the date for the day

        java.util.Date date = new java.util.Date();
        System.out.println("The date and time is: " + date.toString());

    }

    public static String AccountName() {

        //This method asks the required questions needed to set up an account

        int rand = 10 + (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your first name: ");
        String name1 = input.next();
        String newname1 = name1.toUpperCase();
        int len1 = name1.length() - 1;


        System.out.println("Enter your last name: ");
        String name2 = input.next();
        String newname2 = name2.toLowerCase();

        System.out.println("Enter your age: ");
        String age = input.next();

        System.out.println("Enter your date of birth: ");
        String birth = input.next();
        System.out.println(birth);

        System.out.println("Enter your 8 digit Social Security Number: ");
        String SSN = input.next();

        System.out.println("Enter your full street address: ");
        String street = input.next();

        System.out.println("Enter your city: ");
        String city = input.next();

        System.out.println("Enter your Zipcode: ");
        String zip = input.next();

        System.out.print(name1 + " " + name2 + " your password for your Account is: ");
        System.out.print(newname1.charAt(len1));
        System.out.print(rand);
        System.out.print(newname2.charAt(0));
        System.out.print(newname2.charAt(1));
        System.out.print(newname2.charAt(2));

        System.out.println("  ");


        return name1 + name2 ;


    }

}

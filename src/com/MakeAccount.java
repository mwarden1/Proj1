package com;

import java.util.Scanner;

/**
 * Created by adakuuchendu on 4/18/17.
 */
public  class MakeAccount {



    public static String AccountName() {

        int rand = 10 + (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your first name: ");
        String name1 = input.next();
        String newname1 = name1.toUpperCase();
        int len1 = name1.length()-1;


        System.out.println("Enter your last name: ");
        String name2 = input.next();
        String newname2 = name2.toLowerCase();

        System.out.println("Enter your age: ");
        String age = input.next();
        System.out.println(age);

        System.out.println("Enter your date of birth: ");
        String birth = input.next();
        System.out.println(birth);

        System.out.println("Enter your 8 digit Social Security Number: ");
        double SSN = input.nextDouble();


        System.out.print(name1 + " " + name2 + " your password for your Account is: ");
        System.out.print(newname1.charAt(len1));
        System.out.print(rand);
        System.out.print(newname2.charAt(0));
        System.out.print(newname2.charAt(1));
        System.out.print(newname2.charAt(2));

        System.out.println("  ");


        return name1 + name2 + age + birth + SSN;


    }



}

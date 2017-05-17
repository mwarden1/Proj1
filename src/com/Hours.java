package com;

import java.util.Scanner;

/**
 * Created by adakuuchendu on 5/16/17.
 */
public class Hours {

    public static double netpay;

    public static double Time(){

        Scanner input = new Scanner(System.in);


        System.out.println("Enter how many hours you worked: ");
        double hours = input.nextDouble();
        System.out.println(hours);

        System.out.println("Enter your payrate: ");
        double payrate = input.nextDouble();
        System.out.println(payrate);

        final double TAX = 0.06f;

        double grosspay = hours*payrate;
        double netPay = grosspay-(TAX*grosspay);

        System.out.println("Your grosspay is " + grosspay + " and your netpay is " + netPay);


        return hours + payrate;


    }



    public static double getnetpay(double netPay)
    {
        return netPay;
    }
}

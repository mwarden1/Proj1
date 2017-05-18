package com;

import com.company.Comm;

import java.util.Scanner;

/**
 * Created by adakuuchendu on 5/17/17.
 */

public class Pay extends Comm {
    //This class extends from the Comm class

    double result;

    public void getValue(double value, double sale){
        //This method uses local variables created in the previous classes to obtain the final netpay for the user.

        final double percent = 0.05d;
        this.result = percent*sale + value;

        System.out.printf("Your final netpay is: %f \n",result);
        System.out.println("This is done by adding 5% of your sales to your previous netpay");
        System.out.println(" ");
        System.out.println("THANK YOU FOR USING OUR PAY ROLL SYSTEM");


    }



}


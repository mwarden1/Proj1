package com;

import com.company.Comm;

import java.util.Scanner;

/**
 * Created by adakuuchendu on 5/17/17.
 */

public class Pay extends Comm {

    double result;

    public void getValue(double value, double sale){

        final double percent = 0.05d;
        this.result = percent*sale + value;

        System.out.println("Your final netpay is: " + result);
        System.out.println("This is done by adding 5% of your sales to your previous netpay");


    }



}


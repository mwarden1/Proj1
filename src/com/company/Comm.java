package com.company;
import java.util.Scanner;

/**
 * Created by adakuuchendu on 5/16/17.
 */
public class Comm {

    public Comm()
    {
        new Comm();
    }



    public static double commission(double netPay, float newpay){

        double result = 0.05*netPay;

        System.out.printf("Your new netpay is %d", result);

        return result;
    }



    
}

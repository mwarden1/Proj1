package com.company;
//import com.Hours.netPay;
import com.Hours;


import com.Hours;
import java.util.Scanner;

/**
 * Created by adakuuchendu on 5/16/17.
 */

public class Comm {



    public Comm()
    {
        new Comm();
    }


    Hours hours1 = new Hours();


    public Hours getHours1() {
        return hours1;
    }

    public void setHours1(Hours hours1) {
        this.hours1 = hours1;
        hours1.getnetpay(netPay);
    }



    public static double commission(double netPay){

        double result = 0.05*netPay;

        System.out.printf("Your new netpay is after adding a percentage of your sales is %d", result);

        return result;
    }



    
}

package com.company;

import com.*;


public class Main {

    public static void main(String[] args) {

        Instructions inst = new Instructions();
        inst.Instrut();
        System.out.println("  ");


        MakeAccount make = new MakeAccount();
        System.out.println("  ");
        make.AccountName();


        Hours hours = new Hours();
        double netPay = hours.Time();


        Sales sales = new Sales();
        double sale = sales.EmployeeSales();


        Comm comm = new Comm();


        Pay getPay = new Pay();
        getPay.getValue(netPay, sale);



    }
}

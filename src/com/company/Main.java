package com.company;

import com.MakeAccount;
import com.Sales;
import com.Hours;


public class Main {

    public static void main(String[] args) {

        MakeAccount make = new MakeAccount();

        make.AccountName();

        Sales sales = new Sales();

        sales.EmployeeSales();

        Hours hours = new Hours();
        hours.Time();

        Comm comm = new Comm();




//make.grosspayData(12.6);

    }
}

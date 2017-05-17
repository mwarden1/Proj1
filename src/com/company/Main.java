package com.company;

import com.MakeAccount;
import com.Sales;
import com.Hours;
//import com.Comm;


public class Main {

    public static void main(String[] args) {

        MakeAccount make = new MakeAccount();

        make.AccountName("Hello");
        make.AccountName();

        Sales sales = new Sales();

        sales.EmployeeSales();

        Hours hours = new Hours();
        hours.Time();

        Comm comm = new Comm();




//make.grosspayData(12.6);

    }
}

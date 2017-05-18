package com.company;

import com.MakeAccount;
import com.Pay;
import com.Sales;
import com.Hours;
//import com.Comm;


public class Main {

    public static void main(String[] args) {

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

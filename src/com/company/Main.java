package com.company;

import com.MakeAccount;
import com.Sales;

public class Main {

    public static void main(String[] args) {

        MakeAccount make = new MakeAccount();

        make.AccountName();
        make.Hours();

        Sales sales = new Sales();

        sales.ManagerSales();

//make.grosspayData(12.6);

    }
}

package com;
import java.util.Scanner;

/**
 * Created by adakuuchendu on 4/19/17.
 */
public class Sales {

    Scanner input1 = new Scanner(System.in);


    public static void EmployeeSales(){

        Scanner input = new Scanner(System.in);

        System.out.println("Did you make any sales this week? ");
        System.out.println("Enter 1 for yes and 0 for no: ");
        String ans = input.next();


        switch(1){

            case 1:
                int[] myList = new int[7];

                for (int i = 0; i < myList.length; i++) {

                    int num = i + 1;
                    System.out.print(" Enter the sales for the Day " + num + ": ");
                    myList[i] = input.nextInt();

                }

                System.out.println(" ");

                System.out.println("\n Sales for 7 days");
                System.out.println("--------------------");


                double total = 0;

                for (int i = 0; i < myList.length; i++) {
                    int num = i + 1;
                    System.out.println("Day " + num + " sales "+ myList[i]);
                    total += myList[i];
                }
                System.out.println(" ");
                System.out.println("Total sales: " + total);

                break;

            default:
                System.out.println(" nothing ");




        }}


    //MakeAccount myaccount=new MakeAccount();
    //myaccount.grosspayData(10.5)

    //MakeAccount.


}

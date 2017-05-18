package com;
import java.util.Scanner;

/**
 * Created by adakuuchendu on 4/19/17.
 */
public class Sales {


    public double EmployeeSales(){

        Scanner input = new Scanner(System.in);

        System.out.println("Did you make any sales this week? ");
        System.out.println("Enter 1 for yes and any number other integer for no: ");
        int ans = input.nextInt();
        double total = 0;

        switch(ans){ //This is a switch statement used to make sure the user either sold the week or not

            case 1:
                int[] myList = new int[7];

                for (int i = 0; i < myList.length; i++) {

                    int num = i + 1;
                    System.out.print("Enter the sales for the Day " + num + ": ");
                    myList[i] = input.nextInt();
                }

                System.out.println(" ");
                System.out.println("\n Sales for 7 days");
                System.out.println("--------------------");

                for (int i = 0; i < myList.length; i++) {
                    int num = i + 1;
                    System.out.println("Day " + num + " sales "+ myList[i]);
                    total += myList[i];
                }

                System.out.println(" ");
                System.out.println("Total sales: " + total);

                break;

            case 0:
                System.out.println(" ");
                break;

            default:
                if (ans != 1 & ans != 0) {
                    System.out.println("Error should have, therefore: ");
                    break;
                }
        }

        return total;
    }

}

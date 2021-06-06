/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;

public class APP {


    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        Scanner sc = new Scanner(System.in);
        String OrderAmount = sc.nextLine();


        System.out.println("What state do you live in?");
        String State = sc.nextLine();




        double OrderAmountDouble = Double.parseDouble(OrderAmount);
        double TaxRate = 0;
        //String OutputString  =  "" ;
        if (State.equals("Wisconsin"))
        {
            TaxRate = 5;
            System.out.println("What county do you live in?");
            String County = sc.nextLine();
            if(County.equals("Eau Claire"))
            {
                TaxRate = 5.005;
            }
            else if(County.equals("Dunn"))
            {
                TaxRate = 5.004;
            }
        }
        else if (State.equals("Illinois "))
        {
            TaxRate = 8;
        }
        Double Tax = OrderAmountDouble * TaxRate / 100.0;
        Double Total = Tax + OrderAmountDouble;
        String OutputString = "The tax is $" + Math.round(Tax*1000.00)/1000.00 + "\nThe total is $" +  Math.round(Total*1000.00)/1000.00;
        System.out.println(OutputString);

    }


}

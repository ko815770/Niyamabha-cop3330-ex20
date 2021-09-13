package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        double order, tax = 0;
        String state, county;
        System.out.println("What is your order amount?");
        Scanner input = new Scanner(System.in);
        order = Double.parseDouble(input.nextLine());
        System.out.println("What state do you live in?");
        state = input.nextLine();
        System.out.println("What county do you live in?");
        county = input.nextLine();
        if ("Wisconsin".equals(state))
        {
            tax = order * 0.005;
            if ("Eau Claire".equals(county))
            {
                tax = tax + (order * 0.005);
            }
            else if ("Dunn".equals(county))
            {
                tax = tax + (order * 0.004);
            }
        }
        else if ("Illinois".equals(state))
        {
            tax = order * 0.008;
        }
        System.out.println("The tax is $" + tax + "\nThe total is $" + (order + tax));
    }
}
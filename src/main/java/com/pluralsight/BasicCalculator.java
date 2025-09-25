package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

//Create a Java application named BasicCalculator that reads in two floating point
//numbers and then asks the user whether they want to add, subtract, multiply or
//divide the two numbers.
 //Step 1
        //Perform the requested operation and display the results.
        //Enter the first number: 5
        //Enter the second number: 12
        //Possible calculations:
        //(A)dd
        //(S)ubtract
        //(M)ultiply
        //(D)ivide
        //Please select an option: M
        //5 * 12 = 60

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("What do you want to do?");
        System.out.print("Possible calculations: \n (A)dd \n (S)ubtract \n (M)ultiply \n (D)ivide \n");
        String calc = scanner.nextLine();
        System.out.println("Please select option: "+ calc);
        scanner.nextLine();

        double result = num1 * num2;

        System.out.println("Result: "+result);




    }
}

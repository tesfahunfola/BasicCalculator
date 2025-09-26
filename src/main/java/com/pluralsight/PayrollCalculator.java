package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = scan.nextLine();

        System.out.println("Enter hours worked: ");
        double hoursWork = scan.nextDouble();

        System.out.println("Enter pay rate: ");
        double payRate = scan.nextDouble();
        double grossPay;
        if (hoursWork > 40){
            grossPay = 40 * payRate + (hoursWork - 40) * 1.5 * payRate;
        }else{grossPay = hoursWork * payRate;

        }


        System.out.printf("Hey, %s your gross pay is %.2f",name,grossPay);
    }
}

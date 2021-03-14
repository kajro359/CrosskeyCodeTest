/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.CKLib;

/**
 *
 * @author kaj
 */
public class Prospect {

    public static int COUNT = 0;

    private final int id;
    private final String customer;
    private final double loan;
    private final double interest_rate;
    // private final double interest;
    private final double number_of_payments;
    private double monthly_payment;

    public Prospect(String args) {
        String[] data = args.split(",");
        COUNT++;
        customer = data[0];
        loan = Double.valueOf(data[1]);
        interest_rate = monthlyInterestRate(Double.valueOf(data[2]) / 100);
        number_of_payments = Integer.valueOf(data[3]) * 12;
        //interest_rate = Double.valueOf(data[2]) / 12 / 100;
        id = Integer.valueOf(data[4]);
        monthly_payment = calcPayment();
    }

    private static double monthlyInterestRate(double yearly) {
        return MyMaths.findRoot((1 + yearly), 12) - 1;
    }

    private double calcPayment() {
        return this.interest_rate == 0
                ? this.loan / this.number_of_payments
                : (this.loan * this.interest_rate
                * MyMaths.power((1 + this.interest_rate), this.number_of_payments))
                / (MyMaths.power((1 + this.interest_rate), this.number_of_payments) - 1);
    }

    public void print() {
        System.out.println("*".repeat(100));
        System.out.println("Prospect " + this.id
                + ": " + this.customer + " wants to borrow "
                + String.format("%.2f", this.loan)
                + " € for a period of "
                + String.format("%.0f", this.number_of_payments / 12)
                + " years and pay "
                + String.format("%.2f", this.monthly_payment)
                + " € each month");
        System.out.println("*".repeat(100));
    }
}

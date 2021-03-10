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

    public Prospect(String c, double years, double l, double i, int id_no) {
        COUNT++;
        customer = c;
        number_of_payments = years * 12;
        loan = l;
        interest_rate = MyMaths.monthlyInterestRate(i / 100);
        //interest_rate = i / 12 / 100;
        id = id_no;
        this.calcPayment();      
    }

    private void calcPayment() {
        this.monthly_payment = this.interest_rate == 0
                ? this.loan / this.number_of_payments
                : (this.loan * this.interest_rate
                * MyMaths.power((1 + this.interest_rate), this.number_of_payments))
                / (MyMaths.power((1 + this.interest_rate), this.number_of_payments) - 1);
    }

    public void print() {
        System.out.println("*".repeat(100));
        System.out.println("Prospect " + this.id
                + ": " + this.customer + " wants to borrow " + this.loan + " € "
                + "for a period of " + this.number_of_payments / 12
                + " years and pay " + this.monthly_payment + " € each month");
        System.out.println("*".repeat(100));
    }
}

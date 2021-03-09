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

    private int id;
    private String customer;
    private double loan;
    private double interest;
    private double number_of_payments;
    private double monthly_payment;

    public Prospect(String c, double years, double l, double i, int id_no) {
        customer = c;
        number_of_payments = years * 12;
        loan = l;
        interest = i / 12; // monthly interest
        id = id_no;
        System.out.println("Prospect created: ");
        System.out.println("Name: " + customer);
        System.out.println("Loan: " + loan);
        System.out.println("Interest: " + interest);
        System.out.println("Payments: " + number_of_payments);

    }

    public void calcPayment() {
        this.monthly_payment
                = (this.loan * this.interest
                * MyMaths.power((1 + this.interest), this.number_of_payments))
                / (MyMaths.power((1 + this.interest), this.number_of_payments) - 1);
    }

    public void print() {
        System.out.println("Prospect " + this.id 
            + ": " + this.customer + " wants to borrow " + this.loan + " € "
            + "for a period of " + this.number_of_payments / 12 
            + " years and pay " + this.monthly_payment + " € each month");
    }
}

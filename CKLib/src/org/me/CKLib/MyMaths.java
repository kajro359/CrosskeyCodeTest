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
public class MyMaths {

    public static double abs(double num) {
        return num > 0 ? num : num * -1;
    }

    // TODO: make capable of handling fractional exponent
    public static double power(double val, double exp) {
        double result = val;
        if (exp != 0) {
            for (int i = 0; i < abs(exp); i++) {
                result *= i > 0 ? val : 1;
            }
            return exp > 0 ? result : 1 / result;
        } else {
            return 1;
        }
    }
    
    public static double monthlyInterest(double yearly) {
        return (1 + )
    }

}

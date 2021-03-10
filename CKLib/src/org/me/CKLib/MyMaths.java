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

    public static double round(double num) {
        return num % 1 > 0.5 ? ceil(num) : floor(num);
    }
    
    public static double ceil(double num) {
        return floor(num) + 1;
    }
    
    public static double floor(double num) {
        return num - num % 1;
    }

    public static double abs(double num) {
        return num > 0 ? num : num * -1;
    }

    // Find approximate n:th root of x using binary search.
    // Adapted from https://www.geeksforgeeks.org/calculating-n-th-real-root-using-binary-search/
    public static double findRoot(double x, int n) {
        double low, high;
        if (x >= 0 && x <= 1) {
            low = x;
            high = 1;
        } else {
            low = 1;
            high = x;
        }        
        double epsilon = 0.0000001;
        
        // Do binary search
        double guess = (low + high) / 2;
        while (abs(power(guess, n) - x) >= epsilon) {
            if (power(guess, n ) > x) {
                high = guess;
            }
            else {
                low = guess;
            }
            guess = (low + high) / 2;
        }
        return guess;
    }

    private static double powLoop(double a, double k) {
        double res = 1;
        for (int i = 0; i < abs(k); i++) {
            res *= a;
        }        
        return res;
    }

    // TODO: make capable of handling fractional exponent
    // will only handle rational exponent
    public static double power(double val, double exp) {
        if (exp != 0) {
            double result = powLoop(val, floor(exp));
            return exp > 0 ? result : 1 / result;
        } else {
            return 1;
        }
    }

    public static double monthlyInterestRate(double yearly) {
        return findRoot((1 + yearly), 12) - 1;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ckapp;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.Scanner;
import org.me.CKLib.CKLib;
import org.me.CKLib.MyMaths;
import org.me.CKLib.Prospect;

/**
 *
 * @author kaj
 */
public class CKApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // String path = "../Data/prospects.txt";
        Prospect p = new Prospect("Jessica", 30, 300000, 5, 1);
        p.print();
//        double b = 2;
//        double c = -2;
//        double a = MyMaths.power(b, c);
//        System.out.println(b + "^" + c + " = " + a);
//        System.out.println("Flooring 2: " + MyMaths.floor(2));
//        
//        double d = 16;
//        int n = 4;
//        System.out.println("root = " + MyMaths.findRoot(d, n));
        
        
    }   
}

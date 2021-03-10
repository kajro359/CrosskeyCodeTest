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
import java.io.File;
import java.util.Scanner;
//import org.me.CKLib.CKLib;
//import org.me.CKLib.MyMaths;
import org.me.CKLib.Prospect;

/**
 *
 * @author kaj
 */
public class CKApp {

    private static String cleanString(String s) {
        
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Prospect p = new Prospect("Jessica", 30, 300000, 5, 1);
        // p.print();          
        String path = "../Data/prospects.txt";
        String line = "";
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter("\n");
        while (sc.hasNext()) {
            line = sc.next();
            
            System.out.println(line);
        }
    }
}

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
import org.me.CKLib.CKLib;
//import org.me.CKLib.MyMaths;
import org.me.CKLib.Prospect;

/**
 *
 * @author kaj
 */
public class CKApp {

//    private static String cleanString(String s) {
//        
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Prospect p = new Prospect("Jessica", 30, 300000, 5, 1);
        // p.print();
       
        String line = "\"Clarencé,Andersson\",2000,6,4";
        System.out.println(line);
        String cleanLine = CKLib.cleanLine(line);
        
        
        
//        String path = "../Data/prospects.txt";
//        String line = "";
//        Scanner sc = new Scanner(new File(path));
//        sc.useDelimiter("\n");
//        
//        while (sc.hasNext()) {
//            line = sc.next();
//
//            if(!line.matches("^[A-Za-zÅÄÖåäöÉéÜüß]*.[A-Za-zÅÄÖ*åäöÉéÜüß]*,"
//                    + "[0-9]*.[0-9]*,[0-9]*.[0-9]*,[0-9]*")) {
//                System.out.println("Cleaning line...");
//                line = CKLib.cleanLine(line);
//                //System.out.println(line);        
//            }             
//       
//
//            System.out.println(line);
            // split the line into name, loan, interest, years
            // instanciate prospect

            //System.out.println(a);
//            String[] data = line.split("[,]");
//            
//            for(String w: data) {
//                System.out.print(w+ " ");
//            }
//            System.out.println("\n");
//        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ckapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
// import org.me.CKLib.CKLib;

/**
 *
 * @author kaj
 */
public class CKApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String path = "../Data/prospects.txt";
        // number, name, loan, interest, years, (payment)
        String[] prospect = {"", "", "", "", "", ""};
        String line = "";
        int len = 0;
        int lineNumber = 0;
        System.out.println("READING FILE...");
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println("line: " + lineNumber);
            if (lineNumber > 0 && line.length() > 1) {
                prospect[0] = String.valueOf(lineNumber);
                System.out.println("DATA[0] :" + data[0]);
                len = data.length;
                for (int i = len - 1; i >= 0; i--) {
                    prospect[i + 1] = data[i];
                }
                prospect[5] = "PAYMENT";
//                System.out.println("Prospect " + prospect[0]
//                    + ": " + prospect[1] + "wants to borrow " + prospect[2]
//                    + " € for a period of " + prospect[4] 
//                    + " years and pay " + prospect[5] 
//                    + " € each month"
//                );
                for (int i = 0; i < 6; i++) {
                    System.out.println(prospect[i]);
                }
                System.out.println("--------------------");
            } else {

            }
            lineNumber++;
        }
    }

}

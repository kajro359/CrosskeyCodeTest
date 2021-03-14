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
import java.util.stream.Stream;
import org.me.CKLib.CKLib;
//import org.me.CKLib.MyMaths;
import org.me.CKLib.Prospect;

/**
 *
 * @author kaj
 */
public class CKApp {

    public static void main(String[] args) throws Exception {
        String path = args[0]; //path to input file
        String line = "";
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter("\n");
        String data_string = "";

        while (sc.hasNext()) {
            line = sc.next();
            if (!CKLib.checkLine(line)) {
                line = CKLib.cleanLine(line);
            }
            data_string += line + "\n";
        }
        int count = 0;
        data_string = data_string.trim();
        String prospect_data = "";
        String[] lines = data_string.split("\\n");
        Prospect[] prospects = new Prospect[lines.length];
        for (String l : lines) {
            prospect_data = l + String.format(",%d", count + 1);
            prospects[count] = new Prospect(prospect_data);
            count++;
        }
        for (Prospect p : prospects) {
            p.print();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.CKLib;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author kaj
 */
public class CKLib {

    public static void testScan() throws Exception {
        String path = "../Data/prospects.txt";
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            System.out.println(sc.next());
            System.out.println("");
        }
    }

    public static String cleanLine(String line) {
        return line;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.CKLib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kaj
 */
public class CKLib {

    private static char[] extractChars(String s, int ind0, int ind1) {
        char[] ret = new char[ind1];
        s.getChars(ind0, ind1, ret, 0);
        return ret;
    }

    public static String cleanLine(String line) {
        // String a = line.replaceAll("[^A-Za-zÅÄÖåäöé0-9,]", "?");        
        String a = "";
        Pattern p = Pattern.compile("[A-Za-zÅÄÖåäöÉéÜüß]+."
                + "[A-Za-zÅÄÖåäöÉéÜüß]*");

        Matcher m = p.matcher(line);

        if (m.find()) {
            int ind0 = m.start();
            int ind1 = m.end();
            System.out.println("INDICES: " + ind0 + ", " + ind1);

            String name = "";
            char[] nm = extractChars(line, ind0, ind1);
            for (char c : nm) {
                System.out.print(c);
                name += c;
            }
            name = name.replaceAll("[^A-Za-zÅÄÖåäöÉéÜüß]", " ");
            name = name.strip();
            System.out.println("Made name-string: \n" + name);
            a += name;
            // get numbers
            char[] nums = extractChars(line, ind1 + 1, line.length());
            for (char c : nums) {
                System.out.print(c);
                a += c;
            }

        }

        System.out.println("\n" + a);

        return a;
    }

}

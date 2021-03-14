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

    public static boolean checkLine(String l) {
//        return l.matches("^[A-Za-zÅÄÖåäöÉéÜüß]*.[A-Za-zÅÄÖ*åäöÉéÜüß]*,"
//                + "[0-9]+\\.?[0-9]*,[0-9]+\\.?[0-9]*,[0-9]+");
        return l.matches("^[\\p{Alpha}]*.[\\p{Alpha}]*,"
                + "[0-9]+\\.?[0-9]*,[0-9]+\\.?[0-9]*,[0-9]+");
    }

    public static String cleanLine(String line) {

        String a = "";
        Pattern p = Pattern.compile("[\\p{Alpha}]+.?"
                + "[\\p{Alpha}]*");

        line = line.replaceAll("[^[\\p{Alnum}|,]]", "");
        Matcher m = p.matcher(line);
        if (m.find()) {
            int ind0 = m.start();
            int ind1 = m.end();
            String name = "";
            char[] nm = extractChars(line, ind0, ind1);
            for (char c : nm) {
                name += c;
            }            
            name = name.replaceAll("[^\\p{Alpha}]", " ");
            if (name.endsWith(" ")) {
                name = name.replace(" ",",");
            }
            a += name;
            // get numbers
            char[] nums = extractChars(line, ind1, line.length());
            for (char c : nums) {
                a += c;
            }
            a = a.trim();
        }
        return checkLine(a) ? a : "";
    }

}

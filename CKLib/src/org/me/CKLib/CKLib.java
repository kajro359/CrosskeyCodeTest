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
    
    private static String ALPHAS ="A-Za-zÅÄÖåäöÉéÜüß";

    private static char[] extractChars(String s, int ind0, int ind1) {
        char[] ret = new char[ind1];
        s.getChars(ind0, ind1, ret, 0);
        return ret;
    }

    public static boolean checkLine(String l) {
        return l.matches("^["+ALPHAS+"]*.["+ALPHAS+"]*,"
                + "[0-9]+\\.?[0-9]*,[0-9]+\\.?[0-9]*,[0-9]+");
    }

    public static String cleanLine(String line) {

        String a = "";
        Pattern p = Pattern.compile("["+ALPHAS+"]+.?"
                + "["+ALPHAS+"]*");

        line = line.replaceAll("[^"+ALPHAS+"0-9,.\\p{Blank}]", "");
        
        Matcher m = p.matcher(line);
        if (m.find()) {
            int ind0 = m.start();
            int ind1 = m.end();
            String name = "";
            char[] nm = extractChars(line, ind0, ind1);
            for (char c : nm) {
                name += c;
            }            
            name = name.replaceAll("[^"+ALPHAS+"]", " ");
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

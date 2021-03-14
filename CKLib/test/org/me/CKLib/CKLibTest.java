/*
 * Copyright (C) 2021 kaj
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.me.CKLib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kaj
 */
public class CKLibTest {
    
    public CKLibTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkLine method, of class CKLib.
     */
    @Test
    public void testCheckLine() {
        System.out.println("checkLine");
        String l = "abcd,asdc,1,1";
        boolean expResult = false;
        boolean result = CKLib.checkLine(l);
        assertEquals(expResult, result);
    }

    /**
     * Test of cleanLine method, of class CKLib.
     */
    @Test
    public void testCleanLine() {
        System.out.println("cleanLine");
        String line = "\"abc,12,34,5";
        String expResult = "abc,12,34,5";
        String result = CKLib.cleanLine(line);
        assertEquals(expResult, result);
    }
    
}

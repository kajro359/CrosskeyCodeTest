/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class MyMathsTest {
    
    public MyMathsTest() {
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
     * Test of round method, of class MyMaths.
     */
    @Test
    public void testRound() {
        System.out.println("round");
        double num = 1.1;
        double expResult = 1.0;
        double result = MyMaths.round(num);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of ceil method, of class MyMaths.
     */
    @Test
    public void testCeil() {
        System.out.println("ceil");
        double num = 2.333;
        double expResult = 3.0;
        double result = MyMaths.ceil(num);
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of floor method, of class MyMaths.
     */
    @Test
    public void testFloor() {
        System.out.println("floor");
        double num = 2.988;
        double expResult = 2.0;
        double result = MyMaths.floor(num);
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of abs method, of class MyMaths.
     */
    @Test
    public void testAbs() {
        System.out.println("abs");
        double num = -1;
        double expResult = 1.0;
        double result = MyMaths.abs(num);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of findRoot method, of class MyMaths.
     */
    @Test
    public void testFindRoot() {
        System.out.println("findRoot");
        double x = 32;
        int n = 5;
        double expResult = 2.0;
        double result = MyMaths.findRoot(x, n);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of power method, of class MyMaths.
     */
    @Test
    public void testPower() {
        System.out.println("power");
        double val = 4.0;
        double exp = 0.0;
        double expResult = 1.0;
        double result = MyMaths.power(val, exp);
        assertEquals(expResult, result, 0.0);
    }

    
}

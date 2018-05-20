/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.Utilities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.integration.DiscountRegistry;
import se.kth.iv1350.utilities.Discount;

/**
 *
 * @author Rikard
 */
public class DiscountTest {
    
    public DiscountTest() {
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
     * Test of getDiscount method, of class Discount.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        DiscountRegistry reg = new DiscountRegistry();
        Discount instance = reg.getDiscount(19931128);
        double expResult = 0.1;
        double result = instance.getDiscount();
        assertEquals(expResult, result, 0.0);

    }
    
}

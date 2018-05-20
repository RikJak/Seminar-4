/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.integration.DiscountRegistry;
import se.kth.iv1350.model.TotalPrice;
import se.kth.iv1350.utilities.AmountOfMoney;
import se.kth.iv1350.utilities.Discount;

/**
 *
 * @author Rikard
 */
public class TotalPriceTest {
    
    public TotalPriceTest() {
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
     * Test of applyDiscount method, of class TotalPrice.
     */
    @Test
    public void testApplyDiscount() {
        System.out.println("applyDiscount");
        DiscountRegistry registry = new DiscountRegistry();
        Discount discount = registry.getDiscount(19931128);
        TotalPrice instance = new TotalPrice(new AmountOfMoney(100));
        instance.applyDiscount(discount);
        AmountOfMoney expectedResult = new AmountOfMoney(12.5);
        AmountOfMoney actualResult = instance.getPrice();
       assertEquals(expectedResult, actualResult);
        
    }

    /**
     * Test of getPrice method, of class TotalPrice.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        TotalPrice instance = new TotalPrice(new AmountOfMoney(100));
        AmountOfMoney expResult = new AmountOfMoney(125);
        AmountOfMoney result = instance.getPrice();
        assertEquals(expResult, result);

    }
    
}

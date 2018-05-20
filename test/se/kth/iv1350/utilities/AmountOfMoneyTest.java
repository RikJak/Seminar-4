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
import se.kth.iv1350.utilities.AmountOfMoney;

/**
 *
 * @author Rikard
 */
public class AmountOfMoneyTest {
    
    public AmountOfMoneyTest() {
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
     * Test of getAmount method, of class AmountOfMoney.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        AmountOfMoney instance = new AmountOfMoney(0);
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getCurrency method, of class AmountOfMoney.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        AmountOfMoney instance = new AmountOfMoney(0);
        String expResult = "sek";
        String result = instance.getCurrency();
        assertEquals(expResult, result);

    }

    /**
     * Test of updateAmount method, of class AmountOfMoney.
     */
    @Test
    public void testUpdateAmount() {
        System.out.println("updateAmount");
        double newAmount = 2.0;
        AmountOfMoney instance = new AmountOfMoney(-2);
        instance.updateAmount(newAmount);
        assertEquals(instance.getAmount(), 2,0);
    }

    /**
     * Test of add method, of class AmountOfMoney.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AmountOfMoney addition = new AmountOfMoney(2);
        AmountOfMoney instance = new AmountOfMoney(-2);
        instance.add(addition);
        double result = instance.getAmount();
        assertEquals(result, 0,0);
    }
    
}

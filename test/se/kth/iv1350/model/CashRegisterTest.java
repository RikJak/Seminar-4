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
import se.kth.iv1350.model.CashRegister;
import se.kth.iv1350.utilities.AmountOfMoney;

/**
 *
 * @author Rikard
 */
public class CashRegisterTest {
    
    public CashRegisterTest() {
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
     * Test of registerPayment method, of class CashRegister.
     */
    @Test
    public void testRegisterPayment() throws Exception {
        System.out.println("registerPayment");
        AmountOfMoney amountPaid = new AmountOfMoney(1000);
        AmountOfMoney finalPrice = new AmountOfMoney(999);
        AmountOfMoney startingBalance = new AmountOfMoney(1000);
        CashRegister instance = new CashRegister(startingBalance);
        AmountOfMoney expResult = new AmountOfMoney(1);
        AmountOfMoney result = instance.registerPayment(amountPaid, finalPrice);
        assertEquals(expResult, result);

    }

    /**
     * Test of updateBalance method, of class CashRegister.
     */
    @Test
    public void testUpdateBalance(){
        System.out.println("UpdateBalance");
        AmountOfMoney startingBalance = new AmountOfMoney(1000);
        CashRegister instance = new CashRegister(startingBalance);
        AmountOfMoney price = new AmountOfMoney(200);
        instance.updateBalance(price);
        AmountOfMoney result = instance.getBalance();
        startingBalance.add(price);
        assertEquals(startingBalance.getAmount(), result.getAmount(),0);
    }

    /**
     * Test of getBalance method, of class CashRegister.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        CashRegister instance = new CashRegister(new AmountOfMoney(100));
        AmountOfMoney expResult = new AmountOfMoney(100);
        AmountOfMoney result = instance.getBalance();
        assertEquals(expResult, result);

    }
    
}

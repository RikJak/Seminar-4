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
import se.kth.iv1350.integration.Item;
import se.kth.iv1350.integration.ItemDescription;
import se.kth.iv1350.model.SoldItems;
import se.kth.iv1350.utilities.AmountOfMoney;

/**
 *
 * @author Rikard
 */
public class SoldItemsTest {
    
    public SoldItemsTest() {
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
     * Test of add method, of class SoldItems.
     */

    /**
     * Test of add method, of class SoldItems.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Item lastScannedItem = new Item(111,new ItemDescription("This is a car"),new AmountOfMoney(10000),"Vehicle");
        Item otherItem = new Item(1111,new ItemDescription("This is not a car"),new AmountOfMoney(100000000),"Vehicle");
        SoldItems instance = new SoldItems();
        instance.add(lastScannedItem);
        instance.add(otherItem);
        instance.add(lastScannedItem);
        int result = instance.getQuantity(lastScannedItem);
        
        assertEquals(result, 2);
    }

    /**
     * Test of toString method, of class SoldItems.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Item lastScannedItem = new Item(111,new ItemDescription("This is a car"),new AmountOfMoney(10000),"Vehicle");
        Item otherItem = new Item(1111,new ItemDescription("This is not a car"),new AmountOfMoney(100000000),"Vehicle");
        SoldItems instance = new SoldItems();
        instance.add(lastScannedItem);
        instance.add(otherItem);
        instance.add(lastScannedItem);
        
        String expResult = "This is a car x2\nThis is not a car x1\n";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}

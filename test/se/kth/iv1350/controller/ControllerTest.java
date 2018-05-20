/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.controller.Controller;
import se.kth.iv1350.integration.Item;
import se.kth.iv1350.integration.ItemNotFoundException;
import se.kth.iv1350.integration.Printer;
import se.kth.iv1350.integration.RegistryCreator;
import se.kth.iv1350.model.CashRegister;
import se.kth.iv1350.model.Sale;
import se.kth.iv1350.utilities.AmountOfMoney;
import se.kth.iv1350.utilities.SaleDTO;
import se.kth.iv1350.utilities.TotalPriceDTO;

/**
 *
 * @author Rikard
 */
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of scanItem method, of class Controller.
     */
    @Test
    public void testScanItem_int_int() throws Exception {
        System.out.println("scanItem");
        int quantity = 1;
        int itemID = 111;
        RegistryCreator registries = new RegistryCreator();
        Printer printer = new Printer();
        Controller instance = new Controller(registries, printer);
        instance.startNewSale();
        
        AmountOfMoney expectedTotal = new AmountOfMoney(10000);
        Item expectedItem = registries.getItemRegistry().getItem(itemID);
        SaleDTO result = instance.scanItem(quantity, itemID);
        assertEquals(expectedItem, result.getLastSoldItem());
        assertEquals(expectedTotal,result.getRunningTotal());

    }

    /**
     * Test of finalizeSale method, of class Controller.
     */
    @Test
    public void testFinalizeSale() {
        try{
        System.out.println("finalizeSale");
        int quantity = 1;
        int itemID = 111;
        RegistryCreator registries = new RegistryCreator();
        Printer printer = new Printer();
        Controller instance = new Controller(registries, printer);
        instance.startNewSale();
        instance.scanItem(quantity, itemID);
        AmountOfMoney expectedTotal = new AmountOfMoney(12500);
        
        TotalPriceDTO result = instance.finalizeSale();
        assertEquals(expectedTotal, result.getTotalPrice());
        }catch(ItemNotFoundException e){
            System.err.println(e);
        }
    }

    /**
     * Test of pay method, of class Controller.
     */
    @Test
    public void testPay() throws Exception {
        System.out.println("pay");
        AmountOfMoney paidAmount = new AmountOfMoney(12501);
        int quantity = 1;
        int itemID = 111;
        RegistryCreator registries = new RegistryCreator();
        Printer printer = new Printer();
        Controller instance = new Controller(registries, printer);
        instance.startNewSale();
        instance.scanItem(quantity, itemID);
        instance.finalizeSale();
        AmountOfMoney expResult = new AmountOfMoney(1);
        AmountOfMoney result = instance.pay(paidAmount);
        assertEquals(expResult, result);
        
    }
    
}

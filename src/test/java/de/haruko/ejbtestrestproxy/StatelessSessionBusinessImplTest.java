/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.haruko.ejbtestrestproxy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefanhahn
 */
public class StatelessSessionBusinessImplTest {
    
    public StatelessSessionBusinessImplTest() {
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
     * Test of hello method, of class StatelessSessionBusinessImpl.
     */
    @Test
    public void testHello() {
        System.out.println("hello");
        StatelessSessionBusinessImpl instance = new StatelessSessionBusinessImpl();
        String expResult = "ich sage hello";
        String result = instance.hello();
        assertEquals(expResult, result);
    }

    /**
     * Test of sayWhat method, of class StatelessSessionBusinessImpl.
     */
    @Test
    public void testSayWhat() {
        System.out.println("sayWhat");
        String what = "das";
        Mobiledevice mobiledevice = new Mobiledevice();
        mobiledevice.setMdevName("testname");
        StatelessSessionBusinessImpl instance = new StatelessSessionBusinessImpl();
        String expResult = "das device testname";
        String result = instance.sayWhat(what, mobiledevice);
        assertEquals(expResult, result);
    }
    
 
}

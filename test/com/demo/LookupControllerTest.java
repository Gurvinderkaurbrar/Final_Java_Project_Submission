/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CYRIL
 */
public class LookupControllerTest {
    
    public LookupControllerTest() {
    }
    
    
    /**
     * Test of getAll method, of class LookupController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Lookup> l = new ArrayList<>();
        LookupController instance = new LookupController();
        List<Lookup> expResult = null;
        List<Lookup> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

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
public class LookupTest {
    
    public LookupTest() {
    }
    

    /**
     * Test of getInfoId method, of class Lookup.
     */
    @Test
    public void testGetInfoId() {
        System.out.println("getInfoId");
        Lookup instance = new Lookup();
        instance.setInfoId(1);
        int expResult = 1;
        int result = instance.getInfoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInfoId method, of class Lookup.
     */
    @Test
    public void testSetInfoId() {
        System.out.println("setInfoId");
        int infoId = 1;
        Lookup instance = new Lookup();
        instance.setInfoId(infoId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBizName method, of class Lookup.
     */
    @Test
    public void testGetBizName() {
        System.out.println("getBizName");
        Lookup instance = new Lookup();
        instance.setBizName("company");
        String expResult = "company";
        String result = instance.getBizName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBizName method, of class Lookup.
     */
    @Test
    public void testSetBizName() {
        System.out.println("setBizName");
        String bizName = "company";
        Lookup instance = new Lookup();
        instance.setBizName(bizName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Lookup.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Lookup instance = new Lookup();
        instance.setAddress("125 street");
        String expResult = "125 street";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Lookup.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "125 street";
        Lookup instance = new Lookup();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getFirtName method, of class Lookup.
     */
    @Test
    public void testGetFirtName() {
        System.out.println("getFirtName");
        Lookup instance = new Lookup();
        instance.setFirtName("bob");
        String expResult = "bob";
        String result = instance.getFirtName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirtName method, of class Lookup.
     */
    @Test
    public void testSetFirtName() {
        System.out.println("setFirtName");
        String firtsName = "bob";
        Lookup instance = new Lookup();
        instance.setFirtName(firtsName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Lookup.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Lookup instance = new Lookup();
        instance.setLastName("xyz");
        String expResult = "xyz";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Lookup.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "xyz";
        Lookup instance = new Lookup();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Lookup.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Lookup instance = new Lookup();
        instance.setEmail("xyz@yahoo.com");
        String expResult = "xyz@yahoo.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Lookup.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "xyz@yahoo.com";
        Lookup instance = new Lookup();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContactNo method, of class Lookup.
     */
    @Test
    public void testGetContactNo() {
        System.out.println("getContactNo");
        Lookup instance = new Lookup();
        instance.setContactNo("1234567");
        String expResult = "1234567";
        String result = instance.getContactNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContactNo method, of class Lookup.
     */
    @Test
    public void testSetContactNo() {
        System.out.println("setContactNo");
        String contactNo = "1234567";
        Lookup instance = new Lookup();
        instance.setContactNo(contactNo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Lookup.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Lookup instance = new Lookup();
        instance.setImage("/img/xyz.jpg");
        String expResult = "/img/xyz.jpg";
        String result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class Lookup.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        String image = "/img/xyz.jpg";
        Lookup instance = new Lookup();
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lookup.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Lookup instance = new Lookup(1,"company","125 street","bob","xyz","xyz@yahoo.com","1234567","image");
        String expResult = "{ \"info_id\" : 1, \"biz_name\" : \"company\", \"address\" : \"125 street\", \"first_name\" : \"bob\", \"last_name\" : \"xyz\", \"email\" : \"xyz@yahoo.com\", \"contact_no\" : \"1234567\", \"image\" : \"image\"}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

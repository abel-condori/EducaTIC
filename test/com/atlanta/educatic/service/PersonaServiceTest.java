/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.pojo.Persona;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nerio
 */
public class PersonaServiceTest {
    
    public PersonaServiceTest() {
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
     * Test of create method, of class PersonaService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Persona x = null;
        PersonaService instance = new PersonaService();
        int expResult = 0;
        int result = instance.create(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PersonaService.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        int id = 1;
        PersonaService instance = new PersonaService();
        Persona expResult = null;
        Persona result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PersonaService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Persona x = null;
        PersonaService instance = new PersonaService();
        int expResult = 0;
        int result = instance.update(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PersonaService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Persona x = null;
        PersonaService instance = new PersonaService();
        int expResult = 0;
        int result = instance.delete(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class PersonaService.
     */
    @Test
    public void testList() {
        System.out.println("list");
        PersonaService instance = new PersonaService();
        List<Persona> expResult = null;
        List<Persona> result = instance.list();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class PersonaService.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Map mapa = null;
        PersonaService instance = new PersonaService();
        Persona expResult = null;
        Persona result = instance.get(mapa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

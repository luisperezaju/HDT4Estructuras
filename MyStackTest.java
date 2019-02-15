/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *

 */
public class MyStackTest {
    
    /*public MyStackTest() {
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
     * Test of push method, of class MyStack.
     */
    /*@Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        MyStack instance = new MyStack();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class MyStack.
     */
    /*@Test
    public void testPop() {
        System.out.println("pop");
        MyStack instance = new MyStack();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class MyStack.
     */
    /*@Test
    public void testPeek() {
        System.out.println("peek");
        MyStack instance = new MyStack();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class MyStack.
     */
    /*@Test
    public void testEmpty() {
        System.out.println("empty");
        MyStack instance = new MyStack();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MyStack.
     */
    /*@Test
    public void testSize() {
        System.out.println("size");
        MyStack instance = new MyStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
        public void testPush() {
            MyStack<Integer> fifo = new MyStack<>();
            fifo.push(10);
            int a=fifo.peek();
            assertEquals(a,10);
        }
    @Test
        public void testPop() {
            MyStack<Integer> fifo = new MyStack<>();
            fifo.push(10);
            fifo.push(7);
            fifo.push(3);
            fifo.push(5);
            int a=fifo.pop();
            assertEquals(a,5);
        }
    @Test
        public void testSize() {
            MyStack<Integer> fifo = new MyStack<>();
            fifo.push(10);
            fifo.push(7);
            fifo.push(3);
            fifo.push(5);
            int a=fifo.size();
            assertEquals(a,4);
        }
    @Test
        public void testEmpty() {
            MyStack<Integer> fifo = new MyStack<>();
            boolean a=fifo.empty();
            assertEquals(a,true);
        }
}

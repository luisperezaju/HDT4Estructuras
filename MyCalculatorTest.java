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
public class MyCalculatorTest {
    
    /*public MyCalculatorTest() {
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
     * Test of calculate method, of class MyCalculator.
     */
    /*@Test
    public void testCalculate() {
        System.out.println("calculate");
        int num1 = 0;
        int num2 = 0;
        String op = "";
        MyCalculator instance = new MyCalculator();
        int expResult = 0;
        int result = instance.calculate(num1, num2, op);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
        public void testsuma() {
            MyCalculator suma = new MyCalculator();
            int a= suma.calculate(2,3,"+");
            assertEquals(a,5);
        }
     @Test
        public void testresta() {
            MyCalculator resta = new MyCalculator();
            int a= resta.calculate(4,10,"-");
            assertEquals(a,6);
        }
    @Test
        public void testmulti() {
            MyCalculator multi = new MyCalculator();
            int a= multi.calculate(2,3,"*");
            assertEquals(a,6);
        }
    @Test
        public void testdivision() {
            MyCalculator division = new MyCalculator();
            int a= division.calculate(2,8,"/");
            assertEquals(a,4);
        }
}

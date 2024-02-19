/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author Alumno Tarde
 */
public class CalculadoraTest {

    static Calculadora cal;
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void before(){
        System.out.println("before()");
        cal = new Calculadora();
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int num1 = 5;
        int num2 = 5;
        int expResult = 10;
        int result = cal.sumar(num1, num2);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testRestar() {
        System.out.println("restar");
        int num1 = 19;
        int num2 = 9;
        int expResult = 10;
        int result = cal.restar(num1, num2);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test(expected = ArithmeticException.class)
    public void testDividir() {
        System.out.println("dividir");
        int num1 = 10;
        int num2 = 0;
        int expResult = 2;
        int result = cal.dividir(num1, num2);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test(timeout = 2050)
    public void testOperacionOptima() {
        System.out.println("operacionOptima");
        cal.operacionOptima();
//        fail("The test case is a prototype.");
    }

}

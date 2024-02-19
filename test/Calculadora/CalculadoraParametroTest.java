/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alumno Tarde
 */
@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

    private int a, b, expected;
    static Calculadora cal;

    public CalculadoraParametroTest(int a, int b, int exp) {
        this.a = a;
        this.b = b;
        this.expected = exp;
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            //Poner las pruebas necesarias
            {2, 1, 3}, {10, 10, 20}
        });
    }

    @BeforeClass
    public static void before() {
        System.out.println("before()");
        cal = new Calculadora();
    }

    @Test
    public void testSuma() {
        int result = cal.sumar(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int result = cal.restar(a, b);
        assertEquals(expected, result);
//        fail("The test case is a prototype.");
    }

}

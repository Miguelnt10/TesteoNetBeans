/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Edad;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alumno Tarde
 */
@RunWith(value = Parameterized.class)
public class EdadTest {
    
    private int edad;
    
    public EdadTest() {
    }

    @Test
    public void testIsMayorDeEdad() {
        System.out.println("isMayorDeEdad");
        Edad instance = null;
        boolean expResult = false;
        boolean result = instance.isMayorDeEdad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            //Poner las pruebas necesarias
            
        });
    }
    
}

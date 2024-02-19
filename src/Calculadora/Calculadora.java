/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Alumno Tarde
 */
public class Calculadora {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return num1 / num2;
    }

    public void operacionOptima() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }
}

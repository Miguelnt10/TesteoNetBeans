/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

/**
 *
 * @author Alumno Tarde
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        System.out.println("Hello World");
//        int a;
//        a = 5;
//
//        int b = 10;
//        int suma = sumaNumeros(a, b);
//        System.out.println(suma);

          int algo = 0;
          for (int i = 0; i < 10; i++) {
            algo += i;
              System.out.println(algo);
        }
    }

    public static int sumaNumeros(int a, int b) {
        int num;
        num = a + b;
        return num;
    }
}

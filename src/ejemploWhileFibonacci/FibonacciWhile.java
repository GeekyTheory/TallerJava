/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
 */
package ejemploWhileFibonacci;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class FibonacciWhile {
    public static void main(String[] args) {
        int a = 1, b = 0, n = 0, actual = 1, terminos;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de términos que desea calcular: ");
        terminos = in.nextInt();
        boolean calcular = (terminos != 0) ? true : false;
        if (calcular) {
            /*do {
                System.out.print(actual+" ");
                actual = a + b;
                b = a;
                a = actual;
                n++;
            } while(n<terminos);*/
            while(n<terminos) {
                System.out.print(actual+" ");
                actual = a + b;
                b = a;
                a = actual;
                n++;
            }
        } else {
            System.out.println("Si no quiere calcular la Serie de Fibonacci, ¿para qué ejecuta el programa?");
        }
    }
}

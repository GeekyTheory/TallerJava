/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EjemploCondicional_ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Introduzca el primer numero: ");
        numero1 = in.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        numero2 = in.nextInt();
        if(numero1>numero2) {
            System.out.println("El primer número introducido es mayor.");
        } else if(numero1<numero2) {
            System.out.println("El segundo número introducido es mayor.");
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}

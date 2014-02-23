/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
 */
package numerosAmigos;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Introduzca el primer número: ");
        numero1 = in.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = in.nextInt();
        Amigos amigos = new Amigos(numero1, numero2);
        if(amigos.sonAmigos()) {
            System.out.println("Los números "+numero1+" y "+numero2+" son amigos.");
        } else {
            System.out.println("Los números "+numero1+" y "+numero2+" no son amigos.");
        }
    }
}

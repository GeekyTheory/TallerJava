/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
 */

package ejemploFactorialFor;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Factorial {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un número para calcular su factorial: ");
        int n = input.nextInt();
        int factor = 1;
        for (int i=1; i<=n; i++) {
            factor = factor*i;
        }
        System.out.println("El factorial de "+n+" es "+factor);
    }
}

/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
 */

package ejemploScanString;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class ejemploScanString {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        System.out.print("Introduzca una frase: ");
        frase = in.nextLine();
        System.out.println("El String introducido es: "+frase);
    }
    
}

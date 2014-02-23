/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

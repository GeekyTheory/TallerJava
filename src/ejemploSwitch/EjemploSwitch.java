/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
 */
package ejemploSwitch;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char apuesta;
        System.out.print("Bienvenido a la quiniela.\n"
                + "Introduzca el resultado del Real Madrid-Barcelona (1/x/2): ");
        apuesta = in.next().charAt(0);
        switch(apuesta) {
            case '1':
                System.out.println("Ha apostado a favor del Real Madrid. ¡Buena suerte!");
                break;
            case 'x':
                System.out.println("Ha apostado por el empate. ¡Buena suerte!");
                break;
            case '2':
                System.out.println("Ha apostado a favor del Barcelona. ¡Buena suerte!");
                break;
            default:
                System.out.println("Opción incorrecta. Seleccione 1/x/2.");
                break;
        }
    }
}

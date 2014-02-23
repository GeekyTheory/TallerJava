/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
 */
package ejemplostatic;

/**
 *
 * @author mario
 */
public class EjemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuarios user1 = new Usuarios();
        Usuarios user2 = new Usuarios();
        System.out.println(Usuarios.cantidad);
        Usuarios user3 = new Usuarios();
        System.out.println(Usuarios.cantidad);
    }
    
}

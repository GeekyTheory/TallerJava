/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

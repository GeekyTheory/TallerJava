/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploLeerFecha;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class LectorFecha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fecha;
        System.out.print("Introduzca una fecha [dd/mm/aaaa]: ");
        fecha = in.nextLine();
        //Aquí comprobaríamos que tiene el formato correcto antes de crear el objeto
        ObjetoFecha miFecha = new ObjetoFecha(fecha);
        System.out.println("La fecha introducida es: "+miFecha.getFecha());
        //Aquí voy a modificar una variable de fecha (como el setVar que has dicho).
        miFecha.año = "2049";
        System.out.println("La fecha modificada es: "+miFecha.getFecha());
    }
}

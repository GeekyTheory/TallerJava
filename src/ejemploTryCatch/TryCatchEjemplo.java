package ejemploTryCatch;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class TryCatchEjemplo {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int numero, resto;
        System.out.print("Introduzca un número entero: ");
        try{
            numero=reader.nextInt();
            resto=numero%2;
            if(resto==0){
                System.out.println("El número "+numero+" es par.");
            } else {
                System.out.println("El número "+numero+" es impar.");
            }
        } catch (Exception exception){
            System.out.println("Por favor, introduzca un número entero. Gracias.");
        }
    }
}

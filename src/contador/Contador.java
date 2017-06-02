/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Pc
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader intro = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        do {
            try {
                System.out.println("Ingrese un numero entre 1 y 10");
                numero = Integer.parseInt(intro.readLine());
                if (numero < 1 || numero > 10) {
                    System.out.println("Numero ingresado demaciado bajo o alto, por favor ingrese un numero entre 1 y 10");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Datos ingresados no validos");
            }
        } while (numero < 1 || numero > 10);
        System.out.println("\nLos numeros hasta el numero " + numero + " son:\n");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}

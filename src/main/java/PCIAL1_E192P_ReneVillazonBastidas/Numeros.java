/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCIAL1_E192P_ReneVillazonBastidas;

/**
 *
 * @author rune0
 */
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contTotal = 0;
        int contMayoresF = 0;
        int contPares = 0;
        int contImpares = 0;

        do {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            if (numero < 11) {
                if (numero < 0) {
                    scanner.close();
                    break;
                }
                if (numero > 5) {
                    contMayoresF++;
                }
                if (numero % 2 == 0) {
                    contPares++;
                }
                if (numero % 2 != 0) {
                    contImpares++;
                }

                contTotal++;
            } else {
                System.out.println("Por favor ingresar un numero entre 0 y 10, o un numero negativo para terminar");
            }
        } while (true);

        System.out.println("Se introdujeron " + contTotal + " números en total.\n"
                + "Se introdujeron " + contMayoresF + " números mayores a 5.\n"
                + "Se introdujeron " + contPares + " números pares.\n"
                + "Se introdujeron " + contImpares + " números impares.\n");
    }
}

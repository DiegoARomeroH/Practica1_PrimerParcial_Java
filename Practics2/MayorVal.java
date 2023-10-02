package Practics2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MayorVal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce el tamaño total del arreglo: ");
        int tam = Integer.parseInt(reader.readLine());
        int[] arreglo = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Introduce el valor seleccionado " + (i) + ": ");
            arreglo[i] = Integer.parseInt(reader.readLine());
        }

        int max = arreglo[0];
        int min = arreglo[0];
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < tam; i++) {

            if (arreglo[i] > max) {
                max = arreglo[i];
            }

            if (arreglo[i] < min) {
                min = arreglo[i];
            }

            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {

                impares++;
            }
        }

        System.out.println();
        System.out.println("El valor máximo es: " + max);
        System.out.println();
        System.out.println("El valor mínimo es: " + min);
        System.out.println();
        System.out.println("Hay un total de " + pares + " valores pares en el arreglo.");
        System.out.println();
        System.out.println("Hay un total de " + impares + " valores impares en el arreglo.");
    }
}
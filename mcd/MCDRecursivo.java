import java.util.Scanner;

public class MCDRecursivo {
    public static void main(String[] args) {
        System.out.println("Este es un programa que calcúla el MAXIMO COMO UN DIVISOR de dos números");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el primer Valor:");
            int num1 = scanner.nextInt();

            System.out.println("Ingresa el segundo Valor:");
            int num2 = scanner.nextInt();

            int mcd = calcularMCD(num1, num2);
            System.out.println("El Máximo Como un Divisor de " + num1 + " y " + num2 + " es: " + mcd);
        }
    }

    public static int calcularMCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calcularMCD(num2, num1 % num2);
        }
    }
}

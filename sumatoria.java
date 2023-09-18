import java.util.Scanner;

public class sumatoria {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el limite inferior:");
            int LimiteInf = scanner.nextInt();

            System.out.println("Ingresa el limite superior:");
            int LimiteSup = scanner.nextInt();

            int sumatoria = calcularSumatoria(LimiteInf, LimiteSup);

            System.out.println("La sumatoria de los cuadrados es igual a: " + sumatoria);
        }
    }


    private static int calcularSumatoria(int LimiteInf, int LimiteSup) {
        if (LimiteInf > LimiteSup) {

            return 0;

        } else {

            int alcuadrado = LimiteInf * LimiteInf;
            return alcuadrado + calcularSumatoria(LimiteInf + 1, LimiteSup);
            
        }
    }
}
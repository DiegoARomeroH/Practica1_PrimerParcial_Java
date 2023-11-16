import java.util.Scanner;

public class CuadroMag {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el Número de Filas de la Matriz: ");
            int filas = scanner.nextInt();
            
            System.out.print("Ingrese el Número de Columnsa de la Matriz: ");
            int columnas = scanner.nextInt();
            
            if (filas != columnas) {
                System.out.println("No es una Matriz Cuadrada");
                return;
            }
            
            int[][] matriz = new int[filas][columnas];
            
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("Ingrese el valor de la posición [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
            
            System.out.println();
            System.out.println("Matriz Ingresada:");
            mostrarMatriz(matriz);
            
            if (esCuadroMagico(matriz)) {
                System.out.println("Es un cuadro mágico");
            } else {
                System.out.println("No es un cuadro mágico");
            }
        }
    }
    
    public static boolean esCuadroMagico(int[][] matriz) {
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        
        int tamano = matriz.length;
        int sumaTotal = tamano * (tamano * tamano + 1) / 2;
        
        for (int i = 0; i < tamano; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            
            for (int j = 0; j < tamano; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            
            if (sumaFila != sumaTotal || sumaColumna != sumaTotal) {
                return false;
            }
            
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][tamano - i - 1];
        }
        
        if (sumaDiagonalPrincipal != sumaTotal || sumaDiagonalSecundaria != sumaTotal) {
            return false;
        }

        System.out.println();
        System.out.println( "La suma del cuadro es : " + sumaTotal);

        return true;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
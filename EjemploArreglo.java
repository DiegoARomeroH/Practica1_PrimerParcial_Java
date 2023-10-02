import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjemploArreglo {
    public static double calcularPromedioGrupo(double[] p){
        double suma = 0;
        for(int i=0; i < p.length; i++ )
            suma = suma + p[i];

        return suma /p.length;
    
    }

    // Regresa un double y recibe un arreglo dwe double como parámetros
    public static void main(String[]ars)  throws IOException {
        final int T= 5; // declaro una constante
        double PromedioGrupo;

        // Para abrir un bufer de entrada
        BufferedReader bufer =  new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // DEclarando y construyendo arreglo
        int[] arreglo = new int [5];

        // Un arreglo de chars
        char[] caracteres = new char[T];

        // Declaracion, construir e inicializar un aarreglo doubl
        double[] promedios = {9.1,8.6,7.4,5.3,9.2,6.5};

        //Declaración de un arreglo de valores booleanos
        boolean[] datos;
        int t; // Tamaño variable de arreglos
        
        double[] decimal = new double [T];

        // inicializamos todas las casillas del arreglo en 0
        for (int i=0; i<5; i++)
        arreglo[i] = 0;

        // Asi no se puede imprimir el contenido de un arreglo
        // System.out.println("Arreglo:");
        // System.out.println(arreglo);
        
        // Asi se imrpime el contenido de un arreglo
        System.out.println("Contenido del Arreglo");
        for(int i= 0; i < arreglo.length; i++)
        System.out.println("arreglo["+i+"] = " + arreglo[i]);

        // Leer los valores del arreglo caracteres
        System.out.println("Escribe los valores del arreglo caracteres");
        for (int i = 0; i <T; i++ ){
            System.out.println("Escribe el valor [" + i+ "]:");
            
            entrada = bufer.readLine();
            caracteres[i] = entrada.charAt(0);
        }

        System.out.println("Contenido del Arreglo caracteres");
        for(int i= 0; i < caracteres.length; i++)
        System.out.println("caracteres["+i+"] = " + caracteres[i]);

        System.out.println("Escribe el tamaño del arreglo de datos: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        datos = new boolean[t]; // Construimos el arreglo de datos con el tamaño t

        // Rellenar los datos con valores booleanos
        for (int i=0; i < t; i++)  {
            System.out.println("Escribe el valor ["+i+"] de datos" );
            entrada = bufer.readLine();
            datos[i] = Boolean.parseBoolean(entrada);
        }
        // Mostrando los valores del arreglo datos, usaando for extendido
        for (boolean unDato: datos )
        System.out.println("Valor"+ unDato);

        promedioGrupo = calcularPromedioGrupo(promedios);


        System.out.println("Escribe el tamaño del arreglo de datos: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        for (int i=0; i < t; i++)  {
            System.out.println("Escribe el valor ["+i+"] de datos" );
            entrada = bufer.readLine();
            decimal[i] = Double.parseDouble(entrada);
        }

        for (double decimales : decimal) {
    if (decimales != 0) {
        System.out.println("Valores " + decimales);
            }
        }

    

    }
}
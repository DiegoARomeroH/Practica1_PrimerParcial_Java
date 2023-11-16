import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static  BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        public static String entrada;
        public static ListaLigada lista = new ListaLigada();

    public static void agregar() throws IOException{
         int dato; 
         System.out.println("Escribe dato a guardar:");
         entrada = bufer.readLine();
         dato = Integer.parseInt(entrada);
         lista.add(dato);

    }

    public static void main(String[] args) throws Exception {
       
        int respuesta;

        System.out.println("Programa que manipula una Lista Ligada");
        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Agregar nodo al final");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Insertar en una posición");
            System.out.println("4. Eliminar en una posición");
            System.out.println("5. Contar nodos");
            System.out.println("6. Salir del programa");

            System.out.println("Escribe opción seleccionada: ");
            entrada = bufer.readLine();
            respuesta = Integer.parseInt(entrada);

            switch (respuesta) {
                case 1:
                    agregar();

                case 2:
                    System.out.println("--------------------------");
                    System.out.println("Contenido de la lista:");
                    lista.printList();
                    System.out.println("--------------------------");

                break;
                case 3:
                    agregar();
            
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while( respuesta != 6);
        System.out.println("Gracias por usar el programa");
    }
}

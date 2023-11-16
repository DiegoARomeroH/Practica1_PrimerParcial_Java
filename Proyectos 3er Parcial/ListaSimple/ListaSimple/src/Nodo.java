public class Nodo {
    private int dato;
    private Nodo apuntador;

    public Nodo(int valor){
        this.dato = valor;
        this.apuntador = null;
    }

    public int getDato() {
        // Regresa el dato en el nodo
        return dato;
    }

    public void setDato(int dato) {
        // Regresa el dato contenido en el nodo
        this.dato = dato;
    }

    public Nodo getApuntador() {
        // Regresar a que nodo esta apuntando 
        return apuntador;
    }

    public void setApuntador(Nodo otroNodo) {
        // Modificar a donde apunta este nodo
        this.apuntador = otroNodo;
    }
}
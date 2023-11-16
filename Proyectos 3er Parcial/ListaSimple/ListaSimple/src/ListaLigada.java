public class ListaLigada {
    private Nodo head;
    private Nodo tail;
    private int length;
    
    public ListaLigada(){
        // Constructor
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty(){
        // Regresa true si la lista esta vacia
        return this.length == 0;
    }

    public int getlength(){
        return this.length;
    }

    public void add(int valor){
        Nodo nodo = new Nodo(valor);
        if ( isEmpty() ){
            // La lista está vacia
            // nodo es el primer nodo de la lista 
            head = nodo;
            tail = nodo;
            this.length++;
        }
        else {
            // Ya hay nodos en la lista 
            // Y se agregan nuevos nodos al final
            Nodo actual = tail;
            tail = nodo;
            actual.setApuntador(nodo);
            this.length++;

        }
    }

    public void printList(){
        Nodo actual = head;
        while ( actual != null ){
            System.out.println(actual.getDato());
            actual = actual.getApuntador();
        }
    }
}

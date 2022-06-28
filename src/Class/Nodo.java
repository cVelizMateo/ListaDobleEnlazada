
package Class;

public class Nodo {
    public String nomPastel;
    public Nodo siguiente ; //para el enlace al nodo siguiente
    public Nodo anterior ; // para el enlace al nodo anterior

    public String getNomPastel() {
        return nomPastel;
    }

    public void setNomPastel(String nomPastel) {
        this.nomPastel = nomPastel;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
    
}

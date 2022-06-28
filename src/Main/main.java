
package Main;

import Class.ListaDobleEnlazada;
import javax.swing.JOptionPane;

/**
 *
 * @author Christofer Véliz 
 */
public class main {
    public static void main(String[] args) {
        
        
        //codigo logico de implementacion aqui
       String []pasteles = new String[5]; 
        ListaDobleEnlazada listita = new ListaDobleEnlazada();
        
        for(int i =0 ; i<pasteles.length ; i++){
            pasteles[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del pastel "+i);
            
        }
        
        
        
        for(int i =0 ; i<pasteles.length ; i++){
            listita.insertarNodo(pasteles[i]);
        }
        
        
   // listita.Buscar("Tiramisu");
   listita.ImprimirNodos();
   
    }
}

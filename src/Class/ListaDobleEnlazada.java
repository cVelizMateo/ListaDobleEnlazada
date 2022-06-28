
package Class;

public class ListaDobleEnlazada {
    public Nodo cabeza ; //variable que nos servirà para recorrer la lista de arriba a abajo 
    public Nodo cola ; // variable que nos servirá para reocrrer la lista de abajo a arriba; 
    
    public void insertarNodo(String pastel ){
        //Se valuaran 3 casos comunes de insertado de nodos 
        

            //si la lista está vacìa
        
        if(cabeza==null&&cola ==null){
            cabeza= new Nodo ();
            cola = new Nodo();
            cabeza.setNomPastel(pastel);
            
            cabeza.anterior = null;
            cabeza.siguiente = null;
            
            
        }else{
            //Insert para el segundo nodo ; 
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.setNomPastel(pastel);
            nuevoNodo.siguiente=null;
            if(cabeza.siguiente==null){
                cabeza.siguiente=nuevoNodo;
                nuevoNodo.anterior = cabeza;
                nuevoNodo.siguiente= null;
                cola = nuevoNodo;
            }
            else{
                //para el tercer insert en adelante
                Nodo iterador = cabeza.siguiente;
                boolean insertado = false;
                
                while(iterador!=null && insertado==false){
                    if(iterador.siguiente==null){
                        iterador.siguiente = nuevoNodo;//amarra el ultimo dato en el que va al nuevo nodo
                        nuevoNodo.anterior=iterador;//nuestro dato actual del iterador serà nuestro enlace anterior al nuevo nodo
                        cola = nuevoNodo;//como serà nuestro nuevo nodo en la lista , serà tambien el ultimo o cola 
                        insertado= true;
                    }else{
                        iterador=iterador.siguiente;
                    }
                }
                
            }
        }
    }
    
    
    public void ImprimirNodos(){
        Nodo auxiliar = new Nodo();
        auxiliar = cabeza;
        String datos = "";
        String datos2 = "";
        //para imprimir los nodos hacia adelante 
        System.out.println("Imprimiendo los Nodos hacia adelante : ");
        while(auxiliar!=null){
            datos=datos+"-->"+auxiliar.nomPastel;
            auxiliar=auxiliar.siguiente;
        }
        
        System.out.println(datos);
        
        
        auxiliar = cola;

        System.out.println("Imprimiendo los Nodos hacia atras : ");
        while(auxiliar!=null){
            datos2=datos2+"-->"+auxiliar.nomPastel;
            auxiliar=auxiliar.anterior;
        }
        
        System.out.println(datos2);
    }
    
    public void Buscar (String pastelBuscado){
        Nodo pastelBus = new Nodo();
        pastelBus.setNomPastel(pastelBuscado); 
        Nodo buscador = cabeza;
        boolean encontrado = false ; 
        try{
        while(buscador !=null && encontrado == false){
            if (buscador.nomPastel.equals(pastelBus.nomPastel) ){
                encontrado = true ; 
                System.out.println("Pastel encontrado :"+pastelBus.nomPastel);
                
            } else{
                buscador = buscador.siguiente;
            }
         
        }
        
                if( encontrado ==false){
                    System.out.println("Pastel no encontrado :"+pastelBuscado);
                }
        }
        catch(Exception e ){
            e.printStackTrace();
        }
        
        
    }
}

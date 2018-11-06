

package grafobicicletas;


public class Grafo {
    private int[][]Adyacentes;
    private Object[] Informacion;
    private int nodos;
    private boolean vacio=true;
    
    public Grafo(int numeroNodos){
        Adyacentes= new int [numeroNodos][numeroNodos];
        Informacion= new Object[numeroNodos];
        for(int i=0; i<numeroNodos;i++){
            for(int j=0; j<numeroNodos; j++){
                Adyacentes[i][j]=0;
                
            }
        }
        nodos=numeroNodos;
    }
    
    public boolean EsVacio(){
        return vacio;
    }
}

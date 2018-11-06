
package grafobicicletas;


public class Estacion {
    private int id;
    private String nombre;
    private String fecha;
    private boolean estado;
    
    public Estacion(int id, String nombre, String fecha, String state){
        this.id=id;
        this.nombre=nombre;
        this.fecha=fecha;
        this.estado = state.equals("Active");
    }
    public void setid(int id){
        this.id=id;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setfecha(String fecha){
        this.fecha=fecha;
    }
    public void setestado(boolean estado){
        this.estado=estado;
    }
    public int getid(){
        return id;
    }
    public String getnombre(){
        return nombre;
    }
    public String getfecha(){
        return fecha;
    }
    public boolean getestado(){
        return estado;
    }
    public String toString(){
        return "ID: "+id+ " NOMBRE: "+nombre+" FECHA: "+fecha+ " ESTADO: "+ estado;
    }
}

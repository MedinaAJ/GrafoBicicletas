
package grafobicicletas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrafoBicicletas {
    
    private static final String URL_GRAFO = "metro_station_table.csv";
    private static final String URL_ARISTAS = "MetroBikeShare_2016_Q3_trips.csv";

    public static void main(String[] args) {
        List<Estacion> estaciones =new ArrayList<Estacion>();
        leerGrafo(estaciones);
        ImprimirJugadores(estaciones);
        
    }
    public static void leerGrafo(List<Estacion> estaciones){
        File archivo = new File(URL_GRAFO);
        Scanner data = null;
        int contador=0;
        try{
            data = new Scanner(archivo);
            data.nextLine();
            while(data.hasNextLine()){
                String[] splitted = data.nextLine().split(",");
                estaciones.add(new Estacion(Integer.parseInt(splitted[0]), splitted[1], splitted[2], splitted[3]));
            }
            
        }catch (FileNotFoundException e) {
		contador++;
		if(contador == 2) System.exit(0);
                    System.out.println("El archivo en la ruta ''metro_station_table.csv'' no existe, cambialo.");
            }finally{
                data.close();
            }
    }
     public static void leerAristas(List<Trayecto> trayectos){
        File archivo = new File(URL_ARISTAS);
        Scanner data = null;
        int contador=0;
        try{
            data = new Scanner(archivo);
            data.nextLine();
            while(data.hasNextLine()){
                String[] splitted = data.nextLine().split(",");
                trayectos.add(new Trayecto(Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1]), splitted[2], splitted[3], Integer.parseInt(splitted[4]),Double.parseDouble(splitted[5]),Double.parseDouble(splitted[6]),Integer.parseInt(splitted[7]),Double.parseDouble(splitted[8]),Double.parseDouble(splitted[9]),Integer.parseInt(splitted[10]),Integer.parseInt(splitted[11]),splitted[12],splitted[13]));
            }
            
        }catch (FileNotFoundException e) {
		contador++;
		if(contador == 2) System.exit(0);
                    System.out.println("El archivo en la ruta ''metro_station_table.csv'' no existe, cambialo.");
            }finally{
                data.close();
            }
    }
    private static void ImprimirJugadores(List<Estacion> estaciones) {
        for (int i=0; i<estaciones.size(); i++){
            
            System.out.println(estaciones.get(i).toString());
            
        }
        
        System.out.println("____________________________");
    }
    
}

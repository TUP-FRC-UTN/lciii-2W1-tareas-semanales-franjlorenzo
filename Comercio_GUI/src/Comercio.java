
import java.util.ArrayList;

public class Comercio {
    private ArrayList<Operacion> listaPresentacion;

    public Comercio(){
        this.listaPresentacion = new ArrayList();
    }
    
    public void agregarPresentacion(Operacion cliente){
        listaPresentacion.add(cliente);
    }

    public ArrayList<Operacion> getListaPresentacion() {
        return listaPresentacion;
    }
    
    public int cantReclamos(){
        int contadorReclamos = 0;
        
        for (Operacion operacion : listaPresentacion) {
            if(operacion.getTipoPresentacion().equals("Reclamo")){
                contadorReclamos++;
            }
        }
        return contadorReclamos;
    }
    
    public int cantSugerencias(){
        int contadorSugerencias = 0;
        
        for (Operacion operacion : listaPresentacion) {
            if(operacion.getTipoPresentacion().equals("Sugerencia")){
                contadorSugerencias++;
            }
        }
        return contadorSugerencias;
    }
    
    public int cantSucursalCero(){
        int contadorSucCero = 0;
        
        for (Operacion operacion : listaPresentacion) {
            if(operacion.getSucursal() == 0 && operacion.getTipoPresentacion().equals("Reclamo")){
                contadorSucCero++;
            }
        }
        return contadorSucCero;
    }
}

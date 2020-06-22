
public class Operacion {

    private int numCliente;
    private String tipoPresentacion;
    private int sucursal;
    private String presentacion;

    public Operacion(int numCliente, String tipoPresentacion, int sucursal, String presentacion) {
        this.numCliente = numCliente;
        this.tipoPresentacion = tipoPresentacion;
        this.sucursal = sucursal;
        this.presentacion = presentacion;
    }

    public String getTipoPresentacion() {
        return tipoPresentacion;
    }

    public int getSucursal() {
        return sucursal;
    }

    @Override
    public String toString() {
        if (tipoPresentacion.equals("Consulta")) {
            return "Consulta: Numero de cliente: " + numCliente + ", Sucursal: " + sucursal + ", Presentacion: " + presentacion;
        }
        else if(tipoPresentacion.equals("Reclamo")){
            return "Reclamo: Numero de cliente: " + numCliente + ", Sucursal: " + sucursal + ", Presentacion: " + presentacion;
        }
        else{
            return "Sugerencia: Numero de cliente: " + numCliente + ", Sucursal: " + sucursal + ", Presentacion: " + presentacion;
        }
    }
}

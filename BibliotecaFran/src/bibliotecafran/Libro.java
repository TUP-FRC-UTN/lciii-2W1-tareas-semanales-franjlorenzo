package bibliotecafran;

public class Libro {
    private String titulo;
    private int precio;
    private int estado;
    private Prestamo[] prestamo;
    
    public Libro(String titulo, int precio, int estado, int cantidadPrestamo){
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        this.prestamo = new Prestamo[cantidadPrestamo];
    }
    
    public int getEstado(){
        return estado;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public int cantidadPrestamos(){
        int contador = 0;
        for (int i = 0; i < prestamo.length; i++) {
            if(prestamo[i] != null){
                contador++;
            }
        }
        return contador;
    }
    
    public Libro(int cantidadPrestamo){
        prestamo = new Prestamo[cantidadPrestamo];
    }
    
    public void agregarPrestamo(Prestamo nuevo){
        for (int i = 0; i < prestamo.length; i++) {
            if(prestamo[i] == null){
                prestamo[i] = nuevo;
                break;
            }
        }
    }
    
    public String listadoSolicitantes(){
        return "";
    }
    
}

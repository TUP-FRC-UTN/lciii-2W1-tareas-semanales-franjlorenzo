package veterinaria;

public class Cliente {
    
    int nroCliente;
    String nombre;
    int antiguedad;
    String nombreMascota;
    int edadMascota;

    public Cliente(int nroCliente, String nombre, int antiguedad, String nombreMascota, int edadMascota) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nroCliente=" + nroCliente + ", nombre=" + nombre + ", antiguedad=" + antiguedad + ", nombreMascota=" + nombreMascota + ", edadMascota=" + edadMascota + '}';
    }

    
}

public class Cliente {
    protected String nombre;
    protected int id;
    protected int telefono;

    public Cliente(String nombre, int id, int telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", id=" + id + ", telefono=" + telefono + '}';
    }
    
    
}

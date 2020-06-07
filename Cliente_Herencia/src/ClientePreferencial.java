public class ClientePreferencial extends Cliente {
    private double saldo;
    private double limite_saldo;
    private String domicilio;

    public ClientePreferencial(double saldo, double limite_saldo, String domicilio, String nombre, int id, int telefono) {
        super(nombre, id, telefono);
        this.saldo = saldo;
        this.limite_saldo = limite_saldo;
        this.domicilio = domicilio;
    }
    
    @Override
    public String toString(){
        return "saldo: " + saldo + ", limite: " + limite_saldo + ", domicilio: " + domicilio +
                ", nombre=" + nombre + ", id=" + id + ", telefono=" + telefono + '}';
    }
}

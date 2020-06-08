package empleadoherencia;

public class Vendedor extends Empleado{
    
    private float totalVentas;

    public Vendedor(float totalVentas, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", nombre=" + nombre + ", sueldoBasico=" + sueldoBasico + '}' + "Total ventas: " + totalVentas;
    }
    
    @Override
    public float calcularSueldo(){
        float totalCobrar = sueldoBasico + (totalVentas*0.1f);
        return totalCobrar;
    }
}

package empleadoherencia;

public class Obrero extends Empleado{
    
    private int diasTrabajados;

    public Obrero(int diasTrabajados, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", nombre=" + nombre + ", sueldoBasico=" + sueldoBasico + '}' + "Dias trabajados=" + diasTrabajados;
    }
    
    @Override
    public float calcularSueldo(){
        float totalCobrar = (sueldoBasico / 22) * diasTrabajados;
        return totalCobrar;
    }
    
}

package empleadoherencia;
import java.util.ArrayList;

public abstract class Empleado {
    
    protected int legajo;
    protected String nombre;
    protected float sueldoBasico;

    public Empleado(int legajo, String nombre, float sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public abstract String toString();
    
    public abstract float calcularSueldo();
}

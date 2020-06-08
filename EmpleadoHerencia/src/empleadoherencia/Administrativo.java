package empleadoherencia;

public class Administrativo extends Empleado{
    
    private boolean presentismo;

    public Administrativo(boolean presentismo, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    @Override
    public String toString() {
        if(presentismo){
            return "Empleado{" + "legajo=" + legajo + ", nombre=" + nombre + ", sueldoBasico=" + sueldoBasico + '}' + "Presentismo: Si";
        }
        else{
             return "Empleado{" + "legajo=" + legajo + ", nombre=" + nombre + ", sueldoBasico=" + sueldoBasico + '}' + "Presentismo: No";
        }
    }
    
    @Override
    public float calcularSueldo(){
        float totalCobrar = 0;
        if(presentismo){
            totalCobrar = sueldoBasico*1.13f;
        }
        else{
            totalCobrar = sueldoBasico;
        }
        return totalCobrar;
    }
}

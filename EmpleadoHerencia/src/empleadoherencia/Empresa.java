package empleadoherencia;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Empleado> listaEmpleado;

    public Empresa() {
        this.listaEmpleado = new ArrayList();
    }
    
    public void agregarEmpleado(Empleado empleado){
        listaEmpleado.add(empleado);
    }
    
    public float sueldoTotal(){
        float sueldoTotal = 0;
        for (Empleado empleado : listaEmpleado) {
            sueldoTotal += empleado.calcularSueldo();
        }
        return sueldoTotal;
    }
    
    public float tipoSueldo(int opcion){
        float sueldoTotal = 0;
        for (Empleado empleado : listaEmpleado) {
            float sueldo = empleado.calcularSueldo();
            
            if(opcion == 1 && empleado instanceof Obrero){
                sueldoTotal += sueldo;
            }
            else if(opcion == 2 && empleado instanceof Administrativo){
                sueldoTotal += sueldo;
            }
            else if(opcion == 3 && empleado instanceof Vendedor){
                sueldoTotal += sueldo;
            }
        }
        return sueldoTotal;
    }
    
    public String empleadoMenosPago(){
        String datosEmpleado = "";
        float menorSueldo = 0;
        for (Empleado empleado : listaEmpleado) {
            menorSueldo = empleado.calcularSueldo();
            datosEmpleado = empleado.toString();
            break;
        }
        for (Empleado empleado : listaEmpleado) {
            if(menorSueldo > empleado.calcularSueldo()){
                menorSueldo = empleado.calcularSueldo();
                datosEmpleado = empleado.toString();
                
            }
        }
        return datosEmpleado;
    }
    
    public float promedioSueldoObrero(){
        float totalSueldos = 0;
        float cantidadObreros = 0;
        for (Empleado empleado : listaEmpleado) {
            if(empleado instanceof Obrero){
                cantidadObreros++;
                totalSueldos += empleado.calcularSueldo();
            }
        }
        float promedioSueldos = totalSueldos / cantidadObreros;
        return promedioSueldos;
    }
}

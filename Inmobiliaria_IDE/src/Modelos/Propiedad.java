package Modelos;
import java.util.ArrayList;

public abstract class Propiedad {
    protected String direccion;
    protected int cantHabitaciones;
    protected double precioBase;
    protected boolean usoComercial;
    protected int cantInquilinos;

    public Propiedad(String direccion, int cantHabitaciones, double precioBase, boolean usoComercial, int cantInquilinos) {
        this.direccion = direccion;
        this.cantHabitaciones = cantHabitaciones;
        this.precioBase = precioBase;
        this.usoComercial = usoComercial;
        this.cantInquilinos = cantInquilinos;
    }

    @Override
    public abstract String toString();
    
    
}

package Modelos;

public class Departamento extends Propiedad{
    private double precioExpensas;

    public Departamento(String direccion, int cantHabitaciones, double precioAlquiler, boolean usoComercial, int cantInquilinos, double precioExpensas) {
        super(direccion, cantHabitaciones, precioAlquiler, usoComercial, cantInquilinos);
        this.precioExpensas = precioExpensas;
    }

    @Override
    public String toString() {
        return "Casa: Direccion= " + direccion + " Cant habitaciones: " + cantHabitaciones + " Precio base: " + 
                precioBase + " Uso comercial: " + usoComercial + " Cant inquilinos: " + cantInquilinos + " Precio expensas: " + precioExpensas;
    }

    public double getPrecioExpensas() {
        return precioExpensas;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public int getCantInquilinos() {
        return cantInquilinos;
    }
     
    
}

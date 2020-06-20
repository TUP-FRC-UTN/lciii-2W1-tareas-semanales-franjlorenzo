package Modelos;

public class Casa extends Propiedad{
    private boolean garage;

    public Casa(String direccion, int cantHabitaciones, double precioAlquiler, boolean usoComercial, int cantInquilinos, boolean garage) {
        super(direccion, cantHabitaciones, precioAlquiler, usoComercial, cantInquilinos);
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Casa: Direccion= " + direccion + " Cant habitaciones: " + cantHabitaciones + " Precio base: " + 
                precioBase + " Uso comercial: " + usoComercial + " Cant inquilinos: " + cantInquilinos + " Garage: " + garage;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public int getCantInquilinos() {
        return cantInquilinos;
    }

    public boolean isGarage() {
        return garage;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }
    
    
}

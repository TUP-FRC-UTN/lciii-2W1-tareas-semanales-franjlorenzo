package Modelos;

import java.util.ArrayList;

public class Inmobiliaria {

    private ArrayList<Propiedad> listaPropiedad;

    public Inmobiliaria() {
        this.listaPropiedad = new ArrayList();
    }

    public void agregarPropiedad(Propiedad propiedad) {
        listaPropiedad.add(propiedad);
    }

    public ArrayList<Propiedad> getListaPropiedad() {
        return listaPropiedad;
    }

    public double precioAlquiler() {
        double precioAlquiler = 0;
        for (Propiedad propiedad : listaPropiedad) {
            if (propiedad instanceof Casa) {
                if (((Casa) propiedad).usoComercial) {
                    precioAlquiler = ((Casa) propiedad).precioBase + 1000;
                } else {
                    precioAlquiler = ((Casa) propiedad).precioBase;
                }
            }
            if (propiedad instanceof Departamento) {
                if (((Departamento) propiedad).usoComercial) {
                    precioAlquiler = ((Departamento) propiedad).precioBase + ((Departamento) propiedad).getPrecioExpensas() + 500;
                } else {
                    precioAlquiler = ((Departamento) propiedad).precioBase + ((Departamento) propiedad).getPrecioExpensas();
                }
            }
        }
        return precioAlquiler;
    }

    public float promedio2Inquilinos() {
        float promedioInquilinos = 0;
        int contadorInquilinos = 0;

        for (Propiedad propiedad : listaPropiedad) {
            if (propiedad instanceof Casa) {
                if (!((Casa) propiedad).isUsoComercial() && ((Casa) propiedad).getCantInquilinos() == 2) {
                    contadorInquilinos++;
                    promedioInquilinos += this.precioAlquiler();
                }
            }
            if (propiedad instanceof Departamento) {
                if (!((Departamento) propiedad).isUsoComercial() && ((Departamento) propiedad).getCantInquilinos() == 2) {
                    contadorInquilinos++;
                    promedioInquilinos += this.precioAlquiler();
                }
            }  
        }
        return promedioInquilinos / contadorInquilinos;
    }    

    
    public int cantCasasConHabitacion() {
        int contadorCasas3Habitaciones = 0;
        for (Propiedad propiedad : listaPropiedad) {
            if (propiedad instanceof Casa && ((Casa) propiedad).isGarage() && ((Casa) propiedad).getCantHabitaciones() >= 3) {
                contadorCasas3Habitaciones++;
            }
        }
        return contadorCasas3Habitaciones;
    }

}

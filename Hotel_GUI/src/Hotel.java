
import java.util.ArrayList;

public class Hotel {

    ArrayList<Reserva> listaReservas;

    public Hotel() {
        this.listaReservas = new ArrayList();
    }

    public void agregarReserva(Reserva reserva) {
        listaReservas.add(reserva);
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }
    
    

    public float tarifaReserva() {
        float tarifaTotal = 0;

        for (Reserva reserva : listaReservas) {
            if (reserva instanceof Negocio) {
                tarifaTotal = (500 * ((Negocio) reserva).getDiasReservados()) + 700;
            } else {
                tarifaTotal = (600 * ((Vacaciones) reserva).getDiasReservados()) + (100 * ((Vacaciones) reserva).getCantHijos());
            }
        }
        return tarifaTotal;
    }

    public float tarifaTotal() {
        float tarifaTotal = 0;

        for (Reserva reserva : listaReservas) {
            if (reserva instanceof Negocio) {
                if (((Negocio) reserva).isVigencia()) {
                    tarifaTotal += (500 * ((Negocio) reserva).getDiasReservados()) + 700;

                }
            }
            if (reserva instanceof Vacaciones) {
                if (((Vacaciones) reserva).isVigencia()) {
                    tarifaTotal += (600 * ((Vacaciones) reserva).getDiasReservados()) + (100 * ((Vacaciones) reserva).getCantHijos());

                }
            }
        }
        return tarifaTotal;
    }
    
    public int[] cantReservasTipo(){
        int[] cantReservas = new int[2];
        
        
        for (Reserva reserva : listaReservas) {
            if(reserva instanceof Negocio){
                cantReservas[0]++;
            }
            else{
                cantReservas[1]++;
            }
        }
        return cantReservas;
    }
}
